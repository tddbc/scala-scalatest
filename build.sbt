lazy val root = (project in file(".")).
  settings(
    name := "scala-scalatest",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.12.2"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
