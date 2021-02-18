package character

import data.buffs.permanent.PermanentBuff
import data.model.Color
import data.model.Item

data class Gear(
    var mainHand: Item = Item(),
    var offHand: Item = Item(),
    var rangedTotemLibram: Item = Item(),
    var ammo: Item = Item(),
    var head: Item = Item(),
    var neck: Item = Item(),
    var shoulders: Item = Item(),
    var back: Item = Item(),
    var chest: Item = Item(),
    var wrists: Item = Item(),
    var hands: Item = Item(),
    var waist: Item = Item(),
    var legs: Item = Item(),
    var feet: Item = Item(),
    var ring1: Item = Item(),
    var ring2: Item = Item(),
    var trinket1: Item = Item(),
    var trinket2: Item = Item()
) {
    fun all(): List<Item> {
        return listOf(
            mainHand,
            offHand,
            rangedTotemLibram,
            ammo,
            head,
            neck,
            shoulders,
            back,
            chest,
            wrists,
            hands,
            waist,
            legs,
            feet,
            ring1,
            ring2,
            trinket1,
            trinket2
        )
    }

    fun buffs(): List<Buff> {
        val buffs = mutableListOf<Buff>()
        all().forEach {
            // Only add dynamic buffs
            buffs.addAll(it.buffs.filter { buff -> buff !is PermanentBuff })

            if(it.enchant != null) {
                buffs.add(it.enchant!!)
            }

            if(it.temporaryEnhancement != null) {
                buffs.add(it.temporaryEnhancement!!)
            }

            // Only meta gems provide dynamic buffs
            it.sockets.forEach { socket ->
                if(socket.color == Color.META && socket.gem != null) {
                    if(metaGemActive()) {
                        buffs.addAll(socket.gem?.buffs ?: listOf())
                    }
                }
            }
        }
        return buffs
    }

    fun totalStats(): Stats {
        val stats = Stats()
        all().forEach {
            stats.add(it.stats)

            // Find any stats that are implemented on the server side by permanent buffs
            it.buffs.filterIsInstance<PermanentBuff>().forEach { pbuff ->
                stats.add(pbuff.permanentStats())
            }

            // Compute stats from sockets
            it.sockets.forEach { socket ->
                if(socket.gem != null) {
                    stats.add(socket.gem!!.stats)
                }
            }

            // Add socket bonuses if active
            if(it.socketBonusActive) {
                if(it.socketBonus != null) {
                    stats.add(it.socketBonus!!.stats)
                }
            }
        }
        return stats
    }

    fun metaGemActive(): Boolean {
        val allSockets = all().flatMap { it.sockets }
        val metaGem = allSockets.find { it.color == Color.META && it.gem != null }?.gem
        return metaGem?.metaActive(allSockets) ?: false
    }
}