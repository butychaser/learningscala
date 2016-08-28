

/**
 * @author leonardo
 */
object MergeSortAlgorithm {
  def msort [T] (less:(T,T)=>Boolean)( xs: List[T]) : List[T] = {
    def merge (ys: List[T], zs:List[T]):List[T] = {
      (ys, zs) match  {
           case(_, Nil) => ys
           case(Nil, _) => zs
           case(y::y1,z::z1)    => if(less(y,z))
             y::merge(y1,zs)
           else
             z::merge(ys,z1)
      }
    }
    val n = xs.length/2
    if (n == 0)
       xs
    else
    {
      val(ys, zs) = xs splitAt n
      merge(msort(less)(ys), msort(less)(zs))
    }
  }
 
}