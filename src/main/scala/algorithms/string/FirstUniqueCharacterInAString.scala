package algorithms.string

object FirstUniqueCharacterInAString {
	def firstUniqChar(s: String): Int = {
		val distincts = s.zipWithIndex.groupBy(_._1).filter(_._2.size == 1).mapValues(_.minBy(_._2)).values
		if (distincts.nonEmpty) distincts.minBy(_._2)._2 else -1
	}
}