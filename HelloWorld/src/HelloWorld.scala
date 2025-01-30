
/**
 * @author leonardo
 */
object HelloWorld extends App {
  import scala.util.Try
  val str1 = "Hello World, Scala!"
  Console.println(str1)
  val alist = List[String]("Hello " , "World " , "Scala ")
  alist.foreach(S=>(Console.print(S)))
  //alist.sort((s,t)=>s.charAt(0).toLower() < t.charAt(0).toLower())
  //alist.sort((s, t) =>s.charAt(0).toLower<t.charAt(0).toLower))
  alist.filter ( x => x.length()>4 )
  val aMap = Map("AAA"->1, "BBB"->2, "CCC"->3)
  val integer =  aMap.get("AAA") match
  {
    case Some(2) => 2
    case None => 0
    case _ => -1
  }
  
  val someLIst = List(Try(1),Try(2),Try(3))
  
  aMap.get("BBB").foreach { Option(_).foreach { Console.println(_)}  }
  Console.println(integer)
  Console.println(Try(1).flatMap(a=>Try(0).map{ b => a/b }))
  
  val bag1 = List("1", "2", "foo", "3", "bar")
  val bag2 = List(1,2,3,4)
  val sum = bag1.map(a=>toInt(a))
  Console.println(sum.flatten)
  
  val l1 = List[Int](1,2)
  val l2 = List[Int](3,4)
//  val result = l1.map(x =>l2.flatMap(y => x+y))
  val result = alist.flatMap(x => 1+x)
 
  Console.println(s"result = " + result)
  
  def toInt(in: String): Option[Int] = {
    import scala.util.Try
    (Try[Option[Int]]{
        Some(Integer.parseInt(in.trim))
      } recover {
        case e: NumberFormatException => Console.println(s"$in sdfdsfdsf" ) 
        None
    }).get
    }

  }