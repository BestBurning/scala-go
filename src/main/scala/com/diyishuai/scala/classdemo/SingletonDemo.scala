package com.diyishuai.scala.classdemo

object SingletonDemo {
  def main(args: Array[String]): Unit = {
    //不需要new
    val s = SingletonDemo
    println(s)
  }
}


