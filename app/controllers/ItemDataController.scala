package controllers

import _root_.store.ItemDataStore
import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json
import scala._
import scala.Predef._

/**
 * Author: michal, 15.10.12
 */
object ItemDataController extends Controller {

  def isClient(value: String) = {println("is Client? : " + value.toString() + "\n" + ItemDataStore.allClients.mkString("-")); toJsonAction(ItemDataStore.allClients contains value)}
  def isTeam(value: String) = toJsonAction(ItemDataStore.allTeams contains value)
  def isFeature(value: String) = toJsonAction(ItemDataStore.allFeatures contains value)
  def isStatus(value: String) = toJsonAction(ItemDataStore.allStatuses contains value)
  def isIssueType(value: String) = toJsonAction(ItemDataStore.allIssueTypes contains value)

  def allClients() = toJsonAction(ItemDataStore.allClients())
  def allTeams() = toJsonAction(ItemDataStore.allTeams())
  def allFeatures() = toJsonAction(ItemDataStore.allFeatures())
  def allStatuses() = toJsonAction(ItemDataStore.allStatuses())
  def allIssueTypes() = toJsonAction(ItemDataStore.allIssueTypes())

  def allClientsAsJavaScriptArray() = asJsArrayString(ItemDataStore.allClients())
  def allTeamsAsJavaScriptArray() = asJsArrayString(ItemDataStore.allTeams())
  def allFeaturesAsJavaScriptArray() = asJsArrayString(ItemDataStore.allFeatures())
  def allStatusesAsJavaScriptArray() = asJsArrayString(ItemDataStore.allStatuses())
  def allIssueTypesAsJavaScriptArray() = asJsArrayString(ItemDataStore.allIssueTypes())

  private def asJsArrayString(values: List[String]) = "['" + values.mkString("', '") + "']"
  private def toJsonAction(value: Boolean) = Action{ Ok( Json.toJson(value) ) }
  private def toJsonAction(elements: List[String]) = Action{ Ok( Json.toJson(elements) ) }


}
