import com.typesafe.sbt.SbtNativePackager.packageArchetype

name := """LittleBroker"""

version := "1.3.0"

scalaVersion := "2.11.5"


libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"


enablePlugins(JavaAppPackaging)

packageDescription in Debian := "Little Broker"

maintainer in Debian := "Christopher Helck"

//bashScriptConfigLocation := Some("${app_home}/../conf/jvmopts")

bashScriptExtraDefines += """addJava "-Dmyenv.cfg=${HOME}/.myenv.cfg""""
