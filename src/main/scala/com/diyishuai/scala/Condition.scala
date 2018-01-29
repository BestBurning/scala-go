package com.diyishuai.scala

object Condition {
  def main(args: Array[String]){
    val x = 1
    val y = if (x > 0) 1 else -1
    println("y : " + y)

    //混合表达式
    val z = if (x > 0 ) "OK" else -1
    println("z : " + z)

    //没有else   相当于 if(x < 0) "ERROR" else ()       a=()
    val a = if (x < 0) "ERROR"
    println("a : " + a)

    // Unit类，写作()，相当于Java中的void
    val b = if (x < 0) 1 else ()
    println("b : "+ b)

    // if else if
    val c = if (x < 0) -1
            else if (x == 0) 0
            else 1
    println("c : "+ c)
  }
}
