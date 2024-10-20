package dsaQuestion;

import java.util.Scanner;

public class CountEdges_Graph {
    int v, visited[], g[][], count = 0;
    // v: number of nodes
    // g: Adjacency matrix of v x v
    // visited[i]: 1 means visited, 0 means unvisited

    void createGraph(int nodes) {
        v = nodes; // Number of nodes in the graph
        Scanner in = new Scanner(System.in);
        g = new int[v][v]; // Initialize adjacency matrix
        visited = new int[v]; // Initialize visited array
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.println("Enter value for v" + i + " to v" + j + " (999 for infinity):");
                g[i][j] = in.nextInt(); // Fill adjacency matrix
            }
        }
    }

    void printG() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(g[i][j] + "\t"); // Print adjacency matrix
            }
            System.out.println();
        }
    }

    void Count_Edges() {
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (g[i][j] != 0 && g[i][j] != 999) {
                    count++;
                }
            }
        }
        // For undirected graphs, each edge is counted twice
        count /= 2;
    }

    public static void main(String args[]) {
        CountEdges_Graph obj = new CountEdges_Graph();
        obj.createGraph(4); // Create a graph with 4 nodes
        obj.printG(); // Print the adjacency matrix
        obj.Count_Edges(); // Count the edges
        System.out.println("Total number of edges: " + obj.count);
    }
}
