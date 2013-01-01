package controllers.manager

import controllers.service.pb.item.{PBItemsServiceComponent, PBItemsServiceWithRepositoryComponent}
import controllers.service.pb.item.info.{PBItemsInfoServiceComponent, PBItemsInfoServiceWithRepositoryComponent}
import controllers.repository.pb.item.info.DummyPBItemInfoRepositoryComponent
import controllers.repository.pb.item.DummyPBItemRepositoryComponent

/**
 * Manages all(?) services within the application.
 */
object ServiceManager {
  val pbItemsServiceComponent: PBItemsServiceComponent =
    new PBItemsServiceWithRepositoryComponent with DummyPBItemRepositoryComponent
  val pbItemsInfoServiceComponent: PBItemsInfoServiceComponent =
    new PBItemsInfoServiceWithRepositoryComponent with DummyPBItemInfoRepositoryComponent

  val pbItemsService: pbItemsServiceComponent.PBItemsService = pbItemsServiceComponent.pbItemsService
  val pbItemsInfoService: pbItemsInfoServiceComponent.PBItemsInfoService = pbItemsInfoServiceComponent.pbPBItemsInfoService
}
