package algorithms.graph

import java.util

case class UndirectedGraphNode(
  label: Int,
  neighbors: util.ArrayList[UndirectedGraphNode]
) {
  def equals(g2: UndirectedGraphNode): Boolean = false
  def copy: UndirectedGraphNode = this
}

object UndirectedGraphNode {
  def apply(label: Int): UndirectedGraphNode = UndirectedGraphNode(label, new util.ArrayList())
}