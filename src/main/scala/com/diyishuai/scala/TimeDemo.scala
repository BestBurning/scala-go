package com.diyishuai.scala

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

import org.joda.time.DateTimeZone


object TimeDemo {


  def main(args: Array[String]): Unit = {

    val now = System.currentTimeMillis()
    val timeZones = List(
      "Etc/GMT",
      "Etc/GMT+1",
      "Etc/GMT+2",
      "Etc/GMT+3",
      "Etc/GMT+4",
      "Etc/GMT+5",
      "Etc/GMT+6",
      "Etc/GMT+7",
      "Etc/GMT+8",
      "Etc/GMT+9",
      "Etc/GMT+10",
      "Etc/GMT+11",
      "Etc/GMT-1",
      "Etc/GMT-2",
      "Etc/GMT-3",
      "Etc/GMT-4",
      "Etc/GMT-5",
      "Etc/GMT-6",
      "Etc/GMT-7",
      "Etc/GMT-8",
      "Etc/GMT-9",
      "Etc/GMT-10",
      "Etc/GMT-11",
      "Etc/GMT-12",
      "Etc/GMT-13",
      "Etc/GMT-14"
    )
    println(now)
    val date = new Date()
    val sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    timeZones.map(timeZone => {
      sdf.setTimeZone( DateTimeZone.forID(timeZone).toTimeZone)
      val str = sdf.format(date)
      println(timeZone+"|"+ str)
    })

  }
}
