package com.abyss.tech.fundation

/**
 * @author Leonardo
 */

object MutantVsXman extends App {
  val mutantMap = scala.collection.mutable.Map("apocalypse" ->1 , "magneto" ->2, "wolverine" ->"3")
  mutantMap += ("Raven" -> 4)
  Console.println(mutantMap)
  
  var immutantMap = Map ("apocalypse" ->1 , "magneto" ->2, "wolverine" ->"3")
  Console.println(s"${immutantMap.hashCode()}:[${immutantMap}]")
  val immutantMap2 = immutantMap ++ List("Raven" -> 4)
  immutantMap++=List("Raven" -> 4)
  if(immutantMap == immutantMap2)
    Console.println(s"immutantMap == immutantMap2")
  if(immutantMap eq immutantMap2)
    Console.println(s"immutantMap eq immutantMap2")    
  Console.println(s"${immutantMap.hashCode()}:[${immutantMap}]")
  Console.println(s"${immutantMap2.hashCode()}:[${immutantMap2}]")
  Console.println("==============================================================================")
  import scala.collection.mutable._
  val batchEventWgMap = LinkedHashMap.empty[Int,LinkedHashMap[String,Int]];
  val eventWgMap = LinkedHashMap[String,Int]("apocalypse" ->1 , "magneto" ->2, "wolverine" ->3)
  Console.println(s"eventWgMap ${eventWgMap}")
  batchEventWgMap.put(1, eventWgMap)
    Console.println(s"batchEventWgMap ${batchEventWgMap}")
  eventWgMap +=("Raven" -> 4)
  Console.println(s"eventWgMap ${eventWgMap}")
  // batchEventWgMap.put(1, eventWgMap)
  Console.println(s"batchEventWgMap ${batchEventWgMap}")
}