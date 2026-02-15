// Creating Adjacency Matrix Using Edges (Directed & Undirected)

public class Graph01 {

    int[][] adjMatrix;

    public Graph01(int nodes) {
        adjMatrix = new int[nodes][nodes]; // n x n matrix, initialized with 0
    }

    public void addEdgesInMatrix(int[][] edges, boolean isDirected) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (isDirected) {
                adjMatrix[u][v] = 1;      // u -> v
            } else {
                adjMatrix[u][v] = 1;      // u <-> v
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

        int[][] edges = { {0, 2}, {0, 1}, {1, 3} };
        int nodes = 4;

        // Undirected Graph
        System.out.println("Undirected Graph");
        Graph01 undirectedGraph = new Graph01(nodes);
        undirectedGraph.addEdgesInMatrix(edges, false);
        undirectedGraph.printMatrix();

        System.out.println();

        // Directed Graph
        System.out.println("Directed Graph");
        Graph01 directedGraph = new Graph01(nodes);
        directedGraph.addEdgesInMatrix(edges, true);
        directedGraph.printMatrix();
    }
}
























// // Creating Adjacency Matrix Using Edges (Directed & Undirected) for Weighted graph

// public class Graph01 {

//     int[][] adjMatrix;

//     public Graph01(int nodes) {
//         adjMatrix = new int[nodes][nodes]; // n x n matrix, initialized with 0
//     }

//     public void addEdgesWeightedInMatrix(int[][] edges, boolean isDirected) {
//         for (int[] edge : edges) {
//             int u = edge[0];
//             int v = edge[1];
//             int w = edge[2];

//             if (isDirected) {
//                 adjMatrix[u][v] = w;      // u -> v
//             } else {
//                 adjMatrix[u][v] = w;      // u <-> v
//                 adjMatrix[v][u] = w;
//             }
//         }
//     }

//     public void printMatrix() {
//         for (int i = 0; i < adjMatrix.length; i++) {
//             System.out.print("row " + i + " -> ");
//             for (int j = 0; j < adjMatrix[i].length; j++) {
//                 System.out.print(adjMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//         int[][] edges = { {0, 2,10}, {0, 1,20}, {1, 3,30} };
//         int nodes = 4;

//         // Undirected Graph
//         System.out.println("Weighted Undirected Graph");
//         Graph01 undirectedGraph = new Graph01(nodes);
//         undirectedGraph.addEdgesWeightedInMatrix(edges, false);
//         undirectedGraph.printMatrix();

//         System.out.println();

//         // Directed Graph
//         System.out.println("Weighted Directed Graph");
//         Graph01 directedGraph = new Graph01(nodes);
//         directedGraph.addEdgesWeightedInMatrix(edges, true);
//         directedGraph.printMatrix();
//     }
// }







































// // File name: Graph2.java
// public class Graph2 {
//     int adjMatrix[][];

//     public Graph2(int nodes) {
//         adjMatrix = new int[nodes][nodes]; // n x n matrix, 0 means no edge
//     }

//     // edges format: {u, v, weight}
//     public void addEdgesWeighted(int edges[][], boolean isDirected) {
//         for (int edge[] : edges) {
//             int u = edge[0];
//             int v = edge[1];
//             int w = edge[2];   // weight of edge

//             if (isDirected) {
//                 adjMatrix[u][v] = w;
//             } else {
//                 // undirected graph
//                 adjMatrix[u][v] = w;
//                 adjMatrix[v][u] = w;
//             }
//         }
//     }

//     public void printMatrix() {
//         for (int i = 0; i < adjMatrix.length; i++) {
//             System.out.print("row " + i + " -> ");
//             for (int j = 0; j < adjMatrix[i].length; j++) {
//                 System.out.print(adjMatrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {

//         // {u, v, weight}
//         int edges[][] = {
//             {0, 2, 5},
//             {0, 1, 3},
//             {1, 3, 2}
//         };

//         int nodes = 4;

//         Graph2 graph = new Graph2(nodes);
//         graph.addEdgesWeighted(edges, false); // false = undirected
//         graph.printMatrix();
//     }
// }


