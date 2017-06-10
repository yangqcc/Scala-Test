package akka.test.edgecase

import akka.actor.{Actor, ActorSystem, Props}

/**
  * Created by yangqc on 2017/6/10.
  */
class MyValueClass(val v: Int)

object MyValueClass {
  def apply(v: Int): MyValueClass = new MyValueClass(v)
}

class ValueActor(value: MyValueClass) extends Actor {
  override def receive: Receive = {
    case multiplier: Long =>
      print("yes,coming")
      sender() ! (value.v * multiplier)
    case _ => println("sorry")
  }
}

object test2 extends App {
  val defaultValueProp1 = Props(classOf[ValueActor], MyValueClass(2)) //不支持
  val system = ActorSystem("defaultValueProp1")
  val defaultActor = system.actorOf(defaultValueProp1, "defaultValue")

  //  system.scheduler.scheduleOnce(new FiniteDuration(500, MILLISECONDS)) {
  defaultActor ! 2L
  //  }
}