package `data`.items

import `data`.Constants
import `data`.buffs.Buffs
import `data`.itemsets.ItemSets
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

public class BrutalGladiatorsLeatherLegguards : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Brutal Gladiator's Leather Legguards"

  public override var itemLevel: Int = 159

  public override var itemSet: ItemSet? = ItemSets.byId(577)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.LEATHER

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      agility = 40,
      stamina = 74,
      physicalCritRating = 30.0,
      physicalHitRating = 17.0,
      spellCritRating = 30.0,
      spellHitRating = 17.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(14052, "Attack Power 60", this),
      Buffs.byIdOrName(39927, "Armor Penetration 84", this)
      )
}
