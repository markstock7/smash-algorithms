package algorithms.dp

object MaximumSubarray {
  def solution(nums: Array[Int]): Int = {
    var max = Integer.MIN_VALUE
    var cur = 0
    for (i <- nums.indices) {
      cur = if (cur <= 0) nums(i) else cur + nums(i)
      max = Math.max(max, cur)
    }
    max
  }
}
