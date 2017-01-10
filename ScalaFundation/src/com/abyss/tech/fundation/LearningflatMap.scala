package com.abyss.tech.fundation

/**
 * @author Leonardo
 */
object LearningflatMap extends App {
 val fruits = Seq("apple", "banana", "orange")
 val output = new java.io.File("1.txt")
 val write = new java.io.PrintWriter(output)

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

logDate{ _.append("Hello world, Scala!!!!\n") }
logDate{ _.append("This is a function literal!!!!") }


 
  def logDate(op:java.io.PrintWriter=>Unit) = {
   
   try{
     op(write)
     }
   finally
   {
     write.close
   }
 }
}
 


