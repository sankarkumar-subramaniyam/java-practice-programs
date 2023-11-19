package algorithm.graph;

//Java program to print BFS traversal from a given source vertex.
//BFS(int s) traverses vertices reachable from s.

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

//This class represents a directed graph using adjacency list
//representation
public class GraphBFSHashMapWithHashset {
    private final int V; // No. of vertices
    private final HashMap<String, LinkedList<String>> adj = new HashMap<>(); // Adjacency Lists

    // Constructor
    public GraphBFSHashMapWithHashset(int v) {
        V = v;
        // adj = new LinkedList[v];
        // for (int i = 0; i < v; ++i)
        // adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
	public void addEdge(String v, String w) {
		// adj[v].add(w);
		if (adj.containsKey(v)) {
			LinkedList<String> list = adj.get(v);
			list.add(w);
			adj.put(v, list);
		} else {
			LinkedList<String> list = new LinkedList<>();
			list.add(w);
			adj.put(v, list);
		}
	}

	// prints BFS traversal from a given source s
	public void BFS(String s) {
		// Mark all the vertices as not visited(By default
		// set as false)
		HashSet<String> visited = new HashSet<>();

		// Create a queue for BFS
		LinkedList<String> queue = new LinkedList<String>();

		// Mark the current node as visited and enqueue it
		visited.add(s);
		queue.add(s);

		while (queue.size() != 0) {
			// Dequeue a vertex from queue and print it
			s = queue.poll();
			System.out.print(s + " ");

			// Get all adjacent vertices of the dequeued vertex s
			// If a adjacent has not been visited, then mark it
			// visited and enqueue it
			if (adj.containsKey(s)) {
				Iterator<String> i = adj.get(s).listIterator();
				while (i.hasNext()) {
					String n = i.next();
					if (!visited.contains(n)) {
						visited.add(n);
						queue.add(n);
					}
				}
			}
		}
	}

	public boolean search(String v) {
		if(adj.containsKey(v))
		return true;
		
		for(LinkedList<String> list : adj.values()) {
			if(list.contains(v))
				return true;
		}
		
		return false;
	}

    // Driver method to
    public static void main(String[] args) {
        GraphBFSHashMapWithHashset g = new GraphBFSHashMapWithHashset(4);

        g.addEdge("0", "1");
        g.addEdge("0", "2");
        g.addEdge("1", "2");
        g.addEdge("2", "0");
//		g.addEdge("2", "3");
        // g.addEdge("3", "3");

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        g.BFS("2");

        System.out.println("\n Search for 2 ?: " + g.search("2"));
        System.out.println("\n Search for 3 ?: " + g.search("3"));
    }
}
// This code is contributed by Aakash Hasija
