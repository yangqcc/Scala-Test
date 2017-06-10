package akka

import scala.concurrent.duration.{FiniteDuration, MILLISECONDS}

/**
  * Created by yangqc on 2017/6/10.
  */
case object Ping

case object Pong

class Pinger extends Actor {

  var countDown = 100

  override def receive: Receive = {
    case Pong =>
      println(s"${self.path} received pong,count down $countDown")
      if (countDown > 0) {
        countDown -= 1
        sender() ! Ping
      } else {
        sender() ! PoisonPill
        self ! PoisonPill
      }
  }
}

class Ponger(pinger: ActorRef) extends Actor {
  override def receive: Receive = {
    case Ping => println(s"${self.path} received ping")
      pinger ! Pong
    case Pong =>
      println("this is my Pong!")
      pinger ! Pong
  }
}

object TestActor {

  def main(args: Array[String]): Unit = {

    val system = ActorSystem("pingpong")

    val pinger = system.actorOf(Props[Pinger], "pinger")

    val ponger = system.actorOf(Props(classOf[Ponger], pinger), "ponger")
    system.scheduler.scheduleOnce(new FiniteDuration(500, MILLISECONDS)) {
      ponger ! Ping
    }

  }
}