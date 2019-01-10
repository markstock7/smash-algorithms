package algorithms.array

/**
  * https://leetcode.com/problems/trapping-rain-water/
  */
object TrapRainWater {
  def solution(height: Array[Int]): Int = {
    if (height.isEmpty) return 0
    
    var leftMax = -1
    var rightMax = -1
    var water = 0
    val d = new Array[Int](height.length)
    
    for (i <- height.indices) {
      leftMax = Math.max(leftMax, height(i))
      d(i) = leftMax
    }
    
    for (i <- height.length - 1 to 0 by -1) {
      rightMax = Math.max(rightMax, height(i))
      d(i) = Math.min(d(i), rightMax)
      water += (d(i) - height(i))
    }
    
    water
  }
  
  // Time: O(n), Space: O(1)
  def solution2(height: Array[Int]): Int = {
    if (height.isEmpty) return 0
    var leftMax = -1
    var rightMax = -1
    var water = 0
    var i = 0
    var j = height.length - 1
    while (i <= j) {
      leftMax = Math.max(leftMax, height(i))
      rightMax = Math.max(rightMax, height(j))
      
      if (leftMax < rightMax) {
        water += (leftMax - height(i))
        i = i + 1
      } else {
        water += (rightMax - height(j))
        j = j - 1
      }
    }
    water
  }
}