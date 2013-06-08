package samples

import net.liftweb.json._

@org.junit.runner.RunWith(classOf[org.scalatest.junit.JUnitRunner])
class HelloJsonTest extends org.scalatest.FlatSpec {

  "lift-json" should "behaive" in {
    val data = """{"hello":"json"}"""
    val json = parse(data)
    assert(json.toString === "JObject(List(JField(hello,JString(json))))")
  }

}
