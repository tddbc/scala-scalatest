name := "train2013-ad-katzchang"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalaj" %% "scalaj-collection" % "1.2"

libraryDependencies += "net.liftweb" %% "lift-json" % "2.5-M4"

libraryDependencies += "junit" % "junit" % "4.11" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"
