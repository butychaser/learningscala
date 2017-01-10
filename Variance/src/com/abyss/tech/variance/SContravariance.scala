package com.abyss.tech.variance

/**
 * @author Leonardo

 */

trait Bullet
case class LaserBeam() extends Bullet
case class SmokeBomb() extends Bullet
class SContravariance[T] {
  def output[U<:T](a:U):List[U] ={
    List[U](a)  
  }
}