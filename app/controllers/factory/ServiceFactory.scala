package factories

import services.pb.impl.Neo4jPBItemService
import services.issuetracker.DummyIssueTrackerService

object ServiceFactory {
  val pbItemService = Neo4jPBItemService
  val issueTrackerService = DummyIssueTrackerService
}
