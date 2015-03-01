package com.ebs

import com.typesafe.config.ConfigFactory

object LittleBroker {
  def main(args: Array[String]): Unit = {
    
    val conf = ConfigFactory.load()
    .withFallback(ConfigFactory.load("phase2.conf"))
    //val conf = ConfigFactory.load("user").withFallback(ConfigFactory.load())
    
    println(s"Name1, ${conf.getString("name1")}!")
    println(s"Name2, ${conf.getString("name2")}!")

    println(s"I'm a little broker short and stout!")
  }
}
