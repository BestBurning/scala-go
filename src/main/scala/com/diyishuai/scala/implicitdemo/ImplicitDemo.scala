package com.diyishuai.scala.implicitdemo

/**
  * @author: Bruce
  * @date: 2019-09-28
  * @description:
  */
object ImplicitDemo {
  implicit def d(mysql : MySQL):DB = {
    new DB
  }
  def main(args: Array[String]): Unit = {



    val mysql = new MySQL
    mysql.insert()
    mysql.delete()
  }

}


class MySQL(){

  def insert(): Unit ={
    println("insert into 1")
  }

}

class DB(){

  def delete(): Unit ={
    println("delete 1 ")
  }

}


