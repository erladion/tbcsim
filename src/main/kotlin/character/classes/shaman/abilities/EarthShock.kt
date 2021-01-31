package character.classes.shaman.abilities

import character.Ability
import character.Proc
import character.classes.shaman.talents.Concussion
import character.classes.shaman.talents.Convection
import character.classes.shaman.talents.MentalQuickness
import character.classes.shaman.talents.Reverberation
import character.classes.shaman.talents.ShamanisticFocus
import data.Constants
import mechanics.General
import mechanics.Spell
import sim.Event
import sim.SimIteration

class EarthShock : Ability() {
    companion object {
        const val name = "Earth Shock"
    }

    override val id: Int = 25454
    override val name: String = Companion.name

    override val baseCastTimeMs: Int = 0
    override fun cooldownMs(sim: SimIteration): Int {
        val reverberation = sim.subject.klass.talents[Reverberation.name] as Reverberation?
        return 6000 - (reverberation?.shockCooldownReductionAmountMs() ?: 0).toInt()
    }
    override val sharedCooldown: SharedCooldown = SharedCooldown.SHAMAN_SHOCK

    override fun resourceCost(sim: SimIteration): Double {
        val convection = sim.subject.klass.talents[Convection.name] as Convection?
        val cvRed = convection?.lightningAndShockCostReduction() ?: 0.0

        val mq = sim.subject.klass.talents[MentalQuickness.name] as MentalQuickness?
        val mqRed = mq?.instantManaCostReduction() ?: 0.0

        val shFocus = sim.buffs.find { it.name == ShamanisticFocus.name }
        val shfRed = if(shFocus != null) { 0.60 } else 0.0

        return General.resourceCostReduction(535.0, listOf(cvRed, mqRed, shfRed))
    }

    override fun gcdMs(sim: SimIteration): Int = sim.spellGcd().toInt()

    val baseDamage = Pair(658.0, 693.0)
    override fun cast(sim: SimIteration, free: Boolean) {
        val spellPowerCoeff = Spell.spellPowerCoeff(0)
        val school = Constants.DamageType.NATURE

        val concussion = sim.subject.klass.talents[Concussion.name] as Concussion?
        val concussionMod = concussion?.shockAndLightningMultiplier() ?: 1.0

        val damageRoll = Spell.baseDamageRoll(sim, baseDamage.first, baseDamage.second, spellPowerCoeff, school) * concussionMod
        val result = Spell.attackRoll(sim, damageRoll, school)

        sim.logEvent(Event(
            eventType = Event.Type.DAMAGE,
            damageType = school,
            abilityName = name,
            amount = result.first,
            result = result.second,
        ))

        // Proc anything that can proc off Nature damage
        val baseTriggerTypes = listOf(Proc.Trigger.CAST_SHAMAN_SHOCK)
        val triggerTypes = when(result.second) {
            Event.Result.HIT -> listOf(Proc.Trigger.SPELL_HIT, Proc.Trigger.NATURE_DAMAGE)
            Event.Result.CRIT -> listOf(Proc.Trigger.SPELL_CRIT, Proc.Trigger.NATURE_DAMAGE)
            Event.Result.RESIST -> listOf(Proc.Trigger.SPELL_RESIST)
            Event.Result.PARTIAL_RESIST_HIT -> listOf(Proc.Trigger.SPELL_HIT, Proc.Trigger.NATURE_DAMAGE)
            Event.Result.PARTIAL_RESIST_CRIT -> listOf(Proc.Trigger.SPELL_CRIT, Proc.Trigger.NATURE_DAMAGE)
            else -> null
        }

        if(triggerTypes != null) {
            sim.fireProc(baseTriggerTypes + triggerTypes, listOf(), this)
        }
    }
}
