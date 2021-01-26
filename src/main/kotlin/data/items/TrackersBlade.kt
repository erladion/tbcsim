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

public class TrackersBlade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Tracker's Blade"

  public override var itemLevel: Int = 141

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 105.0

  public override var maxDmg: Double = 196.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      physicalCritRating = 23.0,
      physicalHitRating = 20.0,
      spellCritRating = 23.0,
      spellHitRating = 20.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(15810, "Attack Power 44", this)
      )
}
