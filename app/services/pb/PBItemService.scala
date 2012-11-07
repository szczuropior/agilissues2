package services.pb

import models.pb.item.PBItem
import models.pb.item.data.{PBItemInfo, PBItemInfoType}

trait PBItemService {
  def addNewItem(item: PBItem): PBItem
  def getAllValuesForTheDataType(dataType: PBItemInfoType): Array[PBItemInfo]
  def getAllTextValuesForTheInfoType(infoType: PBItemInfoType): Array[String]
  def addNewValueForTheItemDataType(infoType: PBItemInfoType, value: String, description: String): PBItemInfo
  def getPBItems(limit: Int, firstItem: PBItem = null): Array[PBItem]
  def findItemInfoByValue(textValue: String, infoType: PBItemInfoType): Option[PBItemInfo]
  def updateItemInformation(item: PBItem, newValue: PBItemInfo): Boolean
}

