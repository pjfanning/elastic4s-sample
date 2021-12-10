name := "elastic4s-sample"

scalaVersion := "2.13.7"

val elastic4sVersion = "7.12.0"

libraryDependencies ++= Seq(
  "com.sksamuel.elastic4s" %% "elastic4s-client-esjava" % elastic4sVersion,
  "org.slf4j" % "slf4j-simple" % "1.7.32",
  "org.apache.logging.log4j" % "log4j-to-slf4j" % "2.15.0",
  "com.sksamuel.elastic4s" %% "elastic4s-testkit" % elastic4sVersion % Test
)
