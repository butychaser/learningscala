

/**
 * @author leonardo
 */
object QueueClient extends App {
  val aQueue = Queue(1,2,3);
  Console.println(aQueue.head)
  Console.println(aQueue)
  val aQueueAppend = aQueue.append(0)
  Console.println(aQueue)
  Console.println(aQueueAppend)

}