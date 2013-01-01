package controllers.service.pb.item.info

import controllers.repository.pb.item.info.PBItemInfoRepositoryComponent

class PBItemsInfoServiceWithRepositoryComponent extends PBItemsInfoServiceComponent {
  this: PBItemInfoRepositoryComponent =>

  def pbPBItemsInfoService = new PBItemsInfoServiceWithRepository

  class PBItemsInfoServiceWithRepository extends PBItemsInfoService {
    def allClients() = pbItemInfoStore.allClients()
    def allTeams() = pbItemInfoStore.allTeams()
    def allFeatures() = pbItemInfoStore.allFeatures()
    def allStatuses() = pbItemInfoStore.allStatuses()
    def allIssueTypes() = pbItemInfoStore.allIssueTypes()
  }
}
