package com.abyss.tech.fundation

/**
 * @author Leonardo
 */

object MutantVsXman extends App {
  val mutantMap = scala.collection.mutable.Map("apocalypse" ->1 , "magneto" ->2, "wolverine" ->"3")
  val mutantMap2 = mutantMap+=("Raven" -> 4)
  mutantMap += ("Storm" -> 5)
  Console.println(if (mutantMap == mutantMap2) "mutantMap == mutantMap2")
  Console.println(if (mutantMap eq mutantMap2) "mutantMap eq mutantMap2")
  Console.println(mutantMap)
  Console.println(mutantMap2)
  
  var immutantMap = Map ("apocalypse" ->1 , "magneto" ->2, "wolverine" ->"3")
  Console.println(s"immutantMap:${immutantMap.hashCode()}:[${immutantMap}]")
  val immutantMap2 = immutantMap ++ List("Raven" -> 4)
    Console.println(s"immutantMap :${immutantMap.hashCode()} after (++)adding Raven->4:[${immutantMap}]")
  immutantMap++=List("Storm" -> 5)
    Console.println(s"immutantMap :${immutantMap.hashCode()} after (++=)adding Storm->5:[${immutantMap}]")

  if(immutantMap == immutantMap2)
    Console.println(s"immutantMap == immutantMap2")
  if(immutantMap eq immutantMap2)
    Console.println(s"immutantMap eq immutantMap2") 
  val immutantMap3=immutantMap;
    if(immutantMap eq immutantMap3)
    Console.println(s"immutantMap eq immutantMap3") 
  Console.println(s"immutantMap :${immutantMap.hashCode()}:[${immutantMap}]")
  Console.println(s"immutantMap2:${immutantMap2.hashCode()}:[${immutantMap2}]")    
  Console.println(s"immutantMap3:${immutantMap3.hashCode()}:[${immutantMap3}]")    
  Console.println("==============================================================================")  
  immutantMap++=List("pheonix" -> 5)

  if(immutantMap == immutantMap2)
    Console.println(s"immutantMap == immutantMap2")
  if(immutantMap eq immutantMap2)
    Console.println(s"immutantMap eq immutantMap2")    
  Console.println(s"immutantMap :${immutantMap.hashCode()}:[${immutantMap}]")
  Console.println(s"immutantMap2:${immutantMap2.hashCode()}:[${immutantMap2}]")
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