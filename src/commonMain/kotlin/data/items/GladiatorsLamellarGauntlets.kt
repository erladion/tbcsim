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
import kotlin.js.JsExport

@JsExport
public class GladiatorsLamellarGauntlets : Item() {
  public override var isAutoGenerated: Boolean = true

  public override var id: Int = 27703

  public override var name: String = "Gladiator's Lamellar Gauntlets"

  public override var itemLevel: Int = 123

  public override var quality: Int = 4

  public override var icon: String = "inv_gauntlets_29.jpg"

  public override var inventorySlot: Int = 10

  public override var itemSet: ItemSet? = ItemSets.byId(582)

  public override var itemClass: Constants.ItemClass? = Constants.ItemClass.ARMOR

  public override var itemSubclass: Constants.ItemSubclass? = Constants.ItemSubclass.PLATE

  public override var minDmg: Double = 0.0

  public override var maxDmg: Double = 0.0

  public override var speed: Double = 0.0

  public override var stats: Stats = Stats(
      stamina = 34,
      intellect = 24,
      spellCritRating = 24.0
      )

  public override var sockets: Array<Socket> = arrayOf()

  public override var socketBonus: SocketBonus? = null

  public override val buffs: List<Buff> by lazy {
        listOfNotNull(
        Buffs.byIdOrName(14127, "Increase Spell Dam 28", this),
        Buffs.byIdOrName(38522, "Increased Flash of Light Crit Chance", this)
        )}

}
