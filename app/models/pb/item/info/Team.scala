package models.pb.item.info


class Team(val name: String, val description: String = "") extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = Team
}

case object Team extends PBItemInfoType {
  def getDefaultValue = DefaultTeam
  def apply(name: String, description: String = "") = new Team(name, description)
}

object DefaultTeam extends Team() {

}
