package neetcode.top;

import java.util.LinkedList;

public class Graph {

    public static void printMyGraphPreOrderDF(Vertices vertice) {
        LinkedList<Vertices> visited = new LinkedList<>();
        printVerticesPreOrder(vertice, visited);
    }

    public static void printVerticesPreOrder(Vertices vertices, LinkedList<Vertices> visited) {
        if (!visited.contains(vertices)) {
            visited.add(vertices);
            System.out.println(vertices);
            for (Edge edge : vertices.getEdges()) {
                // System.out.println(edge);
                printVerticesPreOrder(edge.to, visited);
            }
        }
    }

    public static void printMyGraphPostOrderDF(Vertices vertice) {
        LinkedList<Vertices> visited = new LinkedList<>();
        printVerticesPostOrder(vertice, visited);
    }

    public static void printVerticesPostOrder(Vertices vertices, LinkedList<Vertices> visited) {
        if (!visited.contains(vertices)) {
            visited.add(vertices);
            for (Edge edge : vertices.getEdges()) {
                // System.out.println(edge);
                printVerticesPostOrder(edge.to, visited);
            }
            System.out.println(vertices);
        }
    }

    // TODO: Fix this
    public static boolean isLoopExists(Vertices vertices) {
        LinkedList<Vertices> visited = new LinkedList<>();
        return isLoopExistsPreOrder(vertices, visited);
    }

    public static boolean isLoopExistsPreOrder(Vertices vertices, LinkedList<Vertices> visited) {
        if (!visited.contains(vertices)) {
            visited.add(vertices);
            for (Edge edge : vertices.getEdges()) {
                if (visited.contains(edge.to)) {
                    System.out.println(vertices + " ; " + edge + " ; " + edge.to);
                    return true;
                } else {
                    isLoopExistsPreOrder(edge.to, visited);
                }

                // return (visited.contains(edge.to)) ? true : isLoopExistsPreOrder(edge.to, visited);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        //    1    1    5    2
        // A <-> B -> C -> E -> G
        //         -> D -> F -> B
        //    8     1    1    1

        Graph graph = new Graph();

        Vertices verticeA = new Vertices("A");
        Vertices verticeB = new Vertices("B");
        Vertices verticeC = new Vertices("C");
        Vertices verticeD = new Vertices("D");
        Vertices verticeE = new Vertices("E");
        Vertices verticeF = new Vertices("F");
        Vertices verticeG = new Vertices("G");

        Edge edgeAB = new Edge("edge: A-->B", 1, verticeA, verticeB);
//        Edge edgeBA = new Edge("edge: B-->A", 8, verticeB, verticeA);
        Edge edgeBC = new Edge("edge: B-->C", 1, verticeB, verticeC);
        Edge edgeBD = new Edge("edge: B-->D", 1, verticeB, verticeD);
        Edge edgeCE = new Edge("edge: C-->E", 5, verticeC, verticeE);
        Edge edgeDF = new Edge("edge: D-->F", 1, verticeD, verticeF);
        Edge edgeEG = new Edge("edge: E-->G", 2, verticeE, verticeG);
        Edge edgeFB = new Edge("edge: F-->B", 1, verticeF, verticeB);

        verticeA.addEdges(edgeAB);
//        verticeA.addEdges(edgeBA);
        verticeB.addEdges(edgeAB);
//        verticeB.addEdges(edgeBA);
        verticeB.addEdges(edgeBC);
        verticeB.addEdges(edgeBD);
        verticeC.addEdges(edgeCE);
        verticeC.addEdges(edgeBC);
        verticeD.addEdges(edgeDF);
        verticeD.addEdges(edgeBD);
        verticeE.addEdges(edgeCE);
        verticeE.addEdges(edgeEG);
        verticeF.addEdges(edgeDF);
        verticeF.addEdges(edgeFB);
        verticeG.addEdges(edgeEG);

        System.out.println("----------------------------- PreOrder ----------------------------------------");
        printMyGraphPreOrderDF(verticeA);

        System.out.println("----------------------------- PostOrder ----------------------------------------");
        printMyGraphPostOrderDF(verticeA);

        System.out.println("----------------------------- isLoopExists ----------------------------------------");
        System.out.println(" isLoopExists? :" + isLoopExists(verticeA));
    }

    public static class Vertices {
        LinkedList<Edge> edges = new LinkedList<>();
        String value;

        public Vertices(String value) {
            this.value = value;
        }

        public void addEdges(Edge edge) {
            this.edges.add(edge);
        }

        public LinkedList<Edge> getEdges() {
            return edges;
        }

        @Override
        public String toString() {
            return "(V:- " + value + "),";
        }
    }

    public static class Edge {
        Vertices from;
        Vertices to;
        int weight;
        String name;

        public Edge(String name) {
            this.name = name;
            this.weight = 0;
        }

        public Edge(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Edge(String name, int weight, Vertices from, Vertices to) {
            this.name = name;
            this.weight = weight;
            this.from = from;
            this.to = to;
        }

        @Override
        public String toString() {
            return "(E:- " + name + "),";
        }
    }
}
