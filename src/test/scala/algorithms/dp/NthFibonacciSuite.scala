package algorithms.dp

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NthFibonacciSuite extends FunSuite {
  import NthFibonacci._
  
  test("NthFibonacci") {
    assert(solutionRecursive(5) == 5)
    assert(solutionDp1(5) == 5)
    assert(solutionDp2(5) == 5)
    assert(solutionRecursive(1) == 1)
    assert(solutionDp1(1) == 1)
    assert(solutionDp2(1) == 1)
    assert(solutionRecursive(0) == 0)
    assert(solutionDp1(0) == 0)
    assert(solutionDp2(0) == 0)
    assert(solutionMath(5) == 5)
    assert(solutionMath(0) == 0)
    assert(solutionMath(1) == 1)
    assert(solutionMath(6) == 8)
  }
}


