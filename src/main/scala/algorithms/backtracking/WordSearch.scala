package algorithms.backtracking

object WordSearch {
  
  private def exist(board: Array[Array[Char]], visited: Array[Array[Boolean]], i: Int, j: Int, word: String, idx: Int): Boolean = {
    if (idx == word.length) return true
    if (i < 0 || i >= board.length || j < 0 || j >= board.head.length || visited(i)(j) || board(i)(j) != word.charAt(idx))
      return false
    
    visited(i)(j) = true
    
    val existed = exist(board, visited, i - 1, j, word, idx + 1) ||
      exist(board, visited, i+1, j, word, idx+1) ||
      exist(board, visited, i, j-1, word, idx+1) ||
      exist(board, visited, i, j+1, word, idx+1)
    visited(i)(j) = false
    
    existed
  }
  
  /**
    * https://leetcode.com/problems/word-search/
    * @param board
    * @param word
    * @return
    */
  def exist(board: Array[Array[Char]], word: String): Boolean = {
    if (board.isEmpty || board.head.isEmpty) return false
    val m = board.length
    val n = board.head.length
    val visited: Array[Array[Boolean]] = Array.ofDim(m, n)
    for (i <- board.indices)
      for (j <-  board.head.indices)
        if (exist(board, visited, i, j, word, 0)) return true
    false
  }
}