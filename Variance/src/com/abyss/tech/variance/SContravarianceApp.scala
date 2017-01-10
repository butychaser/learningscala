package com.abyss.tech.variance

/**
 * @author Leonardo
 */
object SContravarianceApp extends App {
  val bomb = SmokeBomb() 
  val aaa = new SContravariance[Bullet]
   val output = aaa.output(bomb)
   output.foreach { Console.println(_) }
}