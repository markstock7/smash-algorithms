package algorithms.dp

object CoinChangeII {
  /**
    * d(i, j) = d(i - 1, j) + d(i, j - [i -1])
    * @param amount
    * @param coins
    * @return
    */
  def solution(amount: Int, coins: Array[Int]): Int = {
    val d: Array[Array[Int]] = Array.ofDim(coins.length + 1, amount + 1)
    for (i <- 0 to coins.length) d(i)(0) = 1
    for (i <- 1 to coins.length)
      for (j <- 1 to amount)
        d(i)(j) = d(i - 1)(j) + (if (j >= coins(i - 1)) d(i)(j - coins(i - 1)) else 0)
    d(coins.length)(amount)
  }
  
  def solutionII(amount: Int, coins: Array[Int]): Int = {
    val d: Array[Int] = Array.ofDim(amount + 1)
    d(0) = 1
    for (i <- 1 to coins.length)
      for (j <- 1 to amount)
        d(j) = d(j) + (if (j >= coins(i - 1)) d(j - coins(i - 1)) else 0)
    d(amount)
  }
}