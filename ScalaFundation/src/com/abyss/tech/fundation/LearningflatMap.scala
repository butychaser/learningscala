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
}