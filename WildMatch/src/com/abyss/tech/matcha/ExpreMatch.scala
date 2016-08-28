package com.abyss.tech.matcha

/**
 * @author Leonardo
 */
object ExpreMatch extends App {
  val uneOper = new UniOpr(" = ")
  val duoOpers = new BiOperand("++" , 1)
  val trio = new Ternary('?' , ':' , List('a' , 'b'))
  
  testMatch(trio)
  
  def testMatch(expre:Expre) = {
    expre match  {
      case Ternary(q , c , substitions) =>Console.println(q.toString + substitions.mkString(c.toString))
      case _=>
    }
  }
}