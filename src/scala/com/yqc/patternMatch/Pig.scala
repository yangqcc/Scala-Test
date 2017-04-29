package com.yqc.patternMatch

/**
  * Created by yangqc on 2017/4/29.
  *
  * sealed关键字修饰，其修饰的类只能在当前文件头中被继承
  *
  * 用sealed修饰这样做的目的是告诉scala编译器在检查模式匹配的时候，让scala知道这些case的所有情况，
  * scala就能够在编译的时候进行检查，看你写的代码是否有没有漏掉什么没case到，减少编程的错误。
  */
/*
class Pig extends Animal{

}
*/
class Pig {}
