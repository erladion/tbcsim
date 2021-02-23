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
import kotlin.js.JsExport

@JsExport
public class AmaniVenomAxe : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27424

  public override var name: String = "Amani Venom-Axe"

  public override var itemLevel: Int = 103

  public override var quality: Int = 3

  public override var icon: String = "inv_axe_15.jpg"

  public override var inventorySlot: Int = 13

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_1H

  public override var minDmg: Double = 101.0

  public override var maxDmg: Double = 188.0

  public override var speed: Double = 2300.0

  public override var stats: Stats = Stats(
      stamina = 15,
      physicalCritRating = 15.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9334, "Attack Power 26", this)
        )}

}
