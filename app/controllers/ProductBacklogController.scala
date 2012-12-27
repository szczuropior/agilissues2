package controllers

import play.api.mvc.{Controller, Action}
import play.api.Routes

/**
 * Author: michal, 10.11.12
 */
object ProductBacklogController extends Controller {

  def addNewItemToPb(description: String, issueTracker: Int, issueIdInTheTracker: String) = Action {
    println("added new item : " + description);
    Ok
  }

  def pbJavaScriptRoutes() = Action { implicit request =>
    Ok(
      Routes.javascriptRouter("pbJsRoutes")(
        routes.javascript.ProductBacklogController.addNewItemToPb
      )
    ).as("text/javascript");
  }

}
