package models.pb.item.info


class StoryPoint(val name: String, val description: String = "") extends PBItemInfo {
  val id: Long = 0

  private[info] def this() = this("")

  def getType = StoryPoint
}

case object StoryPoint extends PBItemInfoType {
  def getDefaultValue = DefaultStoryPoint
  def apply(name: String, description: String = "") = new StoryPoint(name, description)
}

object DefaultStoryPoint extends StoryPoint() {

}