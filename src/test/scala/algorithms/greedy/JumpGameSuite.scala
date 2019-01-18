package algorithms.greedy

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class JumpGameSuite extends FunSuite {
  import JumpGame._
  
  test("CanJump") {
    assert(canJump(Array(2,3,1,1,4)))
    assert(!canJump(Array(3,2,1,0,4)))
    assert(!canJump(Array()))
  }
  
  test("jump") {
    assert(jump(Array(2,3,1,1,4)) == 2)
    assert(jump(Array(1)) == 0)
    assert(jump2(Array(2,3,1,1,4)) == 2)
    assert(jump2(Array(1)) == 0)
  }
}