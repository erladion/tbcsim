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
public class MedallionOfKarabor : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32649

  public override var name: String = "Medallion of Karabor"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_jewelry_amulet_04.jpg"

  public override var inventorySlot: Int = 2

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.QUEST

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.QUEST

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 49
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
