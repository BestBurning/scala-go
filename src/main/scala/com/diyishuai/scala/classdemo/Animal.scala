package com.diyishuai.scala.classdemo

/**
  * 相当于java中的接口
  */
trait Animal {

  /**
    *定义的方法可以实现也可以不实现
    */
  def run()

  def jump(): Unit ={
    println(this.getClass.getSimpleName+" jump")
  }

}
