package algorithms.array

object NextPermutation {
  
  private def swap(nums: Array[Int], i: Int, j: Int): Unit = {
    val tmp = nums(i)
    nums(i) = nums(j)
    nums(j) = tmp
  }
  
  def solution(nums: Array[Int]): Unit = {
    if (nums.isEmpty || nums.length < 2) return
    val n = nums.length
    var p = n - 2
    
    while(p >= 0 && nums(p) >= nums(p + 1)) p -= 1
    
    if (p >= 0) {
      var i = n - 1
      while (i > p && nums(i) <= nums(p)) i -= 1
      swap(nums, i, p)
    }
    
    var i = p + 1
    var j = n - 1
    while (i < j) {
      swap(nums, i, j)
      i += 1
      j -= 1
    }
  }
}