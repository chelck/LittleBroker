package com.ebs

import java.io.File

import com.typesafe.config.ConfigFactory

object LittleBroker {
  def main(args: Array[String]): Unit = {

    println("myenv.cfg: " + System.getProperty("myenv.cfg"))
    
    val conf = Option(System.getProperty("myenv.cfg"))
      .map(new File(_))
      .map(ConfigFactory.parseFile(_))
      .getOrElse(ConfigFactory.empty)
      .withFallback(ConfigFactory.load("phase2.conf"))

    val song =
      s"""|Broker: ${conf.getString("md")}
          |Region: ${conf.getString("region")}
          |Side: ${conf.getString("side")}
          |LogicalIp: ${conf.getString("logicalIp")}
          |IsIceberg: ${conf.getBoolean("isIceberg")}
          |IsDirect: ${conf.getBoolean("isDirect")}
    """.stripMargin

    println(song)
  }
}
