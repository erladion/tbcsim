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

public class PrimalMoonclothBelt : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Primal Mooncloth Belt"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(554)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      intellect = 12,
      spirit = 11
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2863)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18048, "Increase Healing 81", this),
      Buffs.byIdOrName(18378, "Increased Mana Regen", this)
      )
}
