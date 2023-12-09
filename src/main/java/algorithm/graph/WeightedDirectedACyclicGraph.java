package algorithm.graph;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.PriorityQueue;

public class WeightedDirectedACyclicGraph {

    public static void main(String[] args) {

        WeightedDirectedACyclicGraph weightedDirectedACyclicGraph = new WeightedDirectedACyclicGraph();

        // A -1-> B -2-> C -3-> D -4-> G
        //       +-1-> E -1-> F --1--+^

        //Create Vertices
        Vertex vertexA = new Vertex("A");
        Vertex vertexB = new Vertex("B");
        Vertex vertexC = new Vertex("C");
        Vertex vertexD = new Vertex("D");
        Vertex vertexE = new Vertex("E");
        Vertex vertexF = new Vertex("F");
        Vertex vertexG = new Vertex("G");

        // Edge A to B
        Edge edgeA2B = new Edge(1, vertexB);
        Edge edgeB2C = new Edge(6, vertexC);
        Edge edgeB2E = new Edge(20, vertexE);
        Edge edgeC2D = new Edge(3, vertexD);
        Edge edgeD2G = new Edge(4, vertexG);
        Edge edgeE2F = new Edge(1, vertexF);
        Edge edgeF2G = new Edge(1, vertexG);

        // Add edges
        vertexA.addEdge(edgeA2B);
        vertexB.addEdge(edgeB2C);
        vertexB.addEdge(edgeB2E);
        vertexC.addEdge(edgeC2D);
        vertexD.addEdge(edgeD2G);
        vertexE.addEdge(edgeE2F);
        vertexF.addEdge(edgeF2G);

        Graph graph = new Graph();
        graph.vertices = new Vertex[]{vertexA, vertexB, vertexC, vertexD, vertexE, vertexF, vertexG};

        weightedDirectedACyclicGraph.printGraphBFS(vertexE);

        // System.out.println(" Shortest Distance from A to G is: "+weightedGraph.findShortestPath(vertexA,vertexG));
    }

    public void printGraphBFS(Vertex root) {
        ArrayDeque<Vertex> queue = new ArrayDeque<>();
        queue.offer(root);
        HashSet<Vertex> visited = new HashSet<>();
        while (queue.size() > 0) {
            Vertex vertex = queue.poll();
            visited.add(vertex);
            System.out.println(vertex.toString());
            for (Edge edge : vertex.getEdges()) {
                if (!visited.contains(edge.endVertex))
                    queue.add(edge.endVertex);
            }
        }
    }

    public int findShortestPath(Vertex from, Vertex to) {
        int shortestPath = 0;

        ArrayDeque<Vertex> queue = new ArrayDeque<>();
        queue.offer(from);
        HashSet<Vertex> visited = new HashSet<>();
        while (queue.size() > 0) {
            Vertex vertex = queue.poll();
            visited.add(vertex);
            shortestPath += vertex.getLowestWeightedEdge().distance;
            System.out.println(vertex);
            Vertex nearestVertex = vertex.getNearestVertex();
            if (!visited.contains(nearestVertex)) {
                queue.add(nearestVertex);
            }

            if (to.equals(nearestVertex))
                return shortestPath;

        }

        return shortestPath;
    }

    public static class Graph {
        Vertex[] vertices;
    }

    public static class Vertex {
        String name;
        private final PriorityQueue<Edge> edges = new PriorityQueue<>();

        public Vertex(String name) {
            this.name = name;
        }

        public boolean addEdge(Edge edge) {
            return edges.add(edge);
        }

        public PriorityQueue<Edge> getEdges() {
            return edges;
        }

        public Vertex getNearestVertex() {
            return edges.peek().endVertex;
        }

        public Edge getLowestWeightedEdge() {
            return edges.peek();
        }

        @Override
        public String toString() {
            StringBuilder edgesStr = new StringBuilder();
            edges.stream().forEach(edgesStr::append);
            return " V[name: " + name + "]" + edgesStr;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            if (null == obj) {
                return false;
            }

            Vertex vertex;
            if (obj instanceof Vertex) {
                vertex = (Vertex) obj;
            } else {
                return false;
            }

            return this.name.equals(vertex.name);
        }
    }

    public static class Edge implements Comparable {
        int distance = 0;
        Vertex startV;
        Vertex endVertex;

        public Edge(int distance, Vertex startV, Vertex endVertex) {
            this.distance = distance;
            this.startV = startV;
            this.endVertex = endVertex;
        }

        public Edge(int distance, Vertex endVertex) {
            this.distance = distance;
            this.endVertex = endVertex;
        }

        @Override
        public String toString() {

            if (null == startV && null != endVertex)
                return "\n \t\t\t -- [w:" + distance + "] -->" + endVertex.name;

            if (null != startV && null != endVertex)
                return "\n \t\t\t " + startV.name + " -- [w:" + distance + "] -->" + endVertex.name;

            return "\n \t\t\t  -- [w:" + distance + "] --";
        }

        @Override
        public int compareTo(Object o) {
            // Comparator.reverseOrder();
//            String s = new String();
//            s.compareTo("");
            Edge inEdge = (Edge) o;
            return Integer.compare(this.distance, inEdge.distance);
        }
    }

}
