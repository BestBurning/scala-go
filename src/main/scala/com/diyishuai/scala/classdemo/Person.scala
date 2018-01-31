package com.diyishuai.scala.classdemo

/**
  * 1 private : 包访问权限
  * 2 private : 构造器权限
  */
private[scala] class Person private {


  val id = "9527"
  var name = "华安"

  /**
    * 伴生类可访问
    */
  private var gender: String =  "male"

  /**
    * 伴生类中也不可访问
    */
  private[this] var pop: String = _

  def printPop : Unit = {
    println(pop)
  }

}

//伴生对象
object Person{

  def apply(): Person = new Person()

  def apply(name: String): Person = {
    val p = new Person()
    p.name = name
    return p
  }

  def main(args: Array[String]): Unit = {
    val p = new Person
    println(p.id + " " + p.name)
    p.name = "唐伯虎"
    println(p.name)
    println(p.gender)
    p.gender = "男"
    println(p.gender)
    p.printPop

    //静态单例对象
    val p2 = Person()
    //伴生对象,根据参数去调用apply()或apply(name: String)
    val p1 = Person
    val p3 = Person("秋香")
    println(p1+"\t"+p2+"\t"+p3)



  }
}