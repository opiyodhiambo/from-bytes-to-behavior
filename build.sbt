ThisBuild / scalaVersion     := "3.3.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "adventure"


val AkkaVersion = "2.8.4"

lazy val root = (project in file("."))
  .settings(
    name := "from-bytes-to-behavior",
    libraryDependencies ++=Seq(
    "com.typesafe.akka" %% "akka-actor-typed" % AkkaVersion
    )
  )
