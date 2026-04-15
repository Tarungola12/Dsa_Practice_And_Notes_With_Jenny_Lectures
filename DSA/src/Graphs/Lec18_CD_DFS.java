package Graphs;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Lec18_CD_DFS {

    static HashMap<Integer, List<Integer>> graphUsingHashMap;
    static HashMap<Integer, Boolean> visited = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Cycle Detection in using dfs");
        GraphUsingHashMap graph = new GraphUsingHashMap();
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 5);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);
        graphUsingHashMap = graph.getHashMap();
        System.out.println(detectCycleUsingDFS(0, -1));
    }

    public static Boolean detectCycleUsingDFS(int startingVertex, int parent) {
        visited.put(startingVertex, Boolean.TRUE);
        for (Integer num : graphUsingHashMap.get(startingVertex)) {
            if (visited.get(num) == null) {
                if(detectCycleUsingDFS(num, startingVertex)) return true;
            } else if (num != parent) {
                return true;
            }
        }
        return false;
    }
}
