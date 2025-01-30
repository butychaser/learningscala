package com.abyss.tech.fundation
import scala.collection.immutable.Map;

object Monad extends App {
 
  def regroupByKey[T](inputSeq:Seq[(String, T)]):Map[String,T]=
  {
 return inputSeq.groupBy[String]{case (key, v) => key}.flatMap[(String, Seq[T]), Map[String, Seq[T]]]{case (key, seq) => Map(key -> seq.map{case(key, value) => value})}
 .flatMap{case (k, seq) => Map(k-> seq.reduce{(a,b) => a+b})}
 
                                 //Map[(K, Seq[(K, V)])]
  }
  
 val mutantSeq = Seq(("apocalypse" , "1") , ("magneto" , "2"), ("wolverine" ,"3"),("apocalypse" , "5") , ("magneto" , "6"), ("wolverine" ,"999"));
 Console.println(regroupByKey(mutantSeq));
}