package controllers

import manager.ServiceManager
import play.api.mvc.{Action, Controller}
import play.api.libs.json.Json
import scala._
import scala.Predef._

/**
 * Author: michal, 15.10.12
 */
object ItemDataController extends Controller {

  def isClient(value: String) = {println("is Client? : " + value.toString() + "\n" + ServiceManager.pbItemsInfoService.allClients.mkString("-")); toJsonAction(ServiceManager.pbItemsInfoService.allClients contains value)}
  def isTeam(value: String) = toJsonAction(ServiceManager.pbItemsInfoService.allTeams.map(_.name) contains value)
  def isFeature(value: String) = toJsonAction(ServiceManager.pbItemsInfoService.allFeatures.map(_.name) contains value)
  def isStatus(value: String) = toJsonAction(ServiceManager.pbItemsInfoService.allStatuses.map(_.name) contains value)
  def isIssueType(value: String) = toJsonAction(ServiceManager.pbItemsInfoService.allIssueTypes.map(_.name) contains value)

  def allClients() = toJsonAction(ServiceManager.pbItemsInfoService.allClients().map(_.name))
  def allTeams() = toJsonAction(ServiceManager.pbItemsInfoService.allTeams().map(_.name))
  def allFeatures() = toJsonAction(ServiceManager.pbItemsInfoService.allFeatures().map(_.name))
  def allStatuses() = toJsonAction(ServiceManager.pbItemsInfoService.allStatuses().map(_.name))
  def allIssueTypes() = toJsonAction(ServiceManager.pbItemsInfoService.allIssueTypes().map(_.name))

  def allClientsAsJavaScriptArray() = asJsArrayString(ServiceManager.pbItemsInfoService.allClients().map(_.name))
  def allTeamsAsJavaScriptArray() = asJsArrayString(ServiceManager.pbItemsInfoService.allTeams().map(_.name))
  def allFeaturesAsJavaScriptArray() = asJsArrayString(ServiceManager.pbItemsInfoService.allFeatures().map(_.name))
  def allStatusesAsJavaScriptArray() = asJsArrayString(ServiceManager.pbItemsInfoService.allStatuses().map(_.name))
  def allIssueTypesAsJavaScriptArray() = asJsArrayString(ServiceManager.pbItemsInfoService.allIssueTypes().map(_.name))

  private def asJsArrayString(values: Array[String]) = "['" + values.mkString("', '") + "']"
  private def toJsonAction(value: Boolean) = Action{ Ok( Json.toJson(value) ) }
  private def toJsonAction(elements: Array[String]) = Action{ Ok( Json.toJson(elements) ) }


}
