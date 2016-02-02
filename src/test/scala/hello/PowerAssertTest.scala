package hello

import org.scalatest.{FlatSpec, DiagrammedAssertions}

class PowerAssertTest extends FlatSpec with DiagrammedAssertions {

  "hello" should "say hello" in {
    assert(Main.hello("scalatest") === "hello scalatest")
  }
}
