package models.pb.item.info


class IssueTracker(val name: String, val description: String = "") extends PBItemInfo with Serializable {
  val id: Long = 0

  def this() = this("")

  def getType = IssueTracker

  override def toString(): String = "IssueTracker (" + id + ") : " + name

}

case object IssueTracker extends PBItemInfoType {
  def getDefaultValue = DefaultIssueTacker
}

object DefaultIssueTacker extends IssueTracker("-") {
}
