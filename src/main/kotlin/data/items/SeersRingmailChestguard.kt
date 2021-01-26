package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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

public class SeersRingmailChestguard : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Seer's Ringmail Chestguard"

  public override var itemLevel: Int = 115

  public override var itemSet: ItemSet? = ItemSets.byId(747)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.MAIL

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 34,
      intellect = 22,
      spellCritRating = 18.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.RED),
      Socket(Color.YELLOW),
      Socket(Color.YELLOW)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2951)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(21620, "Increased Mana Regen", this),
      Buffs.byIdOrName(9317, "Increase Healing 31", this)
      )
}
