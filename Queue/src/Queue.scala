import scala.collection.mutable.ArrayBuffer

trait Queue[T] {
  def head:T
  def tail:Queue[T]
  def append(x:T):Queue[T]
  def toString:String
} 
  object Queue{
    def apply[T]( t:T*):Queue[T] = new QueueImpl[T](t.toList, Nil);
  }
      private class QueueImpl[T]  (
          private val leading:List[T], 
          private val trailing:List[T]
          ) extends Queue[T]
    {

      def mirror:QueueImpl[T] =
      {
        if(leading.isEmpty)
          new QueueImpl( trailing.reverse, Nil)
        else
          this
      }
      def head:T =        mirror.leading.head
      
      def tail:QueueImpl[T] ={
        val q = mirror;
        new QueueImpl(q.leading.tail,q.trailing)
      }
      def append(t:T) = 
        new QueueImpl(leading, t::trailing)
      override def toString:String = (leading:::(trailing.reverse)).toString
      
    }
  
