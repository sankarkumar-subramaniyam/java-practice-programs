/**
 *
 */
package algorithm.graph;

import java.util.*;

/**
 * @author Sankar
 *
 */
public class BreadthFirstSearchGraph {

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> revArr = new ArrayList<>();
        System.out.println("a: " + a + " ; a.size():" + a.size());
        for (int i = a.size() - 1; i > 0; i--) {
            System.out.println("i: " + i + " ; a.get(i):" + a.get(i));
            revArr.add(i, a.get(i));
        }
        return revArr;

    }

    public static void main(String[] arg) {
        System.out.println("reverseArray: " + reverseArray(Arrays.asList(1, 4, 3, 2)));


        System.out.println("test graph");

        Graph<String> myGraph = new Graph<>();
        myGraph.addEdges("1", "2");

        myGraph.addEdges("2", "1");
        myGraph.addEdges("2", "3");
        myGraph.addEdges("2", "A");
        myGraph.addEdges("2", "B");

        myGraph.addEdges("3", "2");
        myGraph.addEdges("3", "4");

        myGraph.addEdges("4", "3");
        myGraph.addEdges("4", "5");
        myGraph.addEdges("4", "i");
        myGraph.addEdges("4", "ii");
        myGraph.addEdges("4", "iii");
        myGraph.addEdges("4", "iv");

        myGraph.addEdges("5", "4");
        myGraph.addEdges("5", "6");
        myGraph.addEdges("5", "a");

        myGraph.addEdges("a", "5");
        myGraph.addEdges("a", "b");
        myGraph.addEdges("a", "c");
        myGraph.addEdges("a", "d");

        myGraph.addEdges("6", "5");
        myGraph.addEdges("6", "7");

        myGraph.addEdges("7", "6");
        myGraph.addEdges("7", "10");
        myGraph.addEdges("7", "20");
        myGraph.addEdges("7", "30");
        myGraph.addEdges("7", "40");
        myGraph.addEdges("7", "50");

        myGraph.addEdges("30", "1");

        //myGraph.printBF("1");

        // System.out.println("================ DF =======================");
        // myGraph.printDF("1");

    }

    private static class Graph<T> {
        private final HashMap<T, LinkedList<T>> edges = new HashMap<>();
        private T vertex;

        public boolean addEdges(T vertex, T edge) {
            if (null == edges.get(vertex)) {
                java.util.LinkedList<T> edgeList = new LinkedList<T>();
                edgeList.add(edge);
                edges.put(vertex, edgeList);
                return true;
            } else {
                return edges.get(vertex).add(edge);
            }
        }

        public boolean printBF(T root) {

            System.out.println("================" + edges + "================");

            HashSet<T> visited = new HashSet<>();
            LinkedList<T> adjQueue = new LinkedList<>();

            visited.add(root);
            adjQueue.push(root);

            int l = 0;
            while (adjQueue.size() != 0) {
                T vertex = adjQueue.poll();
                // System.out.println((vertex.toString().startsWith("-------------------------------------- End Of Level :-")) ? "--- End Of Level :-"+l+"------" : "BF|--" + vertex.toString() + "--|");
                System.out.println("BF|--" + vertex.toString() + "--|");
                if (edges.containsKey(vertex)) {
                    //   System.out.println("|--*** edges (" + edges.get(vertex) + ")***--|");

                    edges.get(vertex).forEach(v -> {
                        if (!visited.contains(v)) {
                            adjQueue.add(v);
                            visited.add(v);
                        }
                    });

                    //  adjQueue.add((T) ("-------------------------------------- End Of Level :-"+l+"------"));
                    // l++;
                    // System.out.println("|--*** adjQueue (" + adjQueue + ")***--|");
                }
            }
            return true;
        }

        public boolean printDF(T root) {
            HashSet<T> visited = new HashSet<>();
            LinkedList<T> adj = new LinkedList<>();
            adj.push(root);

            while (!adj.isEmpty()) {
                T vertex = adj.poll();
                System.out.println("DF|--" + vertex.toString() + "--|");
                dfRecursion(vertex, visited, adj);
            }

            return true;
        }

        private HashSet<T> dfRecursion(T vertex, HashSet<T> visited, LinkedList<T> adj) {
            if (edges.containsKey(vertex)) {
                edges.get(vertex).forEach(v -> {
                    if (!visited.contains(v)) {
                        adj.push(v);
                        visited.add(v);
                    }
                });
            }
            return visited;
        }

    }

}
