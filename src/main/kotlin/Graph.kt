/**
* - Constructor: Initializes an empty graph with an empty adjacency list.
* - addVertex(vertex): Adds a new vertex to the graph. If the vertex already exists, it does nothing.
* - addEdge(vertex1, vertex2): Adds an edge between two vertices in the graph. If either of the vertices doesn't exist, it adds them to the graph first.
* - removeEdge(vertex1, vertex2):Removes the edge between two vertices in the graph.
* - removeVertex(vertex): Removes a vertex from the graph along with all its associated edges.
* - hasEdge(vertex1, vertex2): Checks if there is an edge between two vertices in the graph.
* - display(): Displays the adjacency list representation of the graph, showing each vertex along with its adjacent vertices.
*
*/

class Graph {
    private val adjacencyList = mutableMapOf<String, MutableSet<String>>()


    fun addVertex(vertex: String) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList[vertex] = mutableSetOf()
        }
    }


    fun addEdge(vertex1: String, vertex2: String) {
        if (!adjacencyList.containsKey(vertex1)) {
            addVertex(vertex1)
        }
        if (!adjacencyList.containsKey(vertex2)) {
            addVertex(vertex2)
        }
        adjacencyList[vertex1]?.add(vertex2)
        adjacencyList[vertex2]?.add(vertex1)
    }


    fun removeEdge(vertex1: String, vertex2: String) {
        adjacencyList[vertex1]?.remove(vertex2)
        adjacencyList[vertex2]?.remove(vertex1)
    }


    fun removeVertex(vertex: String) {
        if (!adjacencyList.containsKey(vertex)) {
            return
        }
        for (adjacentVertex in adjacencyList[vertex]!!) {
            removeEdge(vertex, adjacentVertex)
        }
        adjacencyList.remove(vertex)
    }


    fun hasEdge(vertex1: String, vertex2: String): Boolean {
        return adjacencyList[vertex1]?.contains(vertex2) ?: false &&
                adjacencyList[vertex2]?.contains(vertex1) ?: false
    }


    fun display() {
        for ((vertex, neighbors) in adjacencyList) {
            println("$vertex -> $neighbors")
        }
    }
}


fun main() {
    val graph = Graph()
    graph.addVertex("A")
    graph.addVertex("B")
    graph.addVertex("C")
    graph.addEdge("A", "B")
    graph.addEdge("A", "C")
    graph.addEdge("B", "C")
    graph.display()
    graph.removeEdge("A", "B")
    graph.display()
    graph.removeVertex("A")
    graph.display()
}
