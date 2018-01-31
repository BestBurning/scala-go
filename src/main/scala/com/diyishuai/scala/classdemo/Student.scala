package com.diyishuai.scala.classdemo

/**
  *
  * 主构造器直接跟在类后面
  * 并且加上val或var在半生类或者外部是可以被访问的
  * @param id val不可更改变量
  * @param name var可更改变量
  * @param age  具有默认值，但是在构造的时候可以被覆盖
  * @param gender 不带val、var的参数类似与private[this]
  *
  */
class Student(val id : String,var name: String , var age: Int = 18, gender: String ){
  /**
    * 构造器重载
    * @param id
    */
  def this(id : String){
    /**
      * 第一行必须调用主构造器
      */
    this(id,null,0,null)
  }



}




object Student{
  def main(args: Array[String]): Unit = {
    val s = new Student("1")
    println(s.id+"\t"+s.age)

  }
}