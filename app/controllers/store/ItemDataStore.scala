package store

/**
 * Author: michal, 23.10.12
 */
object ItemDataStore {
  def allClients(): List[String] = List("client11", "client12", "client3", "client4")
  def allTeams(): List[String] = List("team1", "team2", "team1r", "team2e")
  def allFeatures(): List[String] = List("feature1", "feature2", "feature11", "feature21")
  def allStatuses(): List[String] = List("status1", "status2")
  def allIssueTypes(): List[String] = List("type1", "type2")

}
