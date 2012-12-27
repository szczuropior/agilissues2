package models.pb.item.info

import models.pb.item.data.Color


class IssueType(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = IssueType
}


case object IssueType extends PBItemInfoType {
  def getDefaultValue = DefaultIssueType
}


object DefaultIssueType extends IssueType() {

}
