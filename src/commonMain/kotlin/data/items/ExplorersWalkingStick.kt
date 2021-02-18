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

public class ExplorersWalkingStick : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 25835

  public override var name: String = "Explorer's Walking Stick"

  public override var itemLevel: Int = 91

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 132.0

  public override var maxDmg: Double = 199.0

  public override var speed: Double = 2300.0

  public override var stats: Stats = Stats(
      stamina = 51
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15819, "Attack Power 68", this),
      Buffs.byIdOrName(23990, "Item - Minor Run Speed", this)
      )
}