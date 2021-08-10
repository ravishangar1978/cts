object cts {
  def fibonacci(n: Int): Int =
    if (n < 3) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  def main(args: Array[String]) {
    for {i <- List.range(1, 17)}
      yield { print(fibonacci(i) + ", ") }
    println("...")

  }
  }
// new comment