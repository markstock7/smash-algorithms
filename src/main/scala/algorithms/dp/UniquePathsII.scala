package algorithms.dp

object UniquePathsII {
  def solution(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid.head.length
    if (m < 1 || n < 1) return 0
    val d: Array[Array[Int]] = Array.fill(m ,n)(1)
    for (i <- 0 until m; j <- 0 until n) {
      (i, j, obstacleGrid(i)(j)) match {
        case (0, 0, 1) => d(i)(j) = 0
        case (0, 0, 0) => d(i)(j) = 1
        case (0, _, 0) => d(i)(j) = d(i)(j - 1)
        case (_, 0, 0) => d(i)(j) = d(i - 1)(j)
        case (_, _, 1) => d(i)(j) = 0
        case _ => d(i)(j) = d(i - 1)(j) + d(i)(j - 1)
      }
    }
    d(m - 1)(n - 1)
  }
  
  def solutionII(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid.head.length
    if (m < 1 || n < 1) return 0
    val d: Array[Int] = Array.fill(n)(1)
    for (i <- 0 until m; j <- 0 until n) {
      (i, j, obstacleGrid(i)(j)) match {
        case (0, 0, 1) => d(j) = 0
        case (0, 0, 0) => d(j) = 1
        case (0, _, 0) => d(j) = d(j - 1)
        case (_, 0, 0) => d(j) = d(j)
        case (_, _, 1) => d(j) = 0
        case _ => d(j) = d(j - 1) + d(j)
      }
    }
    d(n - 1)
  }
  
}