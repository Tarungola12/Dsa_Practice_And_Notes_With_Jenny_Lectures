package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lec20_CD_In_DirectedGraph_DFS {
    public static void main(String[] args) {
        int V = 12;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) graph.add(new ArrayList<>());
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        addEdge(graph, 4, 5);
        addEdge(graph, 4, 7);
        addEdge(graph, 5, 6);
        addEdge(graph, 6, 8);
        addEdge(graph, 7, 6);
        addEdge(graph, 9, 10);
        addEdge(graph, 10, 11);
        addEdge(graph, 11, 9);
        DirectedGraphHasCycle directedGraphHasCycle = new DirectedGraphHasCycle();
        System.out.println(directedGraphHasCycle.hasACycle(graph));
    }

    private static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
    }
}


class DirectedGraphHasCycle {
    private HashMap<Integer, Boolean> visited = new HashMap<>();
    private HashMap<Integer, Boolean> pathVisited = new HashMap<>();
    private List<List<Integer>> list;

    public boolean hasACycle(List<List<Integer>> list) {
        this.list = list;
        for (int i = 0; i < list.size(); i++) {
            visited.putIfAbsent(i,Boolean.FALSE);
            pathVisited.putIfAbsent(i,Boolean.FALSE);
        }
        for (int i = 0; i < list.size(); i++) {
            if (!visited.get(i)) {
                if (cycleDetectInDirectedGraphUsingDFS(i)) return true;
            }
        }
        return false;
    }

    private boolean cycleDetectInDirectedGraphUsingDFS(int start) {
        visited.put(start, Boolean.TRUE);
        pathVisited.put(start, Boolean.TRUE);
        for (Integer val : list.get(start)) {
            if (!visited.get(val)) {
                if (cycleDetectInDirectedGraphUsingDFS(val)) return true;
            } else if (pathVisited.get(val)) {
                return true;
            }
        }
        pathVisited.put(start, Boolean.FALSE);
        return false;
    }
}
