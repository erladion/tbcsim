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

public class HardKhoriumGoggles : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Hard Khorium Goggles"

  public override var itemLevel: Int = 159

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 86,
      physicalHitRating = 27.0,
      spellHitRating = 27.0,
      defenseRating = 51.0,
      dodgeRating = 35.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.META),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2882)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(30645, "Gas Cloud Tracking", this),
      Buffs.byIdOrName(40273, "Stealth Detection", this),
      Buffs.byIdOrName(12883, "Longsight", this)
      )
}
