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
import kotlin.js.JsExport

@JsExport
public class ExodarLifeStaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30732

  public override var name: String = "Exodar Life-Staff"

  public override var itemLevel: Int = 120

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_draenei_a_03.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 143.8000030517578

  public override var maxDmg: Double = 293.79998779296875

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      intellect = 34
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.BLUE),
      Socket(Color.BLUE),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2865)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42125, "Increase Healing 364", this),
        Buffs.byIdOrName(40231, "Increased Mana Regen", this)
        )}

}
