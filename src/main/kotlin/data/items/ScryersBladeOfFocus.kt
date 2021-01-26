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

public class ScryersBladeOfFocus : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Scryer's Blade of Focus"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 18.760000228881836

  public override var maxDmg: Double = 129.75999450683594

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 42,
      intellect = 28
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(43455, "Increase Spell Dam 247", this)
      )
}
