package models.pb.item

import data.IssueTrackerData
import models.pb.item.info._


object RichPBItem {
  def apply(description: String, issueTrackerData: IssueTrackerData) = {
    new RichPBItem(0, description, issueTrackerData.issueTracker, issueTrackerData.issueIdInTheTracker)
  }
}

class RichPBItem private (id: Long, description: String, val issueTracker: IssueTracker,
                      val issueIdInTheTracker: String, itemData: Set[PBItemInfo] = Set.empty[PBItemInfo])
  extends PBItem(id, description) {

  val storyPoints: StoryPoint = getItemInfoValue(StoryPoint).asInstanceOf[StoryPoint]
  val status: Status = getItemInfoValue(Status).asInstanceOf[Status]
  val client: Client = getItemInfoValue(Client).asInstanceOf[Client]
  val team: Team = getItemInfoValue(Team).asInstanceOf[Team]
  val feature: Feature = getItemInfoValue(Feature).asInstanceOf[Feature]
  val issueType: IssueType = getItemInfoValue(IssueType).asInstanceOf[IssueType]

  def setDescription(newDescription: String) = new RichPBItem(id, newDescription, issueTracker, issueIdInTheTracker, itemData)
  def setIssueTracker(newIssueTracker: IssueTracker) = new RichPBItem(id, description, newIssueTracker, issueIdInTheTracker, itemData)
  def setIssueIdInTheTracker(newIssueId: String) = new RichPBItem(id, description, issueTracker, newIssueId, itemData)
  def setStoryPoints(newStoryPoints: StoryPoint) = createPBItemWithChangedInfoValue(newStoryPoints)
  def setStatus(newStatus: Status) = createPBItemWithChangedInfoValue(newStatus)
  def setClient(newClient: Client) = createPBItemWithChangedInfoValue(newClient)
  def setTeam(newTeam: Team) = createPBItemWithChangedInfoValue(newTeam)
  def setFeature(newFeature: Feature) = createPBItemWithChangedInfoValue(newFeature)
  def setIssueType(newIssueType: IssueType) = createPBItemWithChangedInfoValue(newIssueType)

  private def createPBItemWithChangedInfoValue(newVal: PBItemInfo) = {
    new RichPBItem(id, description, issueTracker, issueIdInTheTracker, itemData + newVal)
  }

  private def getItemInfoValue(infoType: PBItemInfoType) = {
    itemData.find(_.getType == infoType).getOrElse(infoType.getDefaultValue)
  }

  override def toString(): String =
    "PB Item : " + description + "[" + issueTracker.toString() + " : #" + issueIdInTheTracker + "] --> " + itemData.mkString("; ")

}
