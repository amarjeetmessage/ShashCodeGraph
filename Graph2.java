// File name: Graph2.java
public class Graph2 {
    int adjMatrix[][];

    public Graph2(int nodes) {
        adjMatrix = new int[nodes][nodes]; // n x n matrix, 0 means no edge
    }

    // edges format: {u, v, weight}
    public void addEdgesWeighted(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];   // weight of edge

            if (isDirected) {
                adjMatrix[u][v] = w;
            } else {
                // undirected graph
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            System.out.print("row " + i + " -> ");
            for (int j = 0; j < adjMatrix[i].length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // {u, v, weight}
        int edges[][] = {
            {0, 2, 5},
            {0, 1, 3},
            {1, 3, 2}
        };

        int nodes = 4;

        Graph2 graph = new Graph2(nodes);
        graph.addEdgesWeighted(edges, false); // false = undirected
        graph.printMatrix();
    }
}
