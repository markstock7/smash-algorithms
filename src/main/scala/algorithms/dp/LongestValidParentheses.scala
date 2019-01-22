package algorithms.dp

/**
  * https://leetcode.com/problems/longest-valid-parentheses/submissions/
  */
object LongestValidParentheses {
  def solutionDP(s: String): Int = {
    val d: Array[Int] = Array.ofDim(s.length)
    var left = 0
    var max = 0
    for (i <- s.indices) {
      if (s.charAt(i) == '(')  left += 1
      else if (left > 0) {
        d(i) = d(i - 1) + 2
        d(i) =  d(i) + (if ((i - d(i)) >= 0 ) d(i-d(i)) else 0)
        max = Math.max(max, d(i))
        left -= 1
      }
    }
    max
  }
  
  def solutionStack(s: String): Int = {
    val stack: Array[Int] = Array.ofDim(s.length + 1)
    var max = 0
    var tail = 0
    stack(0) = -1
    for (i <- s.indices) {
      if (stack(tail) != -1 && s.charAt(stack(tail)) == '(' && s.charAt(i) == ')') {
        tail -= 1
        max = Math.max(max, i - stack(tail))
      } else {
        tail += 1
        stack(tail) = i
      }
    }
    max
  }
}