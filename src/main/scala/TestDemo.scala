/**
  * @author: Bruce
  * @date: 2019-09-14
  * @description:
  */
object TestDemo {
  def main(args: Array[String]): Unit = {
    // f(n) = f(n-1)+f(n-2)
    println(f(1))
    println(f(2))
    println(f(3))
    println(f(4))
    println(f(5))
    println(f(6))
    println(f(7))
    println(f(8))

    println("=======")

    println(f2(1))
    println(f2(2))
    println(f2(3))
    println(f2(4))
    println(f2(5))
    println(f2(6))
    println(f2(7))
    println(f2(8))

    println("======")

    f3(1)
    f3(2)
    f3(3)
    f3(4)
    f3(5)

    println("=====")

    f4(1)
    f4(2)
    f4(3)
    f4(4)
    f4(5)
    f4(6)
    f4(7)
    f4(8)
    f4(9)

    myfor(10)

  }


  def f(n:Int): Int ={
    if(n<=2){
      1
    }else{
      f(n-1)+f(n-2)
    }

  }

  def f2(n:Int): Int = {
    if(n == 1){
      3
    }else{
      2*f(n-1)+1
    }


  }

  def f3(n: Int): Unit ={
    for (i <- 1 to n){
      // 空
      print(" "*(n-i))
      // *
      println("*"*(2*i-1))
    }
  }

  def f4(n: Int): Unit ={
    for (i <- 1 to n){
      for (j <- 1 to i){
        print(s"${i}X${j}=${i*j}\t")
      }
      println()
    }
    println("=====")
  }


  def myfor(n: Int): Unit ={
    println("---")
    for (i <- Range(10,0,-1)){
      println(i)
    }
  }



}
