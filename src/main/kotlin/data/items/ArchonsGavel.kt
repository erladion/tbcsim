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

public class ArchonsGavel : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Archon's Gavel"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MACE_1H

  public override var minDmg: Double = 16.299999237060547

  public override var maxDmg: Double = 133.3000030517578

  public override var speed: Double = 1800.0

  public override var stats: Stats = Stats(
      stamina = 24,
      intellect = 25
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2881)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(44759, "Increase Healing 500", this),
      Buffs.byIdOrName(20959, "Increased Mana Regen", this)
      )
}
