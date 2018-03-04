package algorithm.graph;

//Java program to print BFS traversal from a given source vertex.
//BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
public class GraphBFSHashMap<T> {
	private int V; // No. of vertices
	private HashMap<T, LinkedList<T>> adj = new HashMap<>(); // Adjacency Lists

	// Constructor
	public GraphBFSHashMap(int v) {
		V = v;
		// adj = new LinkedList[v];
		// for (int i = 0; i < v; ++i)
		// adj[i] = new LinkedList();
	}

	// Function to add an edge into the graph
	public void addEdge(T v, T w) {
		// adj[v].add(w);
		if (adj.containsKey(v)) {
			LinkedList<T> list = adj.get(v);
			list.add(w);
			adj.put(v, list);
		} else {
			LinkedList<T> list = new LinkedList<>();
			list.add(w);
			adj.put(v, list);
		}
	}

	// prints BFS traversal from a given source s
	public void BFS(T s) {
		// Mark all the vertices as not visited(By default
		// set as false)
		HashMap<T, Boolean> visited = new HashMap<>();

		// Create a queue for BFS
		LinkedList<T> queue = new LinkedList<>();

		// Mark the current node as visited and enqueue it
		visited.put(s, true);
		queue.add(s);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			if (adj.containsKey(s)) {
				Iterator<T> i = adj.get(s).listIterator();
				while (i.hasNext()) {
					T n = i.next();
					if (null == visited.get(n) || !visited.get(n)) {
						visited.put(n, true);
						queue.add(n);
					}
				}
			}
		}
	}

	// Driver method to
	public static void main(String args[]) {
		GraphBFSHashMap g = new GraphBFSHashMap(4);

		g.addEdge("0", "1");
		g.addEdge("0", "2");
		g.addEdge("1", "2");
		g.addEdge("2", "0");
		g.addEdge("2", "3");
		// g.addEdge("3", "3");

		System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");

		g.BFS("2");
	}
}
// This code is contributed by Aakash Hasija
