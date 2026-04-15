package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec24_Connected_Components_Undirected_Graph {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand how to find connected components in undirected graph");
        List<List<Integer>> list = new ArrayList<>();
        int v = 12;
        for (int i = 0; i < v; i++) list.add(new ArrayList<>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 1, 2);
        addEdge(list, 3, 4);
        addEdge(list, 4, 5);
        addEdge(list, 4, 6);
        addEdge(list, 4, 7);
        addEdge(list, 6, 8);
        addEdge(list, 7, 8);
        addEdge(list, 9, 10);
        addEdge(list, 11, 11);
        ConnectedComponents connectedComponents = new ConnectedComponents();
        System.out.println();
        connectedComponents.findConnectedComponentsUsingBFS(list);

        // using dfs we can also do :
        System.out.println();
        System.out.println("Now answer from dfs result ");
        System.out.println();
        connectedComponents.findConnectedComponentsUsingDFS(list);

        // using disjoint set we can also do :
        System.out.println();
        System.out.println("Now answer from disjoint set result ");
        System.out.println();
        connectedComponents.findConnectedComponentsUsingDisjointSet(list);
    }

    private static void addEdge(List<List<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }
}
