package com.abyss.tech.fundation
import scala.collection.immutable.Map;

object Monad extends App {
 
  def regroupByKey[T](inputSeq:Seq[(String, T)]):Map[String,Seq[T]]=
  {
    return inputSeq.groupBy[String]{ case (k, v) => k}.flatMap[(String, Seq[T]), Map[String, Seq[T]]]{ case (k, values) => Map(k -> values.map{case (_, value) => value});};
  }
  
 val mutantSeq = Seq(("apocalypse" , "1") , ("magneto" , "2"), ("wolverine" ,"3"),("apocalypse" , "5") , ("magneto" , "6"), ("wolverine" ,"999"));
 Console.println(regroupByKey(mutantSeq));
}