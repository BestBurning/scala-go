package com.diyishuai.scala.collection

import scala.collection.immutable.HashSet

object SetDemo {

  def main(args: Array[String]): Unit = {
    val set = new HashSet[Int]()
    println(set)
    val set2 = set +4
    println(set2)
    val set3 = set ++ Set(5,6,7)
    println(set3)
    val set0 = Set(1,3,4) ++ set
    println(set0)
    println(set0.getClass)

  }

}
