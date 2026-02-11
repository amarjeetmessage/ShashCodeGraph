// CreatingAdjacencyMatrixUsingEdgesGivenForUndirectedGraph

public class Graph01 {
    int adjMatrix[][];

    public Graph01(int nodes) {
        adjMatrix = new int[nodes][nodes]; // n x n matrix initialized with 0
    }

    public void addEdgesInMatrix(int edges[][], boolean isDirected) {
        for (int edge[] : edges) {
            int u = edge[0];
            int v = edge[1];

            if (isDirected) {
                adjMatrix[u][v] = 1;
            } else {
                // undirected graph
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
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
        int edges[][] = {{0, 2}, {0, 1}, {1, 3}};
        int nodes = 4;

        Graph01 graph = new Graph01(nodes);
        graph.addEdgesInMatrix(edges, false); // false = undirected
        graph.printMatrix();
    }
}
