package com.diyishuai.scala.classdemo

class Rational(n: Int,d: Int) {
  require(d!=0)
  private  val g = gcd(n.abs,d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n:Int) = this(n,1) //辅助构造

  override def toString: String = number+"/"+denom

  def add(that: Rational):Rational =
    new Rational(
      number * that.denom  +  that.number * denom,
      denom*that.denom
    )

  def + (that:Rational):Rational = add(that)
  def + (that:Int):Rational = add(new Rational(that))

  def lessThan(that: Rational) =
    number*that.denom < that.number*denom

  private  def gcd(a: Int,b:Int):Int =
    if (b == 0) a else gcd(b,a % b)

}

object Rational{
  def main(args: Array[String]): Unit = {
    println(new Rational(66,42))


    val rational1 = new Rational(1,2)
    val rational2 = new Rational(1,3)
    val rational = rational1.add(rational2)
    println(s"${rational1+1}")
    println(s"${rational1+rational2}")
    implicit def intToRational(x:Int) = new Rational(x)
    println(s"${1+rational1}")


    println(s"$rational  ${rational.number}   ${rational.denom}")
    println(s"${rational.lessThan(rational2)}")
  }
}
