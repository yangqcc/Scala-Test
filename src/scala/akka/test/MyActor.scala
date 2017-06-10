package akka.test

import akka.actor.Actor
import akka.event.Logging

/**
  * Created by yangqc on 2017/6/10.
  */
class MyActor extends Actor {

  val log = Logging(context.system, this)

  override def receive: Receive = {
    case "test2" => log.info("received test")
    case _ => log.info("received unknown message")
  }
}
