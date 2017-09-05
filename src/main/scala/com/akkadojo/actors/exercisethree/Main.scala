package com.akkadojo.actors.exercisethree

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import spray.can.Http
import spray.can.Http.Bind

/**
  * Created by jmhockham on 05/09/17.
  */
object Main extends App {

  implicit val system = ActorSystem("exercise-three")

  //TODO implement the receptionist
  //val receptionist = system.actorOf(Props(new Receptionist), "receptionist")

  //IO(Http) ! Bind(listener= receptionist, interface = "0.0.0.0", port=8000)
}
