package com.yqc.genericAndAnnotation

import java.io._


/**
  * Created by yangqc on 2017/4/30.
  */
class Animal extends Serializable {

  @transient var name: String = "zzh"
  val age: Int = 1

  override def toString() = "name=" + name + " age=" + age
}

object Serialize {
  def main(args: Array[String]): Unit = {
    val file = new File("person.out")

    val out = new ObjectOutputStream(new FileOutputStream(file))
    val animal = new Animal

    out.writeObject(animal)
    out.close()

    val in = new ObjectInputStream(new FileInputStream(file))
    val newAnimal = in.readObject()
    in.close()
    println(newAnimal)
  }
}
