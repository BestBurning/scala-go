package com.diyishuai.scala

/**
  * @author: Bruce
  * @date: 2019-09-30
  * @description:
  */
object PartialFunction {


  def main(args: Array[String]): Unit = {
    //List(1,2,3,4,"abc") 使集合只返回数字并+1
    val list = List(1,2,3,4,"abc")

    //1 filter + map
    val res1 = list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int]+1)
    println(s"res1 = ${res1}")

    //2 filter + match
    val res2 = list.filter(_.isInstanceOf[Int]).map{i => i match{
      case i:Int => i+1
      case _ =>
    }}
    println(s"res2 = ${res2}")

    //3 PartialFunction
    val res3 = list.collect(new PartialFunction[Any,Int] {
      override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]

      override def apply(v1: Any): Int = v1.asInstanceOf[Int]+1
    })
    println(s"res3 = ${res3}")

    //4 PartialFunction
    def p:PartialFunction[Any,Int] = {
      case i:Int => i+1
    }
    val res4 = list.collect(p)
    println(s"res4 = ${res4}")

    val res5 = list.collect{case i:Int => i+1}
    println(s"res5 = ${res5}")

  }



}
