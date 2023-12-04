package algorithm.graph;

public class GraphWithMatrix {

    public static void main(String[] args) {
        GraphWithMatrix graphWithMatrix = new GraphWithMatrix();

        Graph graph = new Graph(5);
        graph.addEdgesDirected(0, 1);
        graph.addEdgesDirected(0, 2);
        graph.addEdgesDirected(0, 3);
        graph.addEdgesDirected(1, 2);
        graph.addEdgesDirected(1, 3);
        graph.addEdgesDirected(2, 3);
        graph.printGraph();

        graph.getEdgesForNode(1);
    }

    static class Graph {
        int numVertices;
        int[][] adjMatrix;

        public Graph(int numVertices) {
            this.numVertices = numVertices;
            adjMatrix = new int[numVertices][numVertices];
        }

        public void addEdgesUndirected(int start, int end) {
            adjMatrix[start][end] = 1;
            adjMatrix[end][start] = 1;
        }

        public void addEdgesDirected(int start, int end) {
            adjMatrix[start][end] = 1;
        }

        public int[] getEdgesForNode(int root) {
            int[] edges = new int[numVertices];
            int edgesCount = 0;
            for (int col = 0; col < adjMatrix[root].length; col++) {
                if (adjMatrix[root][col] == 1) {
                    edges[edgesCount] = col;
                    edgesCount++;
                    System.out.println("V[" + root + "] --> e: " + col + " ; edgesCount:" + edgesCount);
                }
            }
            return edges;
        }

        public void printGraph() {
            for (int row = 0; row < numVertices; row++) {
                for (int col = 0; col < numVertices; col++) {
                    if (adjMatrix[row][col] == 1) {
                        System.out.println("V[" + row + "] --> e: " + col);
                    }
                }
            }
        }
    }
}
