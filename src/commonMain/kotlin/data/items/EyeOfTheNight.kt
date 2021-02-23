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
public class EyeOfTheNight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 24116

  public override var name: String = "Eye of the Night"

  public override var itemLevel: Int = 114

  public override var quality: Int = 3

  public override var icon: String = "inv_jewelry_necklace_28.jpg"

  public override var inventorySlot: Int = 2

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MISC

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      spellCritRating = 26.0,
      spellHitRating = 16.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(28869, "Spell Penetration 15", this),
        Buffs.byIdOrName(31033, "Eye of the Night", this)
        )}

}
