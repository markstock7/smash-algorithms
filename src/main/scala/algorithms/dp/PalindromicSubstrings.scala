package algorithms.dp

object PalindromicSubstrings {
  /**
    * https://leetcode.com/problems/palindromic-substrings/
    *
    * s(i, j) is Palindromic
    *   if s(i + 1, j - 1) && s(i) == s(j)
    *   or if i == j
    *   or if s + 1 = j && s(i) == s(j)
    * @param s
    * @return
    */
  def solution(s: String): Int = {
    val n = s.length
    var d = Array.fill(n)(Array.ofDim[Boolean](n))
    var count = 0
    
    for (i <- (n - 1) to 0 by -1) {
      for (j <- i until n) {
        if (i == j) d(i)(j) = true
        else if (i + 1 == j) d(i)(j) = s.charAt(i) == s.charAt(j)
        else d(i)(j) = s.charAt(i) == s.charAt(j) && d(i + 1)(j - 1)
        
        if (d(i)(j)) count += 1
      }
    }
    
    count
  }
}