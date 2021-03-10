package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.model.Item
import `data`.model.ItemSet
import `data`.model.Socket
import `data`.model.SocketBonus
import character.Buff
import character.Stats
import kotlin.Array
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.List
import kotlin.js.JsExport

@JsExport
public class SoulCleaver : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32348

  public override var name: String = "Soul Cleaver"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_axe_60.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.AXE_2H

  public override var minDmg: Double = 386.0

  public override var maxDmg: Double = 579.0

  public override var speed: Double = 3700.0

  public override var stats: Stats = Stats(
      strength = 65,
      stamina = 63
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42109, "Armor Penetration", this)
        )}

}