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
public class AmaniPunisher : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 33283

  public override var name: String = "Amani Punisher"

  public override var itemLevel: Int = 132

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_32.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 20.1200008392334

  public override var maxDmg: Double = 112.12000274658203

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 30,
      intellect = 21,
      spellHitRating = 20.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(44075, "Increase Spell Dam 217", this)
        )}

}
