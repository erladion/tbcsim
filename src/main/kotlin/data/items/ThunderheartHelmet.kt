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

public class ThunderheartHelmet : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Thunderheart Helmet"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = ItemSets.byId(678)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 42,
      intellect = 42,
      spirit = 28
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE),
      Socket(Color.META)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2872)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(37952, "Increase Healing 117", this),
      Buffs.byIdOrName(21629, "Increased Mana Regen", this)
      )
}
