

/**
 * @author Leonardo
 */
object StringArrowIntClient extends App {
  val aMap:List[StringArrowInt] = List(StringArrowInt("aaa", 111), StringArrowInt("aaa", 222),StringArrowInt("bbb", 333),StringArrowInt("ccc", 4444))
  val bMap =  aMap.groupBy[String] (_.abc+"xyz");
  Console.println(bMap)
  Console.println(bMap.keys)
  Console.println(bMap.values)
  val aList = aMap.map[Int,List[Int]](_._123+1000)
  Console.println(aList)
  val bList = aMap.flatMap[Char,List[Char]](_.abc)
  Console.println(bList)
  aMap.groupBy[String] (_.abc+"xyz").foreach(a=>a._2 match{
      case bbb:List[StringArrowInt] => { bbb.foreach( abbb => Console.println( abbb.abc)) }  
      case _ => }
  )
  
  val strKeyWithNone = scala.collection.mutable.Map.empty[String,Option[StringArrowInt]]
  strKeyWithNone +=("aaa" ->None)
  strKeyWithNone +=("bbb" ->None)
  strKeyWithNone +=("ccc" ->None)
  if(strKeyWithNone.get("abc").isDefined)
    Console.println("abc is a key")
  else 
    Console.println("abc is not  a key")
  if(strKeyWithNone.get("aaa").isDefined)
    Console.println(s"aaaa is a key ${strKeyWithNone.get("aaa")}")   
    
     if(strKeyWithNone.find(_._1 == "aaa").isDefined)
       Console.println(s"aaaa is a key ${strKeyWithNone.find(_._1 == "aaa").get._2}")   
    
}
