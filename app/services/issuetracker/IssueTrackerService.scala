package services.issuetracker

import models.pb.item.info.{IssueTracker}


trait IssueTrackerService {
  def getAvailableIssueTrackers(): Array[IssueTracker]
  def getIssueHref(issueTracker: IssueTracker, issueId: String): String
  def getIssueTrackerById(id: Int): IssueTracker
}

object DummyIssueTrackerService extends IssueTrackerService {
  override def getIssueHref(issueTracker: IssueTracker, issueId: String) = "#"
  def getAvailableIssueTrackers() = Array{IssueTracker.getDefaultValue}
  def getIssueTrackerById(id: Int): IssueTracker = IssueTracker.getDefaultValue
}
