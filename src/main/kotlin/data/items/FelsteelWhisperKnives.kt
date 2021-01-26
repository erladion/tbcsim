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

public class FelsteelWhisperKnives : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Felsteel Whisper Knives"

  public override var itemLevel: Int = 110

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.THROWN

  public override var minDmg: Double = 134.0

  public override var maxDmg: Double = 135.0

  public override var speed: Double = 2200.0

  public override var stats: Stats = Stats(
      physicalCritRating = 10.0,
      physicalHitRating = 10.0,
      spellCritRating = 10.0,
      spellHitRating = 10.0
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(9331, "Attack Power 20", this)
      )
}
