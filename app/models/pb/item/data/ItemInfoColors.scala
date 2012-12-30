package models.pb.item.data

import models.pb.item.info.PBItemInfo
import scala.collection.immutable.Map

class ItemInfoColors(val colors: Map[PBItemInfo, Color]) {
  private val DEFAULT_COLOR = Color("DBCBC6")

   def get(info: PBItemInfo): Color = colors.get(info).getOrElse(DEFAULT_COLOR)
   def apply(info: PBItemInfo) = get(info)

}
