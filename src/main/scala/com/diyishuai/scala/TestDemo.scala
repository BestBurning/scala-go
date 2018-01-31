package com.diyishuai.scala

import scala.collection.mutable.ListBuffer

object TestDemo {

  def main(args: Array[String]): Unit = {
    //创建一个List
    val lst0 = List(1,7,9,8,0,3,5,4,6,2)
    //将lst0中每个元素乘以10后生成一个新的集合
    val lst1 = lst0.map(_ * 10)
    println(lst1)
    println()

    //将lst0中的偶数取出来生成一个新的集合
    val lst2 = lst0.filter(_ % 2 == 0)
    println(lst2)
    println()

    //将lst0排序后生成一个新的集合
    //case 1
    val lst3 = lst0.sorted
    println(lst3)
    //case 2
    val lst4 = lst0.sortWith(_ < _)
    println(lst4)
    println()


    //反转顺序
    val lst5 =lst0.sortWith(_ > _)
    println(lst5)
    println(lst3.reverse)
    println()

    //将lst0中的元素4个一组,类型为Iterator[List[Int]]
    val it = lst0.grouped(4)
    while (it.hasNext)
      print(it.next()+ " ")
    println()

    //将Iterator转换成List
    val it2 = lst0.grouped(4)
    val lst6 = it2.toList
    println(lst6)
    println()

    //将多个list压扁成一个List
    //case 1
    val it3 = lst0.grouped(4)
    val lst7 = new ListBuffer[Int]
    while (it3.hasNext)
      lst7 ++= it3.next()
    println(lst7)
    //case 2
    val it4 = lst0.grouped(4)
    val lst8 = it4.toList.flatten
    println(lst8)
    println()


    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    //先按空格切分，在压平
    val words = lines.map(_.split(" ")).flatten
    println(words)

    val words2 = lines.flatMap(_.split(" "))
    println(words2)
    //并行计算求和
    val tuples = words.map((_,1))
    println(tuples)

    val group = tuples.groupBy(_._1)
    println(group)



    //case 1
    val resultMap = group.map(t => (t._1,t._2.size))
    println(resultMap)
    //case 2
    val result = group.mapValues(_.size)
    println(result)


    val sortRe = resultMap.toList.sortBy(_._2).reverse
    println(sortRe)
    println()

    //化简：reduce
    val a = Array(1,2,3,4,5,6)
    println(a.sum)
    println(a.reduce(_ + _))
    println(a.reduce(_ - _))

    //并行
    val par = a.par
    println(par)
    println(par.reduce(_ + _))
    println()


    //将非特定顺序的二元操作应用到所有元素

    //安装特点的顺序


    //折叠：有初始值（无特定顺序）
    val array = Array(1,2,3,4,5,6,7)
    println(array.fold(0)(_ + _))
    println(array.fold(10)(_ + _))
    //折叠：有初始值（有特定顺序）
    println(array.foldLeft(10)(_ + _))
    println(array.foldRight(10)(_ + _))
    println()


    //聚合
    val arr = List(List(1, 2, 3), List(3, 4, 5), List(2), List(1))
    println(arr.aggregate(1)(_+_.sum, _+_))
    println(arr.aggregate(100)(_ + _.sum , _ + _))
    println(arr.aggregate(1)(_ + _.sum , _ * _))
    println(arr.aggregate(100)(_ + _.sum , _ * _))

    println(arr.aggregate(2)(_ * _.sum , _ + _))
    println(arr.aggregate(200)(_ * _.sum , _ + _))
    println(arr.aggregate(2)(_ * _.sum , _ * _))
    println(arr.aggregate(200)(_ * _.sum , _ * _))
    println()
    val l1 = List(5,6,4,7)
    val l2 = List(1,2,3,4)
    //求并集
    println(l1.union(l2))
    println(l1 union l2)
    //求交集
    println(l1.intersect(l2))
    //求差集
    println(l1.diff(l2))
    println(l2.diff(l1))
//    println(r3)



//    val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
//    lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
//    lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse
  }
}
