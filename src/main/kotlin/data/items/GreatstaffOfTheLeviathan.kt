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

public class GreatstaffOfTheLeviathan : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Greatstaff of the Leviathan"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 106.27999877929688

  public override var maxDmg: Double = 196.27999877929688

  public override var speed: Double = 2400.0

  public override var stats: Stats = Stats(
      strength = 39,
      stamina = 36
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(44908, "Attack Power - Feral (+0539)", this)
      )
}
