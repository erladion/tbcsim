package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
import `data`.model.Color
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import `data`.socketbonus.SocketBonuses
import character.Buff
import character.Stats
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public class DemonStalkerShoulderguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Demon Stalker Shoulderguards"

  public override var itemLevel: Int = 120

  public override var itemSet: ItemSet? = ItemSets.byId(651)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 23,
      intellect = 23,
      physicalCritRating = 19.0,
      spellCritRating = 19.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2863)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15810, "Attack Power 44", this),
      Buffs.byIdOrName(21620, "Increased Mana Regen", this)
      )
}
