package models.pb.item.info


class Status(val name: String, val description: String = "") extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = Status
}

case object Status extends PBItemInfoType {
  def getDefaultValue = DefaultStatus
}

object DefaultStatus extends Status() {

}
