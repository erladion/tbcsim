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

public class ThunderheartHeadguard : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Thunderheart Headguard"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = ItemSets.byId(677)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 30,
      intellect = 32,
      spirit = 28,
      spellCritRating = 29.0,
      spellHitRating = 13.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2889)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(34760, "Increase Spell Dam 62", this)
      )
}
