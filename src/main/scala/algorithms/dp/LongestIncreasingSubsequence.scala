package algorithms.dp

object LongestIncreasingSubsequence {
  def solution(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    val d: Array[Int] = Array.ofDim(nums.length)
    var max = 1
    d(0) = 1
    for (i <- nums.indices) {
      for (j <- 0 until i) {
        val cur = if (nums(i) > nums(j)) d(j) + 1 else 1
        d(i) = Math.max(d(i), cur)
      }
      max = Math.max(max, d(i))
    }
    max
  }
  
  private def bsInsert(d: Array[Int], len: Int, x: Int): Int = {
    var (low, high) = (0, len - 1)
    while(low <= high) {
      val mid = low + (high - low) / 2
      if (x < d(mid)) high = mid - 1
      else if (x > d(mid)) low = mid + 1
      else return mid
    }
    low
  }
  
  def solutionBs(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    var (n, len) = (nums.length, 0)
    val d: Array[Int] = Array.ofDim(n)
    nums.foreach { n =>
      val i = bsInsert(d, len, n)
      d(i) = n
      if (i == len) len += 1
    }
    len
  }
}