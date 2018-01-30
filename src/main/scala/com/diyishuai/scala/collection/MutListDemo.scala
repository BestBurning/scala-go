package com.diyishuai.scala.collection

import scala.collection.mutable.ListBuffer

object MutListDemo {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer[Int](1,2,3)
    val list2 = new ListBuffer[Int]
    println(list)
    list += 4
    println(list)
    list.append(5)
    println(list)
    list ++= list2
    println(list)

    val list3 = list ++ list2
    println(list3)

    val list4 = list :+ 6
    println(list4)


  }
}
