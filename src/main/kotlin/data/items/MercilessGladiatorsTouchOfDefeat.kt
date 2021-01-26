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

public class MercilessGladiatorsTouchOfDefeat : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Merciless Gladiator's Touch of Defeat"

  public override var itemLevel: Int = 136

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 238.0

  public override var maxDmg: Double = 443.0

  public override var speed: Double = 1900.0

  public override var stats: Stats = Stats(
      stamina = 15,
      intellect = 13
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(9345, "Increase Spell Dam 16", this)
      )
}
