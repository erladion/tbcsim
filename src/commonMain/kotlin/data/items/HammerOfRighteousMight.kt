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
public class HammerOfRighteousMight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 32854

  public override var name: String = "Hammer of Righteous Might"

  public override var itemLevel: Int = 105

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_41.jpg"

  public override var inventorySlot: Int = 17

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_2H

  public override var minDmg: Double = 93.80000305175781

  public override var maxDmg: Double = 185.8000030517578

  public override var speed: Double = 2100.0

  public override var stats: Stats = Stats(
      stamina = 55,
      intellect = 37
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(37542, "Increase Spell Dam 168", this),
        Buffs.byIdOrName(21643, "Increased Mana Regen", this)
        )}

}
