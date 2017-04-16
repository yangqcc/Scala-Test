package com.yqc.variable

/**
  * Created by yangqc on 2017/4/16.
  * private[x]
  * 这里的x指代某个所属的包、类或单例对象。如果写成private[x],读作"这个成员除了对[…]中的类或[…]中的包中的类及它们的伴生对像可见外,
  * 对其它所有类都是private。
  */
class Outer {

  class Inner {
    private[Outer] def m(): Unit = {
      print("this is m!")
    }

    private def f(): Unit = {
      println("f")
    }

    class InnerClass {
      f()
    }

  }

  new Inner().m(); //私有成员加个控制范围TM就能在外部运行
  //  new Inner().f() 私有成员，外部不能引用

}
