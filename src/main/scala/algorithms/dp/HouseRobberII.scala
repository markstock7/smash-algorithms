package algorithms.dp

object HouseRobberII {
  
  def rob(nums: Array[Int]): Int = {
    def _rob(nums: Array[Int], start: Int, end: Int): Int = {
      var prev1 = 0
      var prev2 = 0
      for (i <- start to end) {
        val t = prev2
        prev2 = Math.max(prev2, prev1 + nums(i))
        prev1 = t
      }
      prev2
    }
    
    if (nums.isEmpty) return 0
    if (nums.length == 1) return nums.head
    Math.max(_rob(nums, 0, nums.length - 2), _rob(nums, 1, nums.length - 1))
  }
}