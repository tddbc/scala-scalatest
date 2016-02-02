package hello

object Main {
  def main(args: String*): Unit = {
    println(hello("scala"))
  }

  def hello(s: String): String = Seq("hello", s).mkString(" ")
}
