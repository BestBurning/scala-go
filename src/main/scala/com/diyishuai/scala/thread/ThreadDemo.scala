package com.diyishuai.scala.thread

import java.util.concurrent.{Callable, Executors, Future}

object ThreadDemo {

  def main(args: Array[String]): Unit = {
    val pool = Executors.newFixedThreadPool(5)

    for (i <- 1 to 10) {
      pool.execute(new Runnable {
        override def run(): Unit = {
          println(Thread.currentThread().getName)
          Thread.sleep(1000)
        }
      })
    }


    val f: Future[Int] = pool.submit(new Callable[Int] {
      override def call(): Int = {
        Thread.sleep(3000)
        100
      }
    })
    while (!f.isDone){
      println(f.isDone)
      Thread.sleep(100)
    }
    println(f.isDone)
    println(f.get())

  }

}
