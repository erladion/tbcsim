package character.classes.warrior.talents

import character.Buff
import character.Stats
import character.Talent
import data.Constants
import data.model.Item
import mechanics.Rating
import sim.SimIteration

class PoleaxeSpec(currentRank: Int) : Talent(currentRank) {
    companion object {
        const val name = "Poleaxe Specialization"
    }

    override val name: String = Companion.name
    override val maxRank: Int = 5

    private fun isPoleaxe(item: Item): Boolean {
        return item.itemSubclass == Constants.ItemSubclass.AXE_2H ||
               item.itemSubclass == Constants.ItemSubclass.AXE_1H ||
               item.itemSubclass == Constants.ItemSubclass.POLEARM
    }

    val buff = object : Buff() {
        override val name: String = Companion.name
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sim: SimIteration): Stats {
            // This doesn't account for dual-wielding different weapon types, since Fury should never take this
            return if(isPoleaxe(sim.subject.gear.mainHand)) {
                val critPct = 1.0 * currentRank
                return Stats(physicalCritRating = critPct * Rating.critPerPct)
            } else Stats()
        }
    }

    override fun buffs(sim: SimIteration): List<Buff> = listOf(buff)
}