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
public class SashOfSerpentra : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27795

  public override var name: String = "Sash of Serpentra"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_belt_13.jpg"

  public override var inventorySlot: Int = 6

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 31,
      intellect = 21,
      spellHitRating = 17.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15715, "Increase Spell Dam 25", this)
        )}

}
