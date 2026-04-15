package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec21_TopologicalSortingUsing_DFS {
    public static void main(String[] args) {
        System.out.println("In this lecture we will understand what is topological sorting using dfs algorithm");
        System.out.println("PLS DRY RUN DRY RUN IS IMPORTANT FOR THIS");
        List<List<Integer>> graph = new ArrayList<>();
        int v = 6;
        for(int i = 0; i < v; i++) graph.add(new ArrayList<>());
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 2, 1);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 5, 3);
        addEdge(graph, 5, 4);
        TopologicalSorting topologicalSorting = new TopologicalSorting();

        topologicalSorting.printTopologicalSorting(graph);

    }
    public static void addEdge(List<List<Integer>> list ,int u,int v){
        list.get(u).add(v);
    }
}

