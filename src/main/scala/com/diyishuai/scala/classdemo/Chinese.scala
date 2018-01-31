package com.diyishuai.scala.classdemo

/**
  * 继承在前，特质在后
  * 多个使用with连接
  */
class Chinese extends Human with Animal {
  /**
    * 特质中未定义的方法必须实现
    * 定义过的方法可以不用再实现
    */
  override def run(): Unit = {
    println("my run")
  }
}


object Chinese{
  def main(args: Array[String]): Unit = {
    val c = new Chinese
    c.run()
    c.jump()
  }
}
