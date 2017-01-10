package com.abyss.tech.matcha

/**
 * @author Leonardo
 */
sealed trait Expre {
  
}

case class UniOpr(une:String) extends Expre{
  val _une = une
}

case class BiOperand(une:String, due: Int) extends Expre
{
}

case class Ternary (questionMark:Char, colon:Char, alternatives:List[Char]) extends Expre
{
}

//abstract class TwoCouples(implicit val firstCouple :String) extends Expre
//object hiddenUniverse{
//  implicit val hidden:String = "aaa"
//}
//
//object Oggy extends TwoCouples;

