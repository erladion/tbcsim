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

public class SpellstrikeHood : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Spellstrike Hood"

  public override var itemLevel: Int = 105

  public override var itemSet: ItemSet? = ItemSets.byId(559)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.CLOTH

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 16,
      intellect = 12,
      spellCritRating = 24.0,
      spellHitRating = 16.0
      )

  public override var sockets: List<Socket> = listOf(
      Socket(Color.BLUE),
      Socket(Color.YELLOW),
      Socket(Color.RED)
      )

  public override var socketBonus: SocketBonus? = SocketBonuses.byId(2868)

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(28264, "Increase Spell Dam 46", this)
      )
}