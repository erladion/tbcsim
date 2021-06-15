package character.classes.priest.talents

import character.Buff
import character.Stats
import character.Talent
import sim.SimParticipant

class SpiritOfRedemption(currentRank: Int) : Talent(currentRank) {
    companion object {
        const val name = "Spirit Of Redemption"
    }
    override val name: String = Companion.name
    override val maxRank: Int = 1

    val buff = object : Buff() {
        override val name: String = Companion.name
        override val durationMs: Int = -1
        override val hidden: Boolean = true

        override fun modifyStats(sp: SimParticipant): Stats {
            return Stats(spiritMultiplier = 1.0 + (currentRank * 0.05))
        }
    }

    override fun buffs(sp: SimParticipant): List<Buff> = listOf(buff)
}
