/**
 * Created by yangqc on 2017/5/3.
 */
package com.yqc.classAndObject;
/**
 * Scala作者建议，如果一个函数在逻辑上表达一种属性的返回值，那么在定义函数时尽量使用不带括号的写法，
 * 因为这样看上去更像一个类的属性，而不像一个方法
 * <p>
 * 带花括号但是没有等号的,本质上会被当做Unit结果类型方法
 * <p>
 * 带花括号但是没有等号的,本质上会被当做Unit结果类型方法,想要返回需要的结果,那么一定要记得加等号
 * <p>
 * def g(){
 * "this String gets lost too!"
 * }
 * <p>
 * <p>
 * def h()={
 * "this String gets returned!"
 * }
 * <p>
 * 带花括号但是没有等号的,本质上会被当做Unit结果类型方法,想要返回需要的结果,那么一定要记得加等号
 * 下面是两段代码的区别
 * def g(){
 * "this String gets lost too!"
 * }
 * <p>
 * <p>
 * def h()={
 * "this String gets returned!"
 * }
 * <p>
 * 带花括号但是没有等号的,本质上会被当做Unit结果类型方法,想要返回需要的结果,那么一定要记得加等号
 * 下面是两段代码的区别
 * def g(){
 * "this String gets lost too!"
 * }
 * <p>
 * def h()={
 * "this String gets returned!"
 * }
 **/

/**
 * 带花括号但是没有等号的,本质上会被当做Unit结果类型方法,想要返回需要的结果,那么一定要记得加等号
 * 下面是两段代码的区别
 *  def g(){
 *      "this String gets lost too!"
 *  }
 *
 *  def h()={
 *      "this String gets returned!"
 *  }
 **/