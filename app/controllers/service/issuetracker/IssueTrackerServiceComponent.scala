package controllers.service.issuetracker

import models.pb.item.info.IssueTracker


trait IssueTrackerServiceComponent {
  def issueTrackerService: IssueTrackerService

  trait IssueTrackerService {
    def getAvailableIssueTrackers(): Array[IssueTracker]
    def getIssueHref(issueTracker: IssueTracker, issueId: String): String
    def getIssueTrackerById(id: Int): IssueTracker
  }
}
