package com.diyishuai.scala

object ValAndVar {
  def main(args: Array[String]){
    // val定义不可变变量 -->java final
    val i = 1
    //i = 2 不可以

    // var可变 这里没有声明变量的类型
    var s = "hello"
    s = "hi"

    // 这里显示的声明变量的类型为String
    val str: String = "world"

    println(s + str)
  }
}
