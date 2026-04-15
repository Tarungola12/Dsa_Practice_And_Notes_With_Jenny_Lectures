package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec23_CD_DirectedGraph_Using_BFS {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand how to find the" +
                " cycle in directed graph using khan's algotithm");
        List<List<Integer>> list = new ArrayList<>();
        int v = 10;
        for (int i = 0; i < v; i++) list.add(new ArrayList<>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 1, 3);
        addEdge(list, 1, 2);
        addEdge(list, 3, 4);
        addEdge(list, 4, 1);
        addEdge(list, 2, 5);
        addEdge(list, 5, 6);
        addEdge(list, 5, 8);
        addEdge(list, 6, 7);
        addEdge(list, 8, 7);
        addEdge(list, 7, 9);
        TopologicalSorting topologicalSorting = new TopologicalSorting();
        topologicalSorting.hasACycle(list);
    }

    public static void addEdge(List<List<Integer>> list, int u, int v) {
        list.get(u).add(v);
     }
}
