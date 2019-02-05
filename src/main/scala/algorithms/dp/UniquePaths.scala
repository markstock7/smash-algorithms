package algorithms.dp

object UniquePaths {
  def solution(m: Int, n: Int): Int = {
    if (m < 1 || n < 1) return 0
    val d: Array[Array[Int]] = Array.fill(m ,n)(1)
    for (i <- 1 until m; j <- 1 until n)
      d(i)(j) = d(i - 1)(j) + d(i)(j - 1)
    d(m - 1)(n - 1)
  }
  
  def solutionII(m: Int, n: Int): Int = {
    if (m < 1 || n < 1) return 0
    val d: Array[Int] = Array.fill(n)(1)
    for (i <- 1 until m; j <- 1 until n)
      d(j) = d(j) + d(j - 1)
    d(n - 1)
  }
  
  def solutionIII(m: Int, n: Int): Int = {
    if (m < 1 || n < 1) return 0
    val small = Math.min(m - 1, n - 1)
    val total = m + n - 2
    var result: Long = 1
    var i = 0
    while (i < small) {
      result = result * (total - i) / (i + 1)
      i += 1
    }
    result.toInt
  }
}