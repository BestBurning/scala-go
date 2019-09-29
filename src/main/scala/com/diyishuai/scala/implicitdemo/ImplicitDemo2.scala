package com.diyishuai.scala.implicitdemo

/**
  * @author: Bruce
  * @date: 2019-09-28
  * @description:
  */
object ImplicitDemo2 {

  def main(args: Array[String]): Unit = {
    val a = new A
    a.b()
  }

  implicit class B(val a: A){
    def b(): Unit ={
      println("b")
    }

  }
}

class A (){
  def a(): Unit ={
    println("a")
  }
}



