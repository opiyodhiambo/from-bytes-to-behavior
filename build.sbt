import Dependencies._

ThisBuild / scalaVersion     := "3.3.0"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "adventure"

lazy val root = (project in file("."))
  .settings(
    name := "from-bytes-to-behavior",
    libraryDependencies ++=Seq(
    munit % Test,
    "com.ning" %% "async-http-client", "1.9.40",
    "org.jsoup" %% "jsoup", "1.16.1"
    )
  )
