package controllers.service.pb.item

import models.pb.item.RichPBItem
import models.pb.item.data.IssueTrackerData
import controllers.repository.pb.item.PBItemRepositoryComponent

/**
 * Author: michal, 25.12.12
 */
class PBItemsServiceWithRepositoryComponent extends PBItemsServiceComponent {
  this: PBItemRepositoryComponent =>

  def pbItemsService = new RepositoryNeo4jPBItemsService

  class RepositoryNeo4jPBItemsService extends PBItemsService {
    override def addNewItem(description: String, issueTrackerData: IssueTrackerData): RichPBItem = {
      val pbItem: RichPBItem = RichPBItem(description, issueTrackerData);
      pbItem
    }

    def allItems() = pbItemRepository.allPBItems()
  }

}
