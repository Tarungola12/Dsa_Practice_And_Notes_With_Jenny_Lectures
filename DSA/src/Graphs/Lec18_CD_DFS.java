package Graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Lec18_CD_DFS {
    static HashMap<Integer, List<Integer>> graphUsingHashMap;
    public static void main(String[] args) {
        System.out.println("Cycle Detection in using dfs");
        GraphUsingHashMap graph = new GraphUsingHashMap();
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,5);
        graph.addEdge(2,4);
        graph.addEdge(4,5);
        graphUsingHashMap = graph.getHashMap();
        detectCycleUsingDFS(0);
    }

    public static void detectCycleUsingDFS(int startingVertex) {
        if(graphUsingHashMap.get(startingVertex) == null) return;
        System.out.print(node + " ");
        for(int value : adjMap.get(node)){
            DfsUsingRecursion(value);
        }
    }
}
