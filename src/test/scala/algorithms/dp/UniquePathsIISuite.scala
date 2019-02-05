package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class UniquePathsIISuite extends FunSuite {
  import UniquePathsII._
  
  test("UniquePathsII solution") {
    assert(solution(Array(Array(1))) == 0)
    assert(solution(Array(Array(0))) == 1)
    assert(solution(Array(Array(0, 1))) == 0)
  }
  
  test("UniquePathsII solutionII") {
    assert(solutionII(Array(Array(1))) == 0)
    assert(solutionII(Array(Array(0))) == 1)
    assert(solutionII(Array(Array(0, 1))) == 0)
  }
}