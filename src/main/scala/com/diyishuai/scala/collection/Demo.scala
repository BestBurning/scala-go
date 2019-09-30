package com.diyishuai.scala.collection

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map


/**
  * @author: Bruce
  * @date: 2019-09-29
  * @description:
  */
object Demo {
  def main(args: Array[String]): Unit = {
    val sentence = "AAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBCCCCCCCCDDDDDDDDD"

    //    val arr = ArrayBuffer[Char]()
    //    val res = sentence.foldLeft(arr)(putArray)
    //    println(res)

    val map = Map[Char, Int]()
    val res = sentence.foldLeft(map)(mapArray)
    println(res)


    val list = List(1,2,3,4,"abc")
    val l = list.filter(_.isInstanceOf[Int]).map( _.asInstanceOf[Int] + 1)
    println(l)
  }


  def mapArray(map: Map[Char, Int], char: Char): Map[Char, Int] = {
    map + (char -> (map.getOrElse(char, 0) + 1))
    map
  }


  def putArray(arr: ArrayBuffer[Char], c: Char): ArrayBuffer[Char] = {
    arr.append(c)
    arr
  }

}
