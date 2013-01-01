package controllers.service.pb.item

import models.pb.item.RichPBItem
import models.pb.item.data.IssueTrackerData

trait PBItemsServiceComponent {
  def pbItemsService: PBItemsService

  trait PBItemsService {
    def allItems(): Array[RichPBItem]
    def addNewItem(description: String, issueTrackerData: IssueTrackerData): RichPBItem
  }

}

