import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of nodes and edges
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int m = sc.nextInt();

        // Create an adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Input edges
        System.out.println("Enter the edges (u v):");
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(); // From node
            int v = sc.nextInt(); // To node

            // Add the edge to the adjacency list (undirected graph)
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Print the adjacency list
        System.out.println("Adjacency List:");
        for (int i = 0; i < n; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
