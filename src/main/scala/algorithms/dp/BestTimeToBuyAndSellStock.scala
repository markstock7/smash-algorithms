package algorithms.dp

object BestTimeToBuyAndSellStock {
  def maxProfit(prices: Array[Int]): Int = {
    var min = Int.MaxValue
    var profit = 0
    prices.foreach{ p =>
      if (p < min) min = p
      profit = Math.max(p - min, profit)
    }
    profit
  }
}