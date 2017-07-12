/**
 * Created by yangqc on 2017/7/13.
 */
package com.yqc.classhierarchy;
/**
 * scala的类层级结构
 * <p>
 * scala中，每个类都继承自Any,所以scala中每个对象都能用==,!=或者equls比较
 * ==总是与equals相同，!=总是与equals相反。因此独立的类可以通过重写equals方法
 * 改变==或者!=的意义
 * <p>
 * Any有两个子类,AnyVal和AnyRef.AnyVal是scala每个內建值类的父类.有9个这样的值类:
 * Byte,Short,Char,Int,Long,Float,Double,Boolean和Unit,前八个对应java的基本类型
 * ****这些类的实施都写成字面量,42是Int的实例，不能使用new创造这些类的实例。
 * 另一个值类,Unit，对应于java的void类型，被用作不反悔任何有趣结果的方法的结果类型.Unit
 * 只有一个实例值,写成()
 * <p>
 * AnyRef实际就是类java.lang.Object的别名。因此java里写的类和scala里写的类都继承自AnyRef
 **/