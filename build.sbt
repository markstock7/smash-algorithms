name := "SmashAlgorithms"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-deprecation")

// grading libraries
libraryDependencies += "junit" % "junit" % "4.10" % Test
libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.5" % "test"