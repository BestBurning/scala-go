package com.diyishuai.scala

object TupleDemo {

  def main(args: Array[String]): Unit = {
    val t = (1,"spark",3,"hadoop")
    println("t : " + t)
    println("t_2 : " + t._2)
    println()
    val t1 = new Tuple3("storm",2,3)
    println("t1 : " + t1)

    //对偶元祖数组转map
    val arr = Array(("a",1),("b",2))
    val map = arr.toMap
    println("map : " + map)

    //拉链
    val a = Array("a","b","c")
    val b = Array(1,2,3,4)
    val c = a.zip(b)
    println("zip :  " + c.toMap)




  }

}
