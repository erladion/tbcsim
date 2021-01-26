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

public class BreechesOfTheAvatar : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Breeches of the Avatar"

  public override var itemLevel: Int = 133

  public override var itemSet: ItemSet? = ItemSets.byId(665)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 37,
      intellect = 36,
      spirit = 27
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3151)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(31941, "Increase Healing 101", this),
      Buffs.byIdOrName(21635, "Increased Mana Regen", this)
      )
}
