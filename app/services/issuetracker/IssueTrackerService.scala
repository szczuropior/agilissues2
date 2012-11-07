package services.issuetracker

import models.pb.item.data.IssueTracker


trait IssueTrackerService {
  def getAvailableIssueTrackers(): Array[IssueTracker]
  def getIssueHref(issueTracker: IssueTracker, issueId: String): String
}

object DummyIssueTrackerService extends IssueTrackerService {
  override def getIssueHref(issueTracker: IssueTracker, issueId: String) = "#"
  def getAvailableIssueTrackers() = Array{IssueTracker.getDefaultValue}
}
