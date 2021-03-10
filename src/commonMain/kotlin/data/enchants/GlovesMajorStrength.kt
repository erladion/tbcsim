package data.enchants

import character.Stats
import data.Constants
import data.model.Enchant
import data.model.Item
import sim.SimIteration
import kotlin.js.JsExport

@JsExport
class GlovesMajorStrength(item: Item) : Enchant(item) {
    override val id: Int = 35442
    override val inventorySlot: Int = Constants.InventorySlot.HANDS.ordinal
    override val name: String = "Major Strength"

    override fun modifyStats(sim: SimIteration): Stats {
        return Stats(
            strength = 15
        )
    }
}