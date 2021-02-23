package `data`.items

import `data`.Constants
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
public class SearingSunblade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 29275

  public override var name: String = "Searing Sunblade"

  public override var itemLevel: Int = 110

  public override var quality: Int = 4

  public override var icon: String = "inv_knife_1h_stratholme_d_03.jpg"

  public override var inventorySlot: Int = 22

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 77.0

  public override var maxDmg: Double = 145.0

  public override var speed: Double = 1300.0

  public override var stats: Stats = Stats(
      agility = 24,
      stamina = 22
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
