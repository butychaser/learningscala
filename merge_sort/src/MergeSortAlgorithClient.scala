

/**
 * @author leonardo
 */
object MergeSortAlgorithClient extends App {
  val comparator = (x:Int, y:Int) => {x < y}
  val list = List(4 ,3 ,3 ,1)
  Console.println(MergeSortAlgorithm.msort(list){_<_})
  Console.println(List.range(1, 5) map[List[Int],List[List[Int]]](i=> List.range(1, i)))
  Console.println(List.range(1, 5) flatMap[Int,List[Int]](i=> List.range(1, i)))
  Console.println(List.range(1, 5) map[List[(Int,Int)],List[List[(Int,Int)]]](i=> List.range(1, i) map (j=>(i,j))))
  Console.println(List.range(1, 5) flatMap[(Int,Int),List[(Int,Int)]](i=> List.range(1, i) map (j=>(i,j))))
  
  
  val bag1 = List("1", "2", "foo", "3", "bar")
  val bag2 = List(1,2,3,4)
  val sum = bag1.map[Option[Int],List[Option[Int]]](a=>toInt(a))
  Console.println(sum)
  val sum2 = bag1.flatMap[Int,List[Int]](a=>toInt(a))
  Console.println(sum2)
  
  def toInt(in: String): Option[Int] = {
    try {
        Some(Integer.parseInt(in.trim))
    } catch {
        case e: NumberFormatException => None
    }
}
  
}