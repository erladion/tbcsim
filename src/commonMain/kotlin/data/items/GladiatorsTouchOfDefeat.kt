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
public class GladiatorsTouchOfDefeat : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28320

  public override var name: String = "Gladiator's Touch of Defeat"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_wand_09.jpg"

  public override var inventorySlot: Int = 26

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 223.0

  public override var maxDmg: Double = 414.0

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 11
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(9343, "Increase Spell Dam 14", this)
        )}

}
