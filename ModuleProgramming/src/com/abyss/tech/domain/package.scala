package com.abyss.tech

/**
 * @author Leonardo
 */
package object domain {
  class Food(val name:String)
  object Apple extends Food("Apple"){
    override def toString:String = "Pomme"
  }
  object Mayo extends Food("Mayo")
  {
     override def toString:String = "Mayonnaise"
  }
  object Lamb extends Food("Lamb")
  case class Reciept(val name: String, val ingredients:List[Food])  {override def toString = name}
  object Cannibal extends Reciept("Cannibolism", List(Lamb,Mayo))
  object Vege extends Reciept("Vegetarian",List(Apple,Mayo)) 
}