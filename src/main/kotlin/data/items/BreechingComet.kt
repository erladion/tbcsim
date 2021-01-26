package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
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

public class BreechingComet : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Breeching Comet"

  public override var itemLevel: Int = 125

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var minDmg: Double = 167.0

  public override var maxDmg: Double = 312.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      agility = 18,
      stamina = 15
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3114)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14049, "Attack Power 40", this)
      )
}
