name := "SparkExcercise"
version := "0.1"
scalaVersion := "2.12.10"

// https://mvnrepository.com/artifact/org.apache.spark/spark-core
libraryDependencies += "org.apache.spark" %% "spark-core" % "3.1.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-sql
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.1.1"

//scala unit test
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
