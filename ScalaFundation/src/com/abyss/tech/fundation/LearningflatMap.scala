package com.abyss.tech.fundation

/**
 * @author Leonardo
 */
object LearningflatMap extends App {
 val fruits = Seq("apple", "banana", "orange")


 fruits.map[String,Seq[String]](_.toUpperCase)
//res0: Seq[java.lang.String] = List(APPLE, BANANA, ORANGE)

fruits.flatMap[Char,Seq[Char]](_.toUpperCase)
//res1: Seq[Char] = List(A, P, P, L, E, B, A, N, A, N, A, O, R, A, N, G, E)

val aList= List(Some(1), Some(2), None, Some(3), None)
Console.println(aList.flatten)

Console.println(List("abc","bcd").flatten)

def flipTwice(x:Double)(flip:Double=>Double) = {
  flip(flip(x))
}
Console.println(flipTwice(1){_+1})

val flipTwiceOne = flipTwice(1)_
val result = flipTwiceOne(_+1)
Console.println(s"$result result")

val output = new java.io.File("1.txt")
val write = new java.io.PrintWriter(output)
logDate (write){_.append("Hello world, Scala!!!!\n") }
logDate (write){_.append("This is a function literal!!!!") }


 
  def logDate(write:java.io.PrintWriter)(op:java.io.PrintWriter=>Unit) = {
   
   try{
     op(write)
     }
   finally
   {
     write.close
   }
 }
  
  def twiceOp(input:Double)(op:Double =>Double) ={
   op(op(input))
}
  val  useTwiceOp = twiceOp(2)_
  val userTwiceOpp = useTwiceOp{_+2}
  Console.print(userTwiceOpp)
}





