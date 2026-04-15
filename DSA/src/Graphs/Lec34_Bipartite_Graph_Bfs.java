package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec34_Bipartite_Graph_Bfs {
    public static void main(String[] args) {
        System.out.println("In this lecture we will see how to check whether the graph is bipartite or not using color strategy");
        BipartiteGraph bipartiteGraph = new BipartiteGraph();
        int v = 4;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i < v; i++) list.add(new ArrayList<>());
//        addEdge(list, 0 ,1);
//        addEdge(list, 0 ,2);
//        addEdge(list, 1 ,2);
        addEdge(list, 0,1);
        addEdge(list, 0,3);
        addEdge(list, 3,2);
        addEdge(list, 2,1);
        boolean result = bipartiteGraph.isGraphBipartite(list);
        System.out.println(result);
    }

    private static void addEdge(List<List<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }
}
