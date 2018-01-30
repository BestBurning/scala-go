package com.diyishuai.scala.collection

import java.util

object MapDemo {
  def main(args: Array[String]): Unit = {
    println("普通map:")
    val m = Map("a" -> 1,"b" -> 2)
    println(m)
    // 普通map无法 写入
    // m("c") = 3
    println("m(\"a\") : " + m("a"))
    println("=================")
    println("mutable map : ")
    import scala.collection.mutable.Map
    val mm = Map("a" -> 1,"b" -> 2)
    println(mm)
    println("mm(\"a\") : " + mm("a"))
    mm("c") = 3
    println("mm(\"c\")=3 : "+mm)
    mm.put("d",4)
    println("mm.put(\"d\",4) : " + mm)
    println("================")
    println("HashMap :")
    val hm = new util.HashMap[String,String]()
    hm.put("a","a")
    println(hm)

  }
}
