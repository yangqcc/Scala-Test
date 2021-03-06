
lazy val root = (project in file("."))
  .settings(
    name := "scala_test",
    scalaVersion := "2.12.1",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion
    ),
    libraryDependencies += "org.apache.kafka" % "kafka_2.12" % "0.10.1.1",
    libraryDependencies += "org.scalatest" % "scalatest_2.12" % "3.0.1" % "test",
    libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.6"
  )

lazy val akkaVersion = "2.5.2"

lazy val kafkaVersion = "0.10.1.1"





