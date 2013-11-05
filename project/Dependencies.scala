import sbt._

object Library {

  // Versions
  val bndVersion = "1.50.0"
  val specs2Version = "1.14"
  val scalaArmVersion = "1.3"

  // Libraries
  val bndLib = "biz.aQute" % "bndlib" % bndVersion
  val specs2 = "org.specs2" %% "specs2" % specs2Version
  val scalaArm = "com.jsuereth" %% "scala-arm" % scalaArmVersion
}

object Dependencies {

  import Library._

  val sbtOsgi = List(
    bndLib,
    scalaArm,
    specs2  % "test"
  )
}
