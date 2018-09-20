package com.diyishuai.scala.collection

object ListDemo {

  def main(args: Array[String]): Unit = {
    /**
      * seq 序列
      */
    val list = List(1,2,3,4,5,6)
    println(list.map(i => i -> i).toMap)
    println(list(0))
    println(1 :: 2 :: 3 :: 4 :: 5 :: 6 :: Nil)
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
    println("==========")
    println(List()+" | "+Nil)
    val list9 = "aaa" :: "bbbb" :: "ccccc" :: Nil
    println(list9)
    println(list9.count(s => s.length == 4))
    println(list9.drop(2))
    println(list9.dropRight(2))
    println(list9.exists(s=> s=="aaa"))
    println(list9.filter(s=> s.length==4))
    println(list9.forall(s => s.endsWith("b")))
    list9.foreach(s=> print(s))
    println()
    list9.foreach(print)
    println()
    println(list9.head)
    println(list9.init)
    println(list9.isEmpty)
    println(list9.last)
    println(list9.length)
    println(list9.map(s => s+"y"))
    println(list9.mkString(". "))
    println(list9.filterNot(s=> s.length == 4))
    println(list9.reverse)
    println(list9.groupBy(s => s.charAt(0)))
  }
}
