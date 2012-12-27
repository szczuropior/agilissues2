package models.pb.item.info

import models.pb.item.data.Color


class Team(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  val id: Long = 0

  def this() = this("")

  def getType = Team
}

case object Team extends PBItemInfoType {
  def getDefaultValue = DefaultTeam
}

object DefaultTeam extends Team() {

}