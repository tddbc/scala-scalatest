package hello

import org.scalatest.FreeSpec

class MainTest extends FreeSpec {
  "hello main" in {
    assert(Main.hello("scalatest") === "hello scalatest")
  }
}
