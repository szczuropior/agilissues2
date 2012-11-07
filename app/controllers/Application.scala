package controllers

import play.api._
import libs.json
import play.api.mvc._

object Application extends Controller {
  
//  def index = Action {
//    Ok(views.html.index("Your new application is ready."))
//  }

  def index = Action {
    Ok(views.html.index(Array.empty[String]))
    /*Redirect(routes.Application.productBacklog)*/
  }

  def productBacklog = TODO
  
}