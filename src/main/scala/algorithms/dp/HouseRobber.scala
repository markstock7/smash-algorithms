package algorithms.dp

object HouseRobber {
  def rob(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    if (nums.length == 1) return nums.head
    val d: Array[Int] = Array.ofDim(nums.length)
    d(0) = nums(0)
    d(1) = Math.max(nums(1), nums(0))
    for (i <- 2 until nums.length) {
      d(i) = Math.max(d(i - 1), d(i - 2) + nums(i))
    }
    d(nums.length - 1)
  }
  
  def robII(nums: Array[Int]): Int = {
    if (nums.isEmpty) return 0
    if (nums.length == 1) return nums.head
    var prev1 = nums(0)
    var prev2 = Math.max(nums(1), nums(0))
    for (i <- 2 until nums.length) {
      val t = prev2
      prev2 = Math.max(prev2, prev1 + nums(i))
      prev1 = t
      
    }
    prev2
  }
}