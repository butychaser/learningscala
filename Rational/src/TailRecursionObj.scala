

/**
 * @author leonardo
 */
object TailRecursionObj {
  def approximateGuess(guess:Int):Int = 
  {
    Console.println("Guess" + guess)
    if(goodGuess(guess)) return guess
    else
      approximateGuess(improve(guess))
  }
  
  def goodGuess(guess:Int):Boolean = 
  {
    if(guess == 1)  true
    else 
      false
  }
  
    def improve(guess:Int):Int = 
  {
    guess - 1
  }
}