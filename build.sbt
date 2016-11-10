lazy val commonSettings = Seq(
  organization := "com.shuttleql",
  version := "1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "gandalf",
    libraryDependencies ++= Seq(
      "com.pauldijou" %% "jwt-core" % "0.9.0",
      "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test"
    )
  )