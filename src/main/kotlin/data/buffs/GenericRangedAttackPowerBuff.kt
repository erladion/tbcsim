package data.buffs

import character.*
import sim.SimIteration

class GenericRangedAttackPowerBuff(val rangedAttackPower: Int) : Buff() {
    override val name: String = "Ranged Attack Power $rangedAttackPower"
    override val durationMs: Int = -1
    override val hidden: Boolean = true

    override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
        return stats.add(Stats(rangedAttackPower = rangedAttackPower))
    }

    override fun procs(sim: SimIteration): List<Proc> = listOf()
}
