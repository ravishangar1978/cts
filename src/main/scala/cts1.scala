class cts1 {

      }

object ct{
  def fibonacci1(n: Int): Int =
    if (n < 3) 1
    else fibonacci1(n - 1) + fibonacci1(n - 2)
  def main(args: Array[String]) {
    for {i <- List.range(1, 17)}
      yield { print(fibonacci1(i) + ", ") }
    println("...")


  }
}
