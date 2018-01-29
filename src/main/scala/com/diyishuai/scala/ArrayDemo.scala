package com.diyishuai.scala

import scala.collection.mutable.ArrayBuffer

object ArrayDemo {

  def main(args: Array[String]): Unit = {
    //长度为10
    val arr1 = new Array[Int](10);
    println("arr1 : " + arr1.toBuffer)

    //长度为1
    val arr2 = Array[Int](10)
    println("arr2 : " + arr2.toBuffer)

    //长度为3
    val arr3 = Array("hadoop","storm","spark")
    println("arr3 : " + arr3.toBuffer)
    println("arr3[2] : " + arr3(2))

    println("===============")

    //变长数组
    val arr4 = ArrayBuffer[Int]()
    println(arr4.toBuffer)
    arr4 += 1
    println("追加单个元素(1) : " + arr4.toBuffer)
    arr4 += 2
    println("追加单个元素(2) : " + arr4.toBuffer)
    arr4 += (3,4,5)
    println("追加多个元素(3,4,5) : " + arr4.toBuffer)
    arr4 ++= Array(6,7)
    println("追加数组 ++= : " + arr4.toBuffer)
    arr4 ++= ArrayBuffer(8,9)
    println("追加数组缓冲 ++= : " + arr4.toBuffer)
    arr4.insert(0,-1)
    println("插入: " + arr4.toBuffer)
    arr4.remove(8,2)
    println("删除: " + arr4.toBuffer)

    println("========")

    val arr = 1 to 10
    for (i <- arr)
      print(i + " ")
    println()
    //until 会生成一个Range
    for(i <- 0 until arr.length)
      print(i + " ")
    println()
    //reverse将数组反转
    for (i <- (0 until arr.length).reverse)
      print(i + " ")

  }
}
