package models.pb.item.info

trait PBItemInfo extends Serializable {
  val id: Long
  val name: String
  val description: String
  def getType: PBItemInfoType
}

trait PBItemInfoType extends Serializable {
  def getDefaultValue: PBItemInfo
}
