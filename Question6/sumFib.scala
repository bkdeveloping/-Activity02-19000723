
object sumFib extends App{
  def sumFib(x: Int): Int = x match {

    case x if (x == 0) => 0
    case x if (x == 1) => 1
    case _ => sumFib(x - 1) + sumFib(x - 2)
  }

  println("Enter terms to print Fibonacci Sequence:")
  val b = scala.io.StdIn.readInt()
  var i = 0
  for (i <- 0 until b) {
    print(sumFib(i) + "  ")
  }

}