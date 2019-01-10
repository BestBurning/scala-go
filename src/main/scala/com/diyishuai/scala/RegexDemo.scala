package com.diyishuai.scala

import scala.util.matching.Regex

object RegexDemo {

  def main(args: Array[String]): Unit = {
    val r="[\u4e00-\u9fa5]+:[\u4e00-\u9fa5]+".r
    val values = Seq(0,1,2)
    values.head
    println(values.drop(1).max)


//    val pattern = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0[13578]|1[02])-(0[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2}))$".r
    val pattern = "^((((1[6-9]|[2-9]\\d)\\d{2})-(0[13578]|1[02])-(0[1-9]|[12]\\d|3[01]))|(((1[6-9]|[2-9]\\d)\\d{2})-(0[469]|11)-(0?[1-9]|[12]\\d|30))|(((1[6-9]|[2-9]\\d)\\d{2})-02-(0[1-9]|1\\d|2[0-8]))|(((1[6-9]|[2-9]\\d)[13579][26])-02-29)|(((1[6-9]|[2-9]\\d)[2468][048])-02-29)|(((1[6-9]|[2-9]\\d)0[48])-02-29)|(([13579]6)00-02-29)|(([2468][048])00-02-29)|(([3579]2)00-02-29))$".r
    val str = "2019-01-09T00:00:00.000+08:00"

    println(pattern findFirstIn str)
  }


}