package data.model

import character.Buff
import character.Stats
import data.Constants
import kotlin.js.JsExport

@JsExport
abstract class Item {
    // Flag for ItemGen - all generated Items will have this set to true
    // If an item is manually edited, set this to false to prevent future ItemGen runs from overwriting
    abstract var isAutoGenerated: Boolean

    // Item attributes
    abstract var id: Int
    abstract var name: String
    open var displayName: String? = null
        get() = field ?: name
    abstract var itemLevel: Int
    abstract var quality: Int
    abstract var icon: String
    abstract var itemSet: ItemSet?

    abstract var inventorySlot: Int
    var equippedSlot: String = ""

    // TODO: Validate itemSubclass is indeed a subclass of the itemClass
    abstract var itemClass: Constants.ItemClass?
    abstract var itemSubclass: Constants.ItemSubclass?
    open var allowableClasses: Array<Constants.AllowableClass>? = null

    // TODO: This assumes physical damage types for items
    // TODO: Multiple damage types
    abstract var minDmg: Double
    abstract var maxDmg: Double
    abstract var speed: Double

    // Stats
    abstract var stats: Stats

    // Sockets
    abstract var sockets: Array<Socket>
    abstract var socketBonus: SocketBonus?

    open val socketBonusActive: Boolean
        get() {
            return sockets.all {
                it.matches()
            }
        }

    // Granted buffs and effects
    open val buffs: List<Buff> by lazy { listOf() }

    var enchant: Enchant? = null
    var temporaryEnhancement: TempEnchant? = null

    // Helpers
    open val avgDmg: Double
        get() { return (minDmg + maxDmg) / 2.0 }
    open val dps: Double
        get() { return avgDmg / (speed / 1000.0) }
    val uniqueName: String
        get() { return name + equippedSlot }
}
