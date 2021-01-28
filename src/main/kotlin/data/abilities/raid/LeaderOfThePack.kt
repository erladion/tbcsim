package data.abilities.raid

import character.Ability
import character.Buff
import character.Proc
import character.Stats
import mechanics.Rating
import sim.SimIteration

class LeaderOfThePack : Ability() {
    companion object {
        const val name = "Leader of the Pack"
    }

    override val id: Int = 17007
    override val name: String = Companion.name
    override fun gcdMs(sim: SimIteration): Int = 0

    val buff = object : Buff() {
        override val name: String = Companion.name
        // Assume the caster is always maintaining this
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        val bonusCritRating = 5.0 * Rating.critPerPct
        override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
            return stats.add(Stats(
                physicalCritRating = bonusCritRating
            ))
        }

        override fun procs(sim: SimIteration): List<Proc> = listOf()
    }

    override fun cast(sim: SimIteration, free: Boolean) {
        sim.addBuff(buff)
    }

    override val baseCastTimeMs: Int = 0
}
