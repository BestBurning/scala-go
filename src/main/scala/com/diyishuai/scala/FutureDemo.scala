package com.diyishuai.scala
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future, Promise}
import scala.util.{Failure, Success}
import scala.concurrent.duration._

object FutureDemo {

  def main(args: Array[String]): Unit = {
    val f = Future{
      Thread.sleep(100*1000)
      1 + 2
    }
    f.onComplete{ t =>
      t match{
        case Success(v) => println("success: " + v)
        case Failure(t) => println("failed: " + t.getMessage)
      }
    }
    //等待任务结束
    Await.ready(f, 10 seconds)

    val p = Promise[Int]()
    val fu = p.future
    for (v <- fu) { println(v) }

    //3秒钟之后返回3
    Thread.sleep(3000)
    p.success(3)

    //等待任务结束
    Await.ready(fu, 10 seconds)
  }

}
