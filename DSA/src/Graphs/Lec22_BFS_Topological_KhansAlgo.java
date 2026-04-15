package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec22_BFS_Topological_KhansAlgo {
    public static void main(String[] args) {
        System.out.println("In this lecture we will se Topologiacl sorting using bfs of khan's algorithm");
        List<List<Integer>> list = new ArrayList<>();
        int v = 6;
        for(int i = 0; i < v; i++) list.add(new ArrayList<>());
        addEdge(list, 0, 1);
        addEdge(list, 0, 2);
        addEdge(list, 1, 3);
        addEdge(list, 2, 1);
        addEdge(list, 2, 3);
        addEdge(list, 3, 4);
        addEdge(list, 5, 3);
        TopologicalSorting topologicalSorting = new TopologicalSorting();
        topologicalSorting.topologicalUsingBfs(list);
    }
    public static void addEdge(List<List<Integer>> list ,int u,int v){
        list.get(u).add(v);
     }
}

