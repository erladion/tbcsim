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

public class StarstalkerLegguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Starstalker Legguards"

  public override var itemLevel: Int = 159

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 57,
      stamina = 49,
      intellect = 24,
      physicalHitRating = 20.0,
      spellHitRating = 20.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.YELLOW),
      Socket(Color.BLUE),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2936)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(40933, "Attack Power 120", this)
      )
}
