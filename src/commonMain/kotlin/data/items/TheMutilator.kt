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
public class TheMutilator : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34952

  public override var name: String = "The Mutilator"

  public override var itemLevel: Int = 146

  public override var quality: Int = 4

  public override var icon: String = "inv_weapon_shortblade_78.jpg"

  public override var inventorySlot: Int = 22

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.DAGGER

  public override var minDmg: Double = 130.0

  public override var maxDmg: Double = 241.0

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 30,
      physicalHitRating = 24.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(15810, "Attack Power 44", this)
        )}

}
