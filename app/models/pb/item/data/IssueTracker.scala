package models.pb.item.data

import models.util.Color


class IssueTracker(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = IssueTracker

  override def toString(): String = "IssueTracker (" + id + ") : " + name

}

case object IssueTracker extends PBItemInfoType {
  def getDefaultValue = DefaultIssueTacker
}

object DefaultIssueTacker extends IssueTracker() {
}
