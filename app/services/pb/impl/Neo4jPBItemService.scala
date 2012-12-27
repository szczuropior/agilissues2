package services.pb.impl

import services.pb.PBItemService
import models.pb.item.RichPBItem
import services.issuetracker.{DummyIssueTrackerService, IssueTrackerService}
import models.pb.item.data.IssueTrackerData

/**
 * Author: michal, 25.12.12
 */
object Neo4jPBItemService extends PBItemService {

  def addNewItem(description: String, issueTrackerData: IssueTrackerData): RichPBItem = {
    val pbItem: RichPBItem = RichPBItem(description, issueTrackerData);
    pbItem
  }
}
