package models.pb.item.data

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers


class ColorTest extends FlatSpec with ShouldMatchers {

  "constructor" should "throw exception when empty strhing passed" in {
    evaluating { Color("") } should produce [IllegalArgumentException]
  }

  "constructor" should "construct object when valid rgb value is provided" in {
    val color = Color("1243ff")
    color.color should equal ("1243ff")
  }

  "constructor" should "throw exception when invalid rgb value is provided" in {
    evaluating { Color("1234211") } should produce [IllegalArgumentException]
    evaluating { Color("qwa112") } should produce [IllegalArgumentException]
  }

  "html " should "construct object when valid rgb value is provided" in {
    val color = Color("23af19")
    color.color should equal ("#23af19")
  }


}
