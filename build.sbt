name := "elastic4s-sample"

scalaVersion := "2.12.6"

val elastic4sVersion = "6.3.7"

libraryDependencies ++= Seq(
  "com.sksamuel.elastic4s" %% "elastic4s-core" % elastic4sVersion,
  "com.sksamuel.elastic4s" %% "elastic4s-http" % elastic4sVersion,
  "com.sksamuel.elastic4s" %% "elastic4s-embedded" % elastic4sVersion,
  "org.slf4j" % "slf4j-simple" % "1.7.25",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.1",
  "com.sksamuel.elastic4s" %% "elastic4s-testkit" % elastic4sVersion % Test
)
