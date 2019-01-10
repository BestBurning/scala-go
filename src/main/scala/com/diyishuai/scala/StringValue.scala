package com.diyishuai.scala

object StringValue extends App {

  val name = "bruce"
  println(s"hello, $name")
  println(s"6*7=${6*7}")
  println(s" *7=${" " *7}")

  // raw 不识别转义字符
  println(raw"hello \\\\ 4 ")
  println(s"hello \\\\ 2 ")

  //f
  println(f"${math.Pi}%.5f")

  val s = """{
    |  "type": "javascript",
    |  "name": "sdkPlatformCost",
    |  "fieldNames": ["guarantyECPM", "revenueShare","sdkECPM","imprNum"],
    |  "function": "function(guarantyECPM, revenueShare) {
    |  return guarantyECPM==null?
    |  (revenueShare!=null?revenueShare*platformIncome:0):
    |  (sdkECPM<guarantyECPM?guarantyECPM*imprNum/1000:platformIncome*revenueShare)
    |  }"
    |}""".stripMargin
  println(s)


}
