package algorithms.dp

/**
  * https://leetcode.com/problems/fibonacci-number/submissions/
  */
object NthFibonacci {
  // Time: O(2^N), Space: O(N)
  def solutionRecursive(N: Int): Int = {
    if (N <= 0) 0
    else if (N == 1)  1
    else solutionRecursive(N - 1) + solutionRecursive(N - 2)
  }
  
  // Time: O(N), Space: O(N)
  def solutionDp1(N: Int): Int = {
    if (N <= 0) return 0
    if (N == 1) return 1
    val d: Array[Int] = Array.ofDim(N + 1)
    d(0) = 0; d(1) = 1
    for (i <- 2 to N) d(i) = d(i - 1) + d(i - 2)
    d(N)
  }
  
  // Time: O(N), Space: O(1)
  def solutionDp2(N: Int): Int = {
    if (N <= 0) return 0
    if (N == 1) return 1
    var first = 0
    var second = 1
    var third = 0 + 1
    for (_ <- 2 to N) {
      third = first + second
      first = second
      second = third
    }
    third
  }
  
  def solutionMath(N: Int): Int = {
    val phi: Double  = (1 + Math.sqrt(5)) / 2;
    Math.round(Math.pow(phi, N)/ Math.sqrt(5)).toInt
  }
}