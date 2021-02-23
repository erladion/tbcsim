package `data`.items

import `data`.Constants
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
import kotlin.js.JsExport

@JsExport
public class BootsOfTheResilient : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32267

  public override var name: String = "Boots of the Resilient"

  public override var itemLevel: Int = 128

  public override var quality: Int = 4

  public override var icon: String = "inv_boots_plate_06.jpg"

  public override var inventorySlot: Int = 8

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 51,
      defenseRating = 25.0,
      blockRating = 25.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2895)

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
