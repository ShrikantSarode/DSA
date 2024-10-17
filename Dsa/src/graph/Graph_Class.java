package graph;

import java.util.Scanner;

public class Graph_Class {
	int v, visited[], g[][];
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

	public void resetvisited() {
		for (int i = 0; i < v; i++) {
			visited[i] = 0; // Reset visited array to all unvisited
		}
	}

	public void DFS(int source) {
		visited[source] = 1; // Mark the source node as visited
		System.out.println("V" + source); // Print the current node
		for (int i = 0; i < v; i++) {
			if (g[source][i] == 1 && visited[i] != 1) {
				// If there's an edge and the node is unvisited
				DFS(i); // Recursively visit the next node
			}
		}
	}

	public boolean DFS_search(int source, int key) {
		boolean flag = false;
		if (key == source) {
			flag = true; // Key found
		}
		visited[source] = 1; // Mark the source node as visited
		System.out.println("V" + source); // Print the current node
		for (int i = 0; i < v; i++) {
			if (g[source][i] == 1 && visited[i] != 1) {
				// If there's an edge and the node is unvisited
				flag = DFS_search(i, key); // Recursively search the next node
				if (flag)
					break; // Stop searching if the key is found
			}
		}
		return flag; // Return true if the key is found, else false
	}

	public void BFS(int source) {
		int q[] = new int[v]; // Queue for BFS
		int front = 0, rear = -1; // Initialize queue pointers
		visited[source] = 1; // Mark the source node as visited
		q[++rear] = source; // Enqueue the source node

		while (front <= rear) { // While the queue is not empty
			int element = q[front++]; // Dequeue an element
			System.out.print("V" + element + "-"); // Print the current node
			for (int i = 0; i < v; i++) {
				if (g[element][i] == 1 && visited[i] != 1) {
					// If there's an edge and the node is unvisited
					visited[i] = 1; // Mark the node as visited
					q[++rear] = i; // Enqueue the node
				}
			}
		}
	}

	public static void main(String args[]) {
		Graph_Class obj = new Graph_Class();
		obj.createGraph(4); // Create a graph with 4 nodes
		obj.printG(); // Print the adjacency matrix
		obj.resetvisited(); // Reset visited array
		System.out.println("DFS");
		obj.DFS(0); // Perform DFS starting from node 0
		obj.resetvisited(); // Reset visited array
		System.out.println("BFS");
		obj.BFS(0); // Perform BFS starting from node 0
	}
}
