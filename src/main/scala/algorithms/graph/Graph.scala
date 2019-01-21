package algorithms.graph

import scala.collection.mutable

object Graph {
  /**
    * https://leetcode.com/problems/clone-graph
    * @param node
    * @return
    */
  def clone(node: UndirectedGraphNode): UndirectedGraphNode = {
    val map: mutable.Map[UndirectedGraphNode, UndirectedGraphNode] = mutable.Map.empty
  
    def _clone(node: UndirectedGraphNode): UndirectedGraphNode = {
      val copy = UndirectedGraphNode(node.label)
      map(node) = copy
      for (i <- 0 until node.neighbors.size()) {
        val n = node.neighbors.get(i)
        if (map.contains(n)) copy.neighbors.add(map(n))
        else copy.neighbors.add(_clone(n))
      }
      copy
    }
    
    _clone(node)
  }
  
//  def equal(g1: UndirectedGraphNode, g2: UndirectedGraphNode): Boolean = {
//    val map: mutable.Map[UndirectedGraphNode, Boolean] = mutable.Map.empty
//
//    def _equal(g1: UndirectedGraphNode, g2: UndirectedGraphNode): Boolean = {
//      if (g1.label != g2.label || g1.neighbors.size != g2.neighbors.size) return false
//      map(g1) = true
//      for (ng1 <- g1.neighbors) {
//        for (gn2 <- g2.neighbors) {
//          if (ng1 == gn2)
//        }
//      }
//    }
//
//    equal(g1, g2)
//    false
//  }
}