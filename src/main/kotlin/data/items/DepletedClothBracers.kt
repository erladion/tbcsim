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

public class DepletedClothBracers : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Depleted Cloth Bracers"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.MISCELLANEOUS

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.JUNK

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      intellect = 16,
      spellCritRating = 12.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14047, "Increase Spell Dam 23", this),
      Buffs.byIdOrName(40748, "Apexis Crystal Infusion", this)
      )
}
