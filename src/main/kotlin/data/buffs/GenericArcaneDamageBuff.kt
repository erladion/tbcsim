package data.buffs

import character.*
import sim.SimIteration

class GenericArcaneDamageBuff(val arcaneDamage: Int) : Buff() {
    override val name: String = "Arcane Damage $arcaneDamage"
    override val durationMs: Int = -1
    override val hidden: Boolean = true

    override fun modifyStats(sim: SimIteration, stats: Stats): Stats {
        return stats.add(Stats(arcaneDamage = arcaneDamage))
    }

    override fun procs(sim: SimIteration): List<Proc> = listOf()
}