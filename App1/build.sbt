name := """App1"""

version := "2.3-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

resolvers+=Resolver.mavenLocal

libraryDependencies ++= Seq(
cache,
filters,
javaJpa.exclude("org.hibernate.javax.persistence", "hibernate-jpa-2.0-api"),
  "org.webjars" % "bootstrap" % "3.1.1",
  "org.webjars" % "jquery" % "2.1.0-2",
  "org.webjars" % "requirejs" % "2.1.11-1",
  // Test dependencies
  "org.webjars" % "rjs" % "2.1.11-1-trireme" % "test",
  "org.webjars" % "squirejs" % "0.1.0" % "test",
  "com.samples" % "sample" % "0.0.1-SNAPSHOT"
)

// JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

MochaKeys.requires += "./Setup"

// Apply RequireJS optimization, digest calculation and gzip compression to assets
pipelineStages := Seq(rjs, digest, gzip)
