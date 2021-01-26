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

public class FeltoothEviscerator : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Feltooth Eviscerator"

  public override var itemLevel: Int = 110

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 83.0

  public override var maxDmg: Double = 156.0

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      physicalCritRating = 22.0,
      spellCritRating = 22.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15806, "Attack Power 34", this)
      )
}
