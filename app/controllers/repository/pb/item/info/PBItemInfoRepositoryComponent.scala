package controllers.repository.pb.item.info

import models.pb.item.info._

/**
 * Author: michal, 23.10.12
 */
trait PBItemInfoRepositoryComponent {
  def pbItemInfoStore: PBItemInfoRepository

  trait PBItemInfoRepository {
    def allClients(): Array[Client]
    def allTeams(): Array[Team]
    def allFeatures(): Array[Feature]
    def allStatuses(): Array[Status]
    def allIssueTypes(): Array[IssueType]
  }
}
