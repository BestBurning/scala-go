package com.diyishuai.scala.classdemo

/**
  * @author: Bruce
  * @date: 2019-09-25
  * @description:
  */
object TimeDemo {

}

class Time(val hours:Int , val minutes:Int){

  def before(other: Time) : Boolean = {
    if(this.hours < other.hours || (this.hours==other.hours && this.minutes<other.minutes)){
      true
    }
    false
  }

}
