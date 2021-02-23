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
public class CudgelOfConsecration : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 34611

  public override var name: String = "Cudgel of Consecration"

  public override var itemLevel: Int = 125

  public override var quality: Int = 4

  public override var icon: String = "inv_mace_31.jpg"

  public override var inventorySlot: Int = 21

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 25.479999542236328

  public override var maxDmg: Double = 131.47999572753906

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 20,
      spellHitRating = 18.0
      )

  public override var sockets: Array<Socket> = arrayOf(
      Socket(Color.BLUE)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3153)

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(42040, "Increase Spell Dam 203", this)
        )}

}
