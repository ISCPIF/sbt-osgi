organization := "com.typesafe.sbt"

name := "sbt-osgi"

version := "0.7.0-SNAPSHOT"

libraryDependencies ++= Dependencies.sbtOsgi

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

sbtPlugin := true

publishTo <<= isSnapshot(if(_) Some("Openmole Nexus" at "http://maven.openmole.org/snapshots") else Some("Openmole Nexus" at "http://maven.openmole.org/releases"))

publishMavenStyle := false
