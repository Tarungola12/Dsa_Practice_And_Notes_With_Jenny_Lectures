package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec25_StronglyConnected_Kosarajus_Algorithm {
    public static void main(String[] args) {
//==========================================================================================================
        System.out.println("PLS DRY RUN OTHERWISE IT WILL BE HARD TO UNDERSTAND THE CODE");
//==========================================================================================================




        System.out.println("In this lecture we will understand what is strongly connected components in directed graph and how to find them using kosaraju's algorithm");
        int v = 12;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < v; i++) list.add(new ArrayList<>());
        addEdge(list, 1, 2);
        addEdge(list, 2, 3);
        addEdge(list, 3, 1);
        addEdge(list, 3, 4);
        addEdge(list, 4, 5);
        addEdge(list, 4, 6);
        addEdge(list, 5, 6);
        addEdge(list, 6, 7);
        addEdge(list, 7, 4);
        addEdge(list, 7, 8);
        addEdge(list, 9, 8);
        addEdge(list, 9, 10);
        addEdge(list, 10, 11);
        addEdge(list, 11, 9);
        ConnectedComponents connectedComponents = new ConnectedComponents();
        connectedComponents.stronglyConnectedComponents(list);

    }

    private static void addEdge(List<List<Integer>> list, int u, int v) {
        list.get(u).add(v);
    }
}
