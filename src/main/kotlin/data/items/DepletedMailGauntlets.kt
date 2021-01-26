package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class DepletedMailGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Depleted Mail Gauntlets"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.MISCELLANEOUS

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.JUNK

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 11,
      intellect = 27
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2863)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15814, "Attack Power 56", this),
      Buffs.byIdOrName(40753, "Apexis Crystal Infusion", this)
      )
}
