package algorithms.dp

object CoinChange {
  def solution(coins: Array[Int], amount: Int): Int = {
    val d: Array[Array[Int]] = Array.ofDim(coins.length + 1, amount + 1)
    for (i <- 0 to amount) {
      d(0)(i) = Int.MaxValue
    }
    for (i <- 1 to coins.length)
      for (j <- 1 to amount) {
        var useCurCoin = if (j >= coins(i - 1)) d(i)(j - coins(i - 1)) else Integer.MAX_VALUE
        if (useCurCoin != Integer.MAX_VALUE) useCurCoin += 1
        d(i)(j) = Math.min(d(i - 1)(j), useCurCoin)
      }
    if (d(coins.length)(amount) == Integer.MAX_VALUE)  -1 else d(coins.length)(amount)
  }
  
  def solutionII(coins: Array[Int], amount: Int): Int = {
    val d: Array[Int] = Array.ofDim(amount + 1)
    for (i <- 1 to amount) d(i) = Int.MaxValue
    for (i <- 1 to coins.length)
      for (j <- coins(i-1) to amount)
        if (d(j - coins(i - 1)) != Integer.MAX_VALUE)
          d(j) = Math.min(d(j), d(j - coins(i - 1)) + 1)
    if (d(amount) == Integer.MAX_VALUE) -1 else d(amount)
  }
}