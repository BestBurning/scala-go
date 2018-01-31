package com.diyishuai.scala.cases

object CaseDemo3 extends App {
//  val arr = Array(0,1,5,8)
//  arr match {
//    case Array(1,x,y) => println(x + " " + y)
//    case Array(1,1,5) => println(" 0 ")
//    case Array(0,_*) => println("0 ...")
//    case _ => println("others")
//  }

//  val lst = List(0,3)
//  lst match {
//    case 0 :: Nil => println(" 0 ")
//    case x :: y :: Nil => println(s"x: $x y: $y")
//    case 0 :: a => println("0......")
//    case _ => println("others")
//  }

  val tup = (2,3,5)
  tup match {
    case (1,x,y) => println(s"hello $x,$y")
    case (_,z,5) => println(z)
    case _ => println("else")
  }

}
