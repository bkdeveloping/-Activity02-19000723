

object isEven extends App{
  def isEven(x: Int): Boolean = {
    if (x % 2 == 0) true
    else false
  }

  def isOdd(n: Int): Boolean = !(isEven(n))


  println("Enter the know even :")
  val num1 = scala.io.StdIn.readInt()
  println(isEven(num1))

  println("Enter the  odd :")
  val num2 = scala.io.StdIn.readInt()
  println(isOdd(num2))
}
