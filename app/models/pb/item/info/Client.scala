package models.pb.item.info


class Client(val name: String, val description: String = "") extends PBItemInfo {
  def this() = this("")

  val id: Long = 0
  def getType = Client


}

case object Client extends PBItemInfoType {
  def getDefaultValue = DefaultClient
  def apply(name: String, description: String = "") = new Client(name, description)
}

object DefaultClient extends Client()