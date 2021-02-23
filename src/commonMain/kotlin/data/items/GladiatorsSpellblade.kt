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
public class GladiatorsSpellblade : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 28297

  public override var name: String = "Gladiator's Spellblade"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_26.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 22.31999969482422

  public override var maxDmg: Double = 110.31999969482422

  public override var speed: Double = 1600.0

  public override var stats: Stats = Stats(
      stamina = 28,
      intellect = 18
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(41973, "Increase Spell Dam 199", this)
        )}

}
