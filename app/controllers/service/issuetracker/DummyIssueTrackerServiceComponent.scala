package controllers.service.issuetracker

import models.pb.item.info.IssueTracker

class DummyIssueTrackerServiceComponent extends IssueTrackerServiceComponent {
  def issueTrackerService = new DummyIssueTracker

  class DummyIssueTracker extends IssueTrackerService {
    override def getIssueHref(issueTracker: IssueTracker, issueId: String) = "#"
    override def getAvailableIssueTrackers() = Array{IssueTracker.getDefaultValue}
    override def getIssueTrackerById(id: Int): IssueTracker = IssueTracker.getDefaultValue
  }
}
