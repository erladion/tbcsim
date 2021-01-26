package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class ArchmagesGuile : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Archmage's Guile"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.SWORD_1H

  public override var minDmg: Double = 45.310001373291016

  public override var maxDmg: Double = 145.30999755859375

  public override var speed: Double = 2300.0

  public override var stats: Stats = Stats(
      stamina = 12,
      intellect = 11,
      spellCritRating = 20.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(33490, "Increase Spell Dam 121", this)
      )
}
