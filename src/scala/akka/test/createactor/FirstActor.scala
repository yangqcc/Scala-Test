package akka.test.createactor

import akka.actor.{Actor, ActorSystem, Props}
import com.cityos.mc.test.MyActor

/**
  * Created by yangqc on 2017/6/10.
  * Actors are automatically(自动地) started asynchronously(异步的) when created.
  */
class FirstActor extends Actor {

  /**
    * The call to actorOf returns an instance(实例) of ActorRef.
    * This is a handle to the actor instance and the only way to interact(互相影响) with it
    */
  val child = context.actorOf(Props[MyActor], name = "myChild")

  override def receive: Receive = {
    case x: Long => sender() ! x
  }
}

class Argument(val value: String, val number: Int)

class ValueClassActor(arg: Argument) extends Actor {
  def receive = {
    case _ =>
      println(this.arg)
  }
}

object ValueClassActor extends App {
  def props1(arg: Argument): Props = Props(classOf[ValueClassActor], arg) // fails at runtime
  def props2(arg: Argument) = Props(classOf[ValueClassActor], arg.value, arg.number) // ok
  def props3(arg: Argument) = Props(new ValueClassActor(arg)) // ok

  val system: ActorSystem = ActorSystem("testActor")
  val actor2 = system.actorOf(props1(new Argument("this is yangqc!", 12)));
  actor2 ! 2
}
