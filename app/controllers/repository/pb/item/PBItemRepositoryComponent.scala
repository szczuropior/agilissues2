package controllers.repository.pb.item

import models.pb.item.RichPBItem

trait PBItemRepositoryComponent {
  def pbItemRepository: PBItemRepository

  trait PBItemRepository {
     def allPBItems(): Array[RichPBItem]
  }
}
