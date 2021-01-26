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

public class WickedEdgeOfThePlanes : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Wicked Edge of the Planes"

  public override var itemLevel: Int = 136

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var minDmg: Double = 184.0

  public override var maxDmg: Double = 343.0

  public override var speed: Double = 2700.0

  public override var stats: Stats = Stats(
      physicalCritRating = 23.0,
      spellCritRating = 23.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(9333, "Attack Power 48", this)
      )
}
