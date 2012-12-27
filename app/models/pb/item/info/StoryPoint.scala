package models.pb.item.info

import models.pb.item.data.Color


class StoryPoint(val name: String, val description: String = "", val color: Color = Color.WHITE) extends PBItemInfo {
  val id: Long = 0

  private[info] def this() = this("")

  def getType = StoryPoint
}

case object StoryPoint extends PBItemInfoType {
  def getDefaultValue = DefaultStoryPoint
}

object DefaultStoryPoint extends StoryPoint() {

}