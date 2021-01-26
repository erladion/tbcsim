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

public class Dirge : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Dirge"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 81.0

  public override var maxDmg: Double = 152.0

  public override var speed: Double = 1400.0

  public override var stats: Stats = Stats(
      physicalCritRating = 20.0,
      spellCritRating = 20.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14049, "Attack Power 40", this)
      )
}
