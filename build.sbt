import com.typesafe.sbt.SbtNativePackager.packageArchetype

name := """LittleBroker"""

version := "1.0"

scalaVersion := "2.11.5"


libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"


enablePlugins(JavaAppPackaging)

packageDescription in Debian := "Little Broker"

maintainer in Debian := "Christopher Helck"

bashScriptConfigLocation := Some("${app_home}/../conf/jvmopts")

bashScriptExtraDefines += """addJava "-Dconfig.file=${app_home}/../conf/myenv.cfg""""