package Recusrssion


  object sum extends App {

    def sum(x: Int): Int = {
      if (x == 1) 1
      else x + sum(x - 1)
    }

    println("Enter the number:")
    val num = scala.io.StdIn.readInt()
    println("sum :" + sum(num))
}
