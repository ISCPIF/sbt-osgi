organization := "fr.iscpif"

name := "sbt-osgi"

version := "0.5.2"

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

credentials += Credentials(Path.userHome / ".sbt" / "openmole.credentials")

publishMavenStyle := true
