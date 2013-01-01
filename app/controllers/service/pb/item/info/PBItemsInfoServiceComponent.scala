package controllers.service.pb.item.info

import models.pb.item.info._

trait PBItemsInfoServiceComponent {
  def pbPBItemsInfoService: PBItemsInfoService

  trait PBItemsInfoService {
    def allClients(): Array[Client]
    def allTeams(): Array[Team]
    def allFeatures(): Array[Feature]
    def allStatuses(): Array[Status]
    def allIssueTypes(): Array[IssueType]
  }
}
