package models.pb.item

import models.pb.item.data._


object PBItem {
  def apply(id: Long, description: String, issueTracker: IssueTracker, issueIdInTheTracker: String) = {
    new PBItem(id, description, issueTracker, issueIdInTheTracker)
  }
}

class PBItem private (val id: Long, val description: String, val issueTracker: IssueTracker,
                      val issueIdInTheTracker: String, itemData: Set[PBItemInfo] = Set.empty[PBItemInfo])
  extends Serializable {

  val storyPoints: StoryPoint = getItemInfoValue(StoryPoint).asInstanceOf[StoryPoint]
  val status: Status = getItemInfoValue(Status).asInstanceOf[Status]
  val client: Client = getItemInfoValue(Client).asInstanceOf[Client]
  val team: Team = getItemInfoValue(Team).asInstanceOf[Team]
  val feature: Feature = getItemInfoValue(Feature).asInstanceOf[Feature]
  val issueType: IssueType = getItemInfoValue(IssueType).asInstanceOf[IssueType]

  def setDescription(newDescription: String) = new PBItem(id, newDescription, issueTracker, issueIdInTheTracker, itemData)
  def setIssueTracker(newIssueTracker: IssueTracker) = new PBItem(id, description, newIssueTracker, issueIdInTheTracker, itemData)
  def setIssueIdInTheTracker(newIssueId: String) = new PBItem(id, description, issueTracker, newIssueId, itemData)
  def setStoryPoints(newStoryPoints: StoryPoint) = createPBItemWithChangedInfoValue(newStoryPoints)
  def setStatus(newStatus: Status) = createPBItemWithChangedInfoValue(newStatus)
  def setClient(newClient: Client) = createPBItemWithChangedInfoValue(newClient)
  def setTeam(newTeam: Team) = createPBItemWithChangedInfoValue(newTeam)
  def setFeature(newFeature: Feature) = createPBItemWithChangedInfoValue(newFeature)
  def setIssueType(newIssueType: IssueType) = createPBItemWithChangedInfoValue(newIssueType)

  private def createPBItemWithChangedInfoValue(newVal: PBItemInfo) = {
    new PBItem(id, description, issueTracker, issueIdInTheTracker, itemData + newVal)
  }

  private def getItemInfoValue(infoType: PBItemInfoType) = {
    itemData.find(_.getType == infoType).getOrElse(infoType.getDefaultValue)
  }

  override def toString(): String =
    "PB Item : " + description + "[" + issueTracker.toString() + " : #" + issueIdInTheTracker + "] --> " + itemData.mkString("; ")

}
