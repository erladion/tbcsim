package data.codegen

import character.Stats
import com.fleshgrinder.extensions.kotlin.toUpperCamelCase
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import data.Constants
import data.model.Color
import data.model.Item
import data.model.Socket
import java.io.File
import java.lang.reflect.Modifier

object ItemGen {
    val pkg: String = "data.items"
    val outPath: String = "${System.getProperty("user.dir")}/src/main/kotlin/"

    private fun itemNameToClassName(item: Item): String {
        return item.name.toUpperCamelCase()
    }

    private fun shouldOverwrite(name: String): Boolean {
        return try {
            // Check to see if the class exists and the autoGenerated field is set
            val klass = Class.forName("data.items.$name")
            return klass.getDeclaredMethod("isAutoGenerated").invoke(klass.getDeclaredConstructor().newInstance()) as Boolean
        } catch(e: ClassNotFoundException) {
            true
        }
    }

    private fun renderStats(item: Item): CodeBlock {
        val fields = Class.forName("character.Stats").declaredFields
            .filter { it.name != "Companion" }
            .filter { !it.name.startsWith("$") }
            .filter { !Modifier.isFinal(it.modifiers) }

        // Render all stats constructor params and inject Item values
        val baseStats = Stats()
        val block = fields.mapNotNull {
            val method = Class.forName("character.Stats").getDeclaredMethod("get${it.name.capitalize()}")
            val methodValue = method.invoke(item.stats)

            // Only render non-default values
            if(methodValue == method.invoke(baseStats)) {
                null
            } else {
                CodeBlock.of("%L = %L", it.name, methodValue)
            }
        }.joinToCode(separator = ",\n", prefix = "(\n", suffix = "\n)")

        return CodeBlock.builder()
            .add("%T", Stats::class)
            .add(block)
            .build()
    }

    private fun renderSockets(item: Item): CodeBlock {
        return if(item.sockets.isNotEmpty()) {
            val block = item.sockets.map {
                CodeBlock.of("%T.%L", Color::class, it.color)
            }.joinToCode(separator = ",\n", prefix = "(\n", suffix = "\n)")

            CodeBlock.builder()
                .add("%T", Socket::class)
                .add(block)
                .build()
        } else {
            CodeBlock.builder()
                .add("%L", "listOf()")
                .build()
        }
    }

    fun writeItemClassFile(item: Item) {
        val className = itemNameToClassName(item)
        val itemClass = ClassName(pkg, className)

        if(shouldOverwrite(className)) {
            val file = FileSpec.builder(pkg, className)
                .addType(
                    TypeSpec.classBuilder(className)
                        .superclass(Item::class)
                        .addProperty(
                            PropertySpec.builder("isAutoGenerated", Boolean::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", true)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("name", String::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%S", item.name)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemLevel", Int::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.itemLevel)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemClass", Constants.ItemClass::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%T.%L", Constants.ItemClass::class, item.itemClass)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("itemSubclass", Constants.ItemSubclass::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%T.%L", Constants.ItemSubclass::class, item.itemSubclass)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("minDmg", Double::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.minDmg)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("maxDmg", Double::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.maxDmg)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("speed", Double::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", item.speed)
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("stats", Stats::class)
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderStats(item))
                                .build()
                        )
                        .addProperty(
                            PropertySpec.builder("sockets", LIST.parameterizedBy(ClassName("data.model.Socket", "Socket")))
                                .addModifiers(KModifier.OVERRIDE)
                                .mutable(true)
                                .initializer("%L", renderSockets(item))
                                .build()
                        )
                        .build()
                )
                .build()

            file.writeTo(File(outPath))
        }
    }
}