package `data`.items

import `data`.Constants
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
public class Nightstrike : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34783

  public override var name: String = "Nightstrike"

  public override var itemLevel: Int = 115

  public override var quality: Int = 3

  public override var icon: String = "inv_weapon_shortblade_14.jpg"

  public override var inventorySlot: Int = 25

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.THROWN

  public override var minDmg: Double = 113.0

  public override var maxDmg: Double = 171.0

  public override var speed: Double = 2200.0

  public override var stats: Stats = Stats(
      stamina = 16,
      physicalHitRating = 10.0,
      expertiseRating = 10.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOf()}

}
