package com.diyishuai.scala

object Method {
  def m1(a: Int,b: Int): Int = {
    a * b
  }

  def m2(a: Int,b: Int) = {
    a * b
  }

  def m3(a: Int,b: Int) = a * b

  def main(args: Array[String]): Unit = {
    println("m1 : " + m1(3,6))
    println("m2 : " + m2(3,6))
    println("m3 : " + m3(3,6))
  }


}
