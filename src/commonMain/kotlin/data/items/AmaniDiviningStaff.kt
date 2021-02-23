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
public class AmaniDiviningStaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33494

  public override var name: String = "Amani Divining Staff"

  public override var itemLevel: Int = 132

  public override var quality: Int = 4

  public override var icon: String = "inv_staff_08.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 144.24000549316406

  public override var maxDmg: Double = 303.239990234375

  public override var speed: Double = 3200.0

  public override var stats: Stats = Stats(
      stamina = 58,
      intellect = 47,
      spellCritRating = 31.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2889)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44075, "Increase Spell Dam 217", this)
        )}

}
