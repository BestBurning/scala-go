package com.diyishuai.scala

import java.text.SimpleDateFormat
import java.util.{Date, TimeZone}

import org.joda.time.format.DateTimeFormat
import org.joda.time.{DateTime, DateTimeZone, Interval}


object TimeDemo {


  def main(args: Array[String]): Unit = {
//    val startDay = DateTime.now().minusHours(1).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0)
//
//    println(startDay.toDateTimeISO.toString())
//    val now = System.currentTimeMillis()
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
//    println(now)
//    val date = new Date()
//    val sdf =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
//    timeZones.map(timeZone => {
//      sdf.setTimeZone( DateTimeZone.forID(timeZone).toTimeZone)
//      val str = sdf.format(date)
//      println(timeZone+"|"+ str)
//    })
//    val itvl = "2018-12-18/2018-12-19";
    val itvl = "2019-01-09T00:00:00.000+08:00/2019-01-10T00:00:00.000+08:00";
        timeZones.map(timeZone => {
          val tz= timeZonewithId(Some(timeZone))
          println(tz.toString+"|||| "+intervalWithTimeZone(itvl,tz))
        })
val map = "2018-12-18".groupBy(x => x).map(y => (y._1, y._2.length))
//   println(map(":".last))
//    println(new DateTime().minusDays(90).toString())

  }

  def timeZonewithId(timeZoneId:Option[String]): DateTimeZone ={
    if(timeZoneId.getOrElse("cn") != "cn")
      DateTimeZone.forID(timeZoneId.get)
    else
      DateTimeZone.forID("Asia/Shanghai")

  }

  def intervalWithTimeZone(interval:String,timeZone: DateTimeZone): String ={

    val intervalArray = interval.split("/")
    val startDate = getDateWithStr(intervalArray(0),timeZone)
    val endDate = getDateWithStr(intervalArray(1),timeZone)
    val newInterval = new Interval(startDate, endDate)
    newInterval.toString
  }

  def formatRepDateWithDate(date: Date,timeZone: TimeZone): String ={
    val sdf =  new SimpleDateFormat("yyyy-MM-dd")
    sdf.setTimeZone(timeZone)
    sdf.format(date)
  }

  def getDateWithStr(dateStr: String,timeZone: DateTimeZone): DateTime= {
//    if (dateStr)
//    val pattern =
      val map = dateStr.groupBy(x => x).map(y => (y._1, y._2.length))
      val pattern = map.get(":".last) match {
        case Some(num) => num match{
          case 2 => "yyyy-MM-dd'T'HH:mm:ssZ"
          case _ => "yyyy-MM-dd'T'HH:mm:ss.SSSZ"
        }
        case None => "yyyy-MM-dd"
      }
    val formatter = DateTimeFormat.forPattern(pattern).withZone(timeZone)
    DateTime.parse(dateStr,formatter)

  }
}
