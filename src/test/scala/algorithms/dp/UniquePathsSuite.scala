package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class UniquePathsSuite extends FunSuite {
  import UniquePaths._
  
  test("UniquePaths solutionI") {
    assert(solution(3, 3) == 6)
    assert(solution(3, 2) == 3)
    assert(solution(7, 3) == 28)
  }
  
  test("UniquePaths solutionII") {
    assert(solutionII(3, 3) == 6)
    assert(solutionII(3, 2) == 3)
    assert(solutionII(7, 3) == 28)
  }
  
  test("UniquePaths solutionIII") {
    assert(solutionIII(3, 3) == 6)
    assert(solutionIII(3, 2) == 3)
    assert(solutionIII(7, 3) == 28)
  }
}