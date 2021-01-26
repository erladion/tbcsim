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

public class TruestrikeCrossbow : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Truestrike Crossbow"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CROSSBOW

  public override var minDmg: Double = 138.0

  public override var maxDmg: Double = 207.0

  public override var speed: Double = 2600.0

  public override var stats: Stats = Stats(
      agility = 10,
      stamina = 12,
      intellect = 6
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(9331, "Attack Power 20", this)
      )
}
