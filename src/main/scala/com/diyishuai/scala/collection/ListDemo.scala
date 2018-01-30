package com.diyishuai.scala.collection

object ListDemo {

  def main(args: Array[String]): Unit = {
    /**
      * seq 序列
      */
    val list = List(1,2,3,4,5,6)
    println(list)
    println(list(0))
    list.map(print)
    println()
    println("====")
    val list2 = 0 :: list
    println(list2)

    val list3 = list.::(0)
    println(list3)

    val list4 = 0 +: list
    println(list4)

    val list5 = list.+:(0)
    println(list5)

    val list6 = list :+ 7
    println(list6)

    println("==========")

    val list0 = List(7,8,9)
    val list7 = list ++ list0
    println(list7)

    val list8 = list ++: list0
    println(list8)

  }
}
