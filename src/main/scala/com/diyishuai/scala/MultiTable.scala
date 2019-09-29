package com.diyishuai.scala

object MultiTable {



  def main(args: Array[String]): Unit = {
    val n = 10

//    f1(n)
    print(f2(n))
  }


  def makeRow(i: Int,n:Int) = {
    for (j <- 1 to n) yield {
      (test(i*j,n))
    }
  }

  def f2(n: Int): String = {
    val tableSeq =
      for{
        i <- 1 to n
      } yield {
        makeRow(i,n)
      }
    tableSeq.mkString("\n")
  }

  private def f1(n: Int) = {
    for (i <- 1 to n) {
      for (j <- 1 to n) {
        print(test(i * j, n))
      }
      println()
    }
  }

  def test(num: Int, n : Int): String ={
    val i = (n * n).toString.length
    val length = num.toString.length
    " " *(i - length + 1 ) + num
  }



}
