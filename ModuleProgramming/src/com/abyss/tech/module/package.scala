package com.abyss.tech

/**
 * @author Leonardo
 */
package object module {
  import com.abyss.tech.domain._
  abstract class Database
  {
    val allReciepts:List[Reciept]
    def displayAllReciepts:Unit
    def findReciepts(food:Food):List[Reciept] = {allReciepts.filter { x => x.ingredients.contains(food) }}
  }
  object SlimDatabase extends Database
  {
    val allReciepts = List(Cannibal, Vege)
    def displayAllReciepts:Unit = {
    Console.println(allReciepts)  
    }
  }
}