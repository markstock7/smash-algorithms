package algorithms.dp

object DecodeWays {
  private def isValidTwoDigit(a: Char, b: Char) = (a == '1' && b <= '9') || (a == '2' && b <= '6')
  
  /**
    * https://leetcode.com/problems/decode-ways
    * @param s
    * @return
    */
  def numDecodings(s: String): Int = {
    if (s.isEmpty) return 0
    val d: Array[Int] = Array.ofDim(s.length + 1)
    d(0) = 1
    d(1) = if (s.head == '0') 0 else 1
    for (i <- 2 to s.length) {
      if (s.charAt(i - 1) != '0') d(i) += d(i - 1)
      if (isValidTwoDigit(s.charAt(i - 2), s.charAt(i - 1))) d(i) += d(i - 2)
    }
    d(s.length)
  }
}
