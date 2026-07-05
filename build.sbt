ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.github.rithesh"
ThisBuild / scalaVersion     := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "uart-chisel",
    
    // Add Chisel compiler plugin and library dependencies
    libraryDependencies ++= Seq(
      "org.chipsalliance" %% "chisel" % "6.2.0",
      "org.scalatest" %% "scalatest" % "3.2.16" % "test"
    ),
    
    // Enable the modern Chisel compiler plugin
    addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % "6.2.0" cross CrossVersion.full),
    
    // Scalac compiler options for clean Chisel hardware generation
    scalacOptions ++= Seq(
      "-language:reflectiveCalls",
      "-deprecation",
      "-feature",
      "-Xcheckinit"
    )
  )
