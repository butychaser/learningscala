package com.abyss.tech.imply

/**
 * @author Leonardo

 */
import com.abyss.tech.imply.transcation._
case class MoneyCollect(val amount:Int)
class ImplicitPrositute(implicit money:MoneyCollect, cash:MoneyCollect) {
  def payOut:Unit = Console.println(s"with ${money.amount}  = ${cash.amount}") 
}

