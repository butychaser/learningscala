

/**
 * @author Leonardo
 */
object StringArrowIntClient extends App {
  val aMap:List[StringArrowInt] = List(StringArrowInt("aaa", 111), StringArrowInt("aaa", 222),StringArrowInt("bbb", 333),StringArrowInt("ccc", 4444))
  val bMap =  aMap.groupBy[String] (_.abc+"xyz");
  Console.println(bMap.values)
  val aList = aMap.map[Int,List[Int]](_._123+1000)
  Console.println(aList)
  val bList = aMap.flatMap[Char,List[Char]](_.abc)
  Console.println(bList)
//  aMap.groupBy[String] (_.abc+"xyz").foreach(a=>a._2 match{
//      case bbb:List[StringArrowInt] => { bbb.foreach( Console.println( _.abc)) }  
//      case _ => }
//  )
}
