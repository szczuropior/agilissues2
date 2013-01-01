package controllers.repository.pb.item.info

import models.pb.item.info._

trait DummyPBItemInfoRepositoryComponent extends PBItemInfoRepositoryComponent{
  def pbItemInfoStore = new DummyPBItemInfoRepository

  class DummyPBItemInfoRepository extends PBItemInfoRepository {
    def allClients(): Array[Client] = Array(Client("client11"), Client("client12"), Client("client3"), Client("client4"))
    def allTeams(): Array[Team] = Array(Team("team1"), Team("team2"), Team("team1r"), Team("team2e"))
    def allFeatures(): Array[Feature] = Array(Feature("feature1"), Feature("feature2"), Feature("feature11"), Feature("feature21"))
    def allStatuses(): Array[Status] = Array(Status("status1"), Status("status2"))
    def allIssueTypes(): Array[IssueType] = Array(IssueType("type1"), IssueType("type2"))
  }
}
