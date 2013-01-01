package models.pb.item.info


class IssueType(val name: String, val description: String = "") extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = IssueType
}


case object IssueType extends PBItemInfoType {
  def getDefaultValue = DefaultIssueType
  def apply(name: String, description: String = "") = new IssueType(name, description)
}


object DefaultIssueType extends IssueType() {

}
