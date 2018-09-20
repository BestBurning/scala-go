package com.diyishuai.scala.file

import scala.io.Source

object FileDemo {
  def main(args: Array[String]): Unit = {
    val filePath = "/Users/yysz/Documents/GitRepo/mine/scala-go/src/main/scala/com/diyishuai/scala/file/FileDemo.scala"

    if (filePath.length > 0){
      val lines = Source.fromFile(filePath).getLines().toList
      var maxLength = 0
      for (line <- lines){
        maxLength = maxLength.max(line.length.toString.length)
      }
      for (line <- lines) {
        val spaces = " " * (maxLength-line.length.toString.length)
        println(spaces+""+line.length+"|" + line)
      }
    }else{
      Console.err.println("Please enter filename")
    }
  }
}
