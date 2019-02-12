package algorithms.dp

object ClimbingStairs {
  /**
    * d(i) = d(i - 1) + d(i - 2)
    * @param n
    * @return
    */
  def solution(n: Int): Int = {
    if (n < 1) return 0
    var (v1, v2) = (0, 1)
    for (i <- 1 to n) {
      val t = v1 + v2
      v1 = v2
      v2 = t
    }
    v2
  }
}