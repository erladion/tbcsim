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

public class VengefulGladiatorsStaff : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Vengeful Gladiator's Staff"

  public override var itemLevel: Int = 146

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 90.4000015258789

  public override var maxDmg: Double = 198.39999389648438

  public override var speed: Double = 2000.0

  public override var stats: Stats = Stats(
      strength = 46,
      stamina = 62,
      physicalCritRating = 46.0,
      physicalHitRating = 22.0,
      spellCritRating = 46.0,
      spellHitRating = 22.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(44887, "Attack Power - Feral (+1110)", this)
      )
}
