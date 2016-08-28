package com.abyss.tech.generic

/**
 * @author Leonardo
 */
class PennyHooker extends Whore[String] with Prostitute[Map[String,Int]]{
     override def collect(sss : Map[String, Int]) =
     {
       sss.foreach(println _)
       Map[String,Int]("aaa"->1111)
     }
     
      def collectt(sss : Map[String, Int]):Map[String, Int] = 
     {
      val aMap = Map[String, Int]("aaa"->111)
      aMap.asInstanceOf[Map[String, Int]]
     }
      
      override def collectt (t:String):String = {"aaa"}
}