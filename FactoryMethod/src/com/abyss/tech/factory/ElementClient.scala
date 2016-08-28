package com.abyss.tech.factory

/**
 * @author Leonardo
 */
object ElementClient extends App {
  import Element.elem
  val array = elem(Array("abc" , "def", "ghi"))
  val line = elem("abcdefghi")
  Console.println(s"array."+array.width)
  Console.println(s"array."+line.width)
}