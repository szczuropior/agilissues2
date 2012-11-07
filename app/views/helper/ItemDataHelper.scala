package views.helper

import scala.Array
import models.pb.item.data.PBItemInfo


//TODO this class was used by wicket views, check whether it is needed after switching to play framework!

object ItemDataHelper extends Serializable {
  def generateNewElementLinkId(elementType: String, id: Long) = "newElementLink_" + elementType + id.toString()

  def getFilteredValues(allValues: Array[PBItemInfo], pattern: String): Iterator[PBItemInfo] =
    getFilteredPBItemInfoElts(allValues, pattern).iterator

  def getFilteredTextValues(allValues: Array[PBItemInfo], pattern: String): Iterator[String] =
    getFilteredPBItemInfoElts(allValues, pattern).map(_.name).iterator

  def validate(allValues: Array[PBItemInfo], pattern: String) =
    (pattern == null || pattern.length == 0) || (allValues.map(_.name) contains pattern) //pattern happens to be null!

  private def getFilteredPBItemInfoElts(allValues: Array[PBItemInfo], pattern: String) =
    allValues.filter(_.name contains pattern)
}