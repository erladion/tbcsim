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
public class AdamantiteStinger : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33803

  public override var name: String = "Adamantite Stinger"

  public override var itemLevel: Int = 118

  public override var quality: Int = 3

  public override var icon: String = "inv_ammo_arrow_02.jpg"

  public override var inventorySlot: Int = 24

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.PROJECTILE

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.ARROW

  public override var minDmg: Double = 43.0

  public override var maxDmg: Double = 43.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(

      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
