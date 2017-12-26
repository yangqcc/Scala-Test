/**
 * Created by yangqc on 2017/7/18.
 */
package com.yqc.placeholder;
/**
 * scala占位符总结
 * <p>
 * 1、存在性类型：Existential types
 * def foo(l: List[Option[_]]) = ...
 * <p>
 * 2、高阶类型参数：Higher kinded type parameters
 * case class A[K[_],T](a: K[T])
 * <p>
 * 3、临时变量：Ignored variables
 * val _ = 5
 * <p>
 * 4、临时参数：Ignored parameters
 * List(1, 2, 3) foreach { _ => println("Hi") }
 * <p>
 * 5、通配模式：Wildcard patterns
 * Some(5) match { case Some(_) => println("Yes") }
 * match {
 * case List(1,_,_) => " a list with three element and the first element is 1"
 * case List(_*)  => " a list with zero or more elements "
 * case Map[_,_] => " matches a map with any key type and any value type "
 * case _ =>
 * }
 * val (a, _) = (1, 2)
 * for (_ <- 1 to 10)
 * <p>
 * 6、通配导入：Wildcard imports
 * import java.util._
 * <p>
 * 7、隐藏导入：Hiding imports
 * // Imports all the members of the object Fun but renames Foo to Bar
 * import com.test.Fun.{ Foo => Bar , _ }
 * <p>
 * // Imports all the members except Foo. To exclude a member rename it to _
 * import com.test.Fun.{ Foo => _ , _ }
 * <p>
 * 8、连接字母和标点符号：Joining letters to punctuation
 * def bang_!(x: Int) = 5
 * <p>
 * 9、占位符语法：Placeholder syntax
 * List(1, 2, 3) map (_ + 2)
 * _ + _
 * ( (_: Int) + (_: Int) )(2,3)
 * <p>
 * val nums = List(1,2,3,4,5,6,7,8,9,10)
 * <p>
 * nums map (_ + 2)
 * nums sortWith(_>_)
 * nums filter (_ % 2 == 0)
 * nums reduceLeft(_+_)
 * nums reduce (_ + _)
 * nums reduceLeft(_ max _)
 * nums.exists(_ > 5)
 * nums.takeWhile(_ < 8)
 * <p>
 * 10、偏应用函数：Partially applied functions
 * def fun = {
 * // Some code
 * }
 * val funLike = fun _
 * <p>
 * List(1, 2, 3) foreach println _
 * <p>
 * 1 to 5 map (10 * _)
 * <p>
 * //List("foo", "bar", "baz").map(_.toUpperCase())
 * List("foo", "bar", "baz").map(n => n.toUpperCase())
 * <p>
 * 11、初始化默认值：default value
 * var i: Int = _
 * <p>
 * 12、作为参数名：
 * //访问map
 * var m3 = Map((1,100), (2,200))
 * for(e<-m3) println(e._1 + ": " + e._2)
 * m3 filter (e=>e._1>1)
 * m3 filterKeys (_>1)
 * m3.map(e=>(e._1*10, e._2))
 * m3 map (e=>e._2)
 * <p>
 * //访问元组：tuple getters
 * (1,2)._2
 * <p>
 * 13、参数序列：parameters Sequence
 * _*作为一个整体，告诉编译器你希望将某个参数当作参数序列处理。例如val s = sum(1 to 5:_*)就是将1 to 5当作参数序列处理。
 * //Range转换为List
 * List(1 to 5:_*)
 * <p>
 * //Range转换为Vector
 * Vector(1 to 5: _*)
 * <p>
 * //可变参数中
 * def capitalizeAll(args: String*) = {
 * args.map { arg =>
 * arg.capitalize
 * }
 * }
 * <p>
 * val arr = Array("what's", "up", "doc?")
 * capitalizeAll(arr: _*)
 **/