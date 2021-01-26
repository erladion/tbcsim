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

public class WandOfCleansingLight : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Wand of Cleansing Light"

  public override var itemLevel: Int = 154

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.WAND

  public override var minDmg: Double = 208.0

  public override var maxDmg: Double = 387.0

  public override var speed: Double = 1500.0

  public override var stats: Stats = Stats(
      intellect = 8,
      spirit = 18,
      spellHasteRating = 8.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(3097)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(18032, "Increase Healing 42", this)
      )
}
