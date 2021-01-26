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

public class PillarOfFerocity : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var name: String = "Pillar of Ferocity"

  public override var itemLevel: Int = 141

  public override var itemSet: ItemSet? = null

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.WEAPON

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.STAFF

  public override var minDmg: Double = 136.0

  public override var maxDmg: Double = 293.0

  public override var speed: Double = 3000.0

  public override var stats: Stats = Stats(
      strength = 47,
      stamina = 96
      )

  public override var sockets: List<Socket> = listOf()

  public override var socketBonus: SocketBonus? = null

  public override var buffs: List<Buff> = listOfNotNull(
      Buffs.byIdOrName(44916, "Attack Power - Feral (+1059)", this)
      )
}
