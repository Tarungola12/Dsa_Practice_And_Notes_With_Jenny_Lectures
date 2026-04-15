package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lec19_CD_DisjointSet {
    public static void main(String[] args) {
        System.out.println("In this lecture we will se is there any cycle in the graph and vertex also act as index");
        System.out.println("This method work in disconnected graph");
        int v = 6;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 3);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 5);
        addEdge(graph, 2, 4);
//        addEdge(graph, 4, 5);
        Disjoint disjoint = new Disjoint(graph);
        System.out.println();
        disjoint.hasACycle(graph);
    }

    public static void addEdge(List<List<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // because undirected graph
    }

}

class Disjoint {
    HashMap<Integer, Integer> parentHashMap = new HashMap<>();
    HashMap<Integer, Integer> rankHashMap = new HashMap<>();

    public Disjoint(List<List<Integer>> list) {
        for (List<Integer> list1 : list) {
            for (Integer val : list1) {
                parentHashMap.putIfAbsent(val, val);
                rankHashMap.putIfAbsent(val, 0);
            }
        }
    }

    public void hasACycle(List<List<Integer>> list) {
        for (int i = 0; i < list.size(); i++) {
            for (Integer val : list.get(i)) {
                if (i < val) {
                    if (union(i, val)) {
                        System.out.println("Yes there is cycle exist");
                        return;
                    }
                }
            }
        }
        System.out.println("NO there is no cycle exist");
        return;
    }

    public int find(int vertex) {
        if (parentHashMap.get(vertex) == vertex) return vertex;
        int parent = find(parentHashMap.get(vertex));
        parentHashMap.put(vertex, parent);
        return parent;
    }

    public Boolean union(int start, int end) {
        int parentOfStart = find(start);
        int parentOfEnd = find(end);
        if (parentOfEnd == parentOfStart) return true;
        else if (rankHashMap.get(parentOfStart) > rankHashMap.get(parentOfEnd))
            parentHashMap.put(parentOfEnd, parentOfStart);
        else if (rankHashMap.get(parentOfStart) < rankHashMap.get(parentOfEnd))
            parentHashMap.put(parentOfStart, parentOfEnd);
        else {
            parentHashMap.put(parentOfStart, parentOfEnd);
            rankHashMap.put(parentOfEnd, rankHashMap.get(parentOfEnd) + 1);
        }
        return false;
    }
}