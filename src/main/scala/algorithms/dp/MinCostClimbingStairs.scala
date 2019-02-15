package algorithms.dp

object MinCostClimbingStairs {
  /**
    * d(i) = Min(d(i - 2), d(i - 1)) + cost[i]
    * @param cost
    * @return
    */
  def solution(cost: Array[Int]): Int = {
    if (cost.isEmpty) return 0
    if (cost.length == 1) return cost.head
    var (first, second) = (cost.head, cost(1))
    for (i <- 2 until cost.length) {
      val cur = Math.min(first, second) + cost(i)
      first = second
      second = cur
    }
    Math.min(first, second)
  }
}