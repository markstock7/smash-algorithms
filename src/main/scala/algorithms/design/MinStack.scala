package algorithms.design

class MinStack() {

	/** initialize your data structure here. */
	private var stackData: List[Int] = List.empty
	private var stackMin: List[Int] = List.empty


	def push(x: Int) {
		stackData = x +: stackData
		if (stackMin.isEmpty || stackMin.head >= x) stackMin = x +: stackMin
	}

	def pop: Unit = {
		(top, min) match {
			case (Some(t), Some(m)) if t == m ⇒ stackMin = stackMin.tail
			case _ ⇒
		}
		stackData = stackData.tail
	}

	def top: Option[Int] = stackData.headOption
	def min: Option[Int] = stackMin.headOption

}