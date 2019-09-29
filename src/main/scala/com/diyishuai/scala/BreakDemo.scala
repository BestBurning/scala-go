package com.diyishuai.scala

import java.io.{BufferedReader, InputStreamReader}
import scala.util.control.Breaks._

object BreakDemo {

  def main(args: Array[String]): Unit = {
    val in = new BufferedReader(new InputStreamReader(System.in))
    breakable {
      while(true){
        println("? ")
        if (in.readLine()=="") break;
      }
    }

  }

}
