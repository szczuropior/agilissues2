package services.pb

import models.pb.item.RichPBItem
import models.pb.item.data.IssueTrackerData

trait PBItemService {
  def addNewItem(description: String, issueTrackerData: IssueTrackerData): RichPBItem
}

