package algorithms.backtracking

// https://leetcode.com/problems/combination-sum
object CombinationSum {
  
  def solution(candidates: Array[Int], target: Int): List[List[Int]] = {
    def combAcc(nums: List[Int], target: Int, acc: List[Int]): List[List[Int]] =
      if (target < 0) Nil
      else if (target == 0) List(acc)
      else {
        nums match {
          case Nil => Nil
          case x :: xs => combAcc(x :: xs, target - x, x :: acc) ::: combAcc(xs, target, acc)
        }
      }
    
    combAcc(candidates.toList, target, Nil)
  }
}