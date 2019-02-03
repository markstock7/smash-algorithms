package algorithms.hashtable

/**
  * https://leetcode.com/problems/minimum-window-substring
  */
object MinimumWindow {
  def solution(s: String, t: String): String = {
    if (s.isEmpty || t.isEmpty) return ""
  
    import scala.collection.mutable
    val required: mutable.Map[Char, Int] = mutable.Map.empty
    t.foreach(c => required(c) = required.getOrElseUpdate(c, 0) + 1)
    
    var requiredCount = t.length
    var len = Int.MaxValue
    var left = 0
    var start = 0

    for (right <- s.indices) {
      val c = s.charAt(right)
      
      if (required.contains(c)) {
        if (required(c) > 0) requiredCount -= 1
        required(c) -= 1
      }
      
      while (requiredCount == 0) {
        if (right - left + 1 < len) {
          start = left
          len = right - left + 1
        }
        val l = s.charAt(left)
        
        if (required.contains(l)) {
          required(l) += 1
          if (required(l) > 0) requiredCount += 1
        }
    
        left += 1
      }
    }
    
    if (len == Int.MaxValue) "" else s.substring(start, start + len)
  }
}