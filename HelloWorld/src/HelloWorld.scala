

/**
 * @author leonardo
 */
object HelloWorld extends App {
  val str1 = "Hello World, Scala!"
  Console.println(str1)
  val alist = List[String]("Hello" , "World" , "Scala")
  alist.foreach(S=>(Console.println(S)))
  //alist.sort((s,t)=>s.charAt(0).toLower() < t.charAt(0).toLower())
  //alist.sort((s, t) =>s.charAt(0).toLower<t.charAt(0).toLower))
  alist.filter { x => x.length()>4 }
  val aMap = Map("AAA"->1, "BBB"->2, "CCC"->3)
  val integer =  aMap.get("AAA") match
  {
    case Some(2) => 2
    case None => 0
    case _ => -1
  }
  
  
  aMap.get("BBB").foreach { Option(_).foreach { Console.println(_)}  }
  Console.println(integer)
  
  val bag1 = List("1", "2", "foo", "3", "bar")
  val bag2 = List(1,2,3,4)
  val sum = bag1.map(a=>toInt(a))
  Console.println(sum.flatten)
  
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