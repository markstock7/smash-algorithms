package algorithms.array

object MajorityElement {
  def solution(nums: Array[Int]): Int = {
    var majIndex = 0
    var count = 0
    for (i <- nums.indices) {
      if(nums(majIndex) == nums(i))
        count += 1
      else
        count -= 1
      
      if(count == 0){
        majIndex = i
        count = 1
      }
    }
    nums(majIndex)
  }
}
