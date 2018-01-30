package com.diyishuai.scala.collection

import scala.collection.mutable

object MutSet {
  def main(args: Array[String]): Unit = {
    val set = new mutable.HashSet[Int]()
    println(set)
    set.add(1)
    println(set)
    set += 2
    println(set)
    set ++= Set(1,2,3)
    println(set)
    set -= 3
    println(set)
    set.remove(2)
    println(set)
  }
}
