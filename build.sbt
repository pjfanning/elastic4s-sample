name := "elastic4s-sample"

scalaVersion := "2.13.5"

val elastic4sVersion = "7.1.12"

libraryDependencies ++= Seq(
  "com.sksamuel.elastic4s" %% "elastic4s-client-esjava" % elastic4sVersion,
  "org.slf4j" % "slf4j-simple" % "1.7.30",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.1",
  "com.sksamuel.elastic4s" %% "elastic4s-testkit" % elastic4sVersion % Test
)
