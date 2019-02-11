package algorithms.dp

object LongestPalindromicSubstring{
  def solution(s: String): String = {
    if (s.length <= 1) return s
    var (start, end, max) = (0, 0, 0)
    val d: Array[Array[Boolean]] = Array.ofDim(s.length, s.length)
    for(j <- 0 until s.length) {
      for (i <- j to 0 by -1) {
        if (i == j) d(i)(j) = true
        if (i + 1 == j) d(i)(j) = s(i) == s(j)
        else if (j > i && s(i) == s(j)) d(i)(j) = d(i + 1)(j - 1)
        if (d(i)(j) && (j - i + 1) > max) {
          start = i
          end = j
          max = j - i + 1
        }
      }
    }
    s.substring(start, end + 1)
  }
}
