lazy val root = (project in file(".")).
  settings(
    name := "scala-scalatest",
    version := "0.1-SNAPSHOT",
    scalaVersion := "2.11.7"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
