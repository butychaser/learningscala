

/**
 * @author leonardo
 */
class MultiplicationTable (range: Int){
  
  require(range != 0)
  val _range = range
  
  def multiTable = 
  {
    val tableSeq = 
    for(row <- 1 to _range)
      yield {makeRow(row)}
    tableSeq.mkString("\n")
  }
  
  def makeRow(row:Int) = makeRowSeq(row).mkString; 
  def makeRowSeq(row:Int) = {
    
      for( col <- 1 to _range) yield
      {
        val prod = (col* row).toString;
        val padding = " " * (4- prod.length)
        padding + prod
      }
        
  }
 
  override def toString = multiTable
  
}