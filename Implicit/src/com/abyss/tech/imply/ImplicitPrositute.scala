package com.abyss.tech.imply

/**
 * @author Leonardo

 */
import com.abyss.tech.imply.transcation._
case class MoneyCollect(val amount:Int)
class ImplicitPrositute(val position:String)(implicit val cash:MoneyCollect) {
  def payOut:Unit = Console.println(s"$position with ${cash.amount}") 
}