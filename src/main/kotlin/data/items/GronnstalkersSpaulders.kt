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

public class GronnstalkersSpaulders : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Gronnstalker's Spaulders"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = ItemSets.byId(669)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 34,
      stamina = 39,
      intellect = 17
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2887)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15819, "Attack Power 68", this),
      Buffs.byIdOrName(40680, "Armor Penetration 126", this)
      )
}
