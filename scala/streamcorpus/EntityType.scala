/**
 * generated by Scrooge 3.0.7-SNAPSHOT
 */
package streamcorpus

import com.twitter.scrooge.ThriftEnum

/**
 * Different tagging tools have different strings for labeling the
 * various common entity types.  To avoid ambiguity, we define a
 * canonical list here, which we will surely have to expand over time
 * as new taggers recognize new types of entities.
 *
 * LOC: physical location
 *
 * MISC: uncategorized named entities, e.g. Civil War for Stanford CoreNLP
 */
case object EntityType {
  case object Per extends EntityType {
    val value = 0
    val name = "Per"
  }
  case object Org extends EntityType {
    val value = 1
    val name = "Org"
  }
  case object Loc extends EntityType {
    val value = 2
    val name = "Loc"
  }
  case object MalePronoun extends EntityType {
    val value = 3
    val name = "MalePronoun"
  }
  case object FemalePronoun extends EntityType {
    val value = 4
    val name = "FemalePronoun"
  }
  case object Time extends EntityType {
    val value = 5
    val name = "Time"
  }
  case object Date extends EntityType {
    val value = 6
    val name = "Date"
  }
  case object Money extends EntityType {
    val value = 7
    val name = "Money"
  }
  case object Percent extends EntityType {
    val value = 8
    val name = "Percent"
  }
  case object Misc extends EntityType {
    val value = 9
    val name = "Misc"
  }
  case object Gpe extends EntityType {
    val value = 10
    val name = "Gpe"
  }
  case object Fac extends EntityType {
    val value = 11
    val name = "Fac"
  }
  case object Veh extends EntityType {
    val value = 12
    val name = "Veh"
  }
  case object Wea extends EntityType {
    val value = 13
    val name = "Wea"
  }
  case object Phone extends EntityType {
    val value = 14
    val name = "Phone"
  }
  case object Email extends EntityType {
    val value = 15
    val name = "Email"
  }
  case object Url extends EntityType {
    val value = 16
    val name = "Url"
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * @throws NoSuchElementException if the value is not found.
   */
  def apply(value: Int): EntityType = {
    value match {
      case 0 => Per
      case 1 => Org
      case 2 => Loc
      case 3 => MalePronoun
      case 4 => FemalePronoun
      case 5 => Time
      case 6 => Date
      case 7 => Money
      case 8 => Percent
      case 9 => Misc
      case 10 => Gpe
      case 11 => Fac
      case 12 => Veh
      case 13 => Wea
      case 14 => Phone
      case 15 => Email
      case 16 => Url
      case _ => throw new NoSuchElementException(value.toString)
    }
  }

  /**
   * Find the enum by its integer value, as defined in the Thrift IDL.
   * Returns None if the value is not found
   */
  def get(value: Int): Option[EntityType] = {
    value match {
      case 0 => scala.Some(Per)
      case 1 => scala.Some(Org)
      case 2 => scala.Some(Loc)
      case 3 => scala.Some(MalePronoun)
      case 4 => scala.Some(FemalePronoun)
      case 5 => scala.Some(Time)
      case 6 => scala.Some(Date)
      case 7 => scala.Some(Money)
      case 8 => scala.Some(Percent)
      case 9 => scala.Some(Misc)
      case 10 => scala.Some(Gpe)
      case 11 => scala.Some(Fac)
      case 12 => scala.Some(Veh)
      case 13 => scala.Some(Wea)
      case 14 => scala.Some(Phone)
      case 15 => scala.Some(Email)
      case 16 => scala.Some(Url)
      case _ => scala.None
    }
  }

  def valueOf(name: String): Option[EntityType] = {
    name.toLowerCase match {
      case "per" => scala.Some(EntityType.Per)
      case "org" => scala.Some(EntityType.Org)
      case "loc" => scala.Some(EntityType.Loc)
      case "malepronoun" => scala.Some(EntityType.MalePronoun)
      case "femalepronoun" => scala.Some(EntityType.FemalePronoun)
      case "time" => scala.Some(EntityType.Time)
      case "date" => scala.Some(EntityType.Date)
      case "money" => scala.Some(EntityType.Money)
      case "percent" => scala.Some(EntityType.Percent)
      case "misc" => scala.Some(EntityType.Misc)
      case "gpe" => scala.Some(EntityType.Gpe)
      case "fac" => scala.Some(EntityType.Fac)
      case "veh" => scala.Some(EntityType.Veh)
      case "wea" => scala.Some(EntityType.Wea)
      case "phone" => scala.Some(EntityType.Phone)
      case "email" => scala.Some(EntityType.Email)
      case "url" => scala.Some(EntityType.Url)
      case _ => scala.None
    }
  }
}


/**
 * Different tagging tools have different strings for labeling the
 * various common entity types.  To avoid ambiguity, we define a
 * canonical list here, which we will surely have to expand over time
 * as new taggers recognize new types of entities.
 *
 * LOC: physical location
 *
 * MISC: uncategorized named entities, e.g. Civil War for Stanford CoreNLP
 */
sealed trait EntityType extends ThriftEnum with Serializable