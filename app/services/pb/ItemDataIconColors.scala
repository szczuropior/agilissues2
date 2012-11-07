package services.pb

/**
 * Created by: michal
 * 30.06.12, 09:40
 */

trait ItemDataIconColors {
  def getStatusIconColor(status: String): String
  def getClientIconColor(client: String): String
  def getFeatureIconColor(feature: String): String
  def getTeamIconColor(team: String): String
}
