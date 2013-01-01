package controllers.repository.pb.item

import models.pb.item.data.IssueTrackerData
import models.pb.item.info.IssueTracker

trait DummyPBItemRepositoryComponent extends PBItemRepositoryComponent {
  def pbItemRepository = new DummyPBItemRepository

  class DummyPBItemRepository extends PBItemRepository {
    def allPBItems() = Array(
      models.pb.item.RichPBItem("1111", new IssueTrackerData(IssueTracker.getDefaultValue, "#")),
      models.pb.item.RichPBItem("22222222222222", new IssueTrackerData(IssueTracker.getDefaultValue, "#")),
      models.pb.item.RichPBItem("3333333333333", new IssueTrackerData(IssueTracker.getDefaultValue, "#"))
    )
  }
}
