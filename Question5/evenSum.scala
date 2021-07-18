

object evenSum  extends App{
  def evenSum(n: Int): Int = {
    if (n == 0) 0
    else if (n % 2 != 0) evenSum(n - 1)

    else n + evenSum(n - 2)


  }

  println("Enter the number:")
  val num = scala.io.StdIn.readInt()
  println("Sum : " + evenSum(num))
}
