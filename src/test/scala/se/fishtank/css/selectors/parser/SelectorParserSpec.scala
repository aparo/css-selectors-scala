package se.fishtank.css.selectors
package parser

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class SelectorParserSpec extends FlatSpec with ShouldMatchers {
  "The parser" should "parse all supported selectors" in {
    TestData.SelectorExpected.foreach { case (selector, _) =>
      SelectorParser.parse(selector) match {
        case SelectorParser.Success(selectorGroups) =>
          val str = selectorGroups.mkString(", ")
          str should equal (selector)
        case SelectorParser.Failure(msg) => fail("Parser failure: " + msg)
      }
    }
  }
}
