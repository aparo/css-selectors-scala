package se.fishtank.css.selectors

import org.scalatest.FlatSpec
import org.scalatest.Matchers


class SelectorsSpec extends FlatSpec with Matchers {
  "Querying" should "return the expected number of nodes" in {
    for ((selector, expected) <- TestData.SelectorExpected) {
      Selectors.query(selector, TestData.Html) match {
        case Left(err) => fail(err)
        case Right(result) => result.length should equal (expected)
      }
    }
  }
}
