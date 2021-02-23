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
public class LightfathomScepter : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 30108

  public override var name: String = "Lightfathom Scepter"

  public override var itemLevel: Int = 141

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_43.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 20.899999618530273

  public override var maxDmg: Double = 135.89999389648438

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 28,
      intellect = 20
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42110, "Increase Healing 443", this),
        Buffs.byIdOrName(21366, "Increased Mana Regen", this)
        )}

}
