package com.diyishuai.scala.cases

import scala.util.Random

object CaseDemo2 extends App {

  val arr = Array("str", 1, -2.0, CaseDemo2)
  val elem = arr(Random.nextInt(arr.length))

  /**
    * 类型匹配
    */
  elem match {
    case x: Int => println("Int : " + x)
    case y: Double if(y >= 0) => println("Double : " + y)
    case z: String => println("String : " + z)
    case _ => throw new Exception("没这类型")
  }


}
