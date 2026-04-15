package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Lec37_Dijkstra_Algo_With_PriorityQueue {
    public static void main(String[] args) {
        System.out.println("In this lecture mam tell about how to optimize the dijkstra's algorithm using priority queue.");
        List<List<Pairs>> list = new ArrayList<>();
        int v = 9;
        for (int i = 0; i < v; i++) list.add(new ArrayList<>());
        list.get(0).add(new Pairs(1, 4));
        list.get(0).add(new Pairs(4, 8));
        list.get(1).add(new Pairs(2, 8));
        list.get(1).add(new Pairs(4, 11));
        list.get(2).add(new Pairs(3, 7));
        list.get(2).add(new Pairs(6, 4));
        list.get(2).add(new Pairs(8, 2));
        list.get(3).add(new Pairs(7, 9));
        list.get(3).add(new Pairs(6, 14));
        list.get(4).add(new Pairs(5, 1));
        list.get(4).add(new Pairs(8, 7));
        list.get(5).add(new Pairs(6, 2));
        list.get(5).add(new Pairs(8, 6));
        list.get(6).add(new Pairs(7, 10));
        int source = 0;
        DijkstraAlgo dijkstraAlgo = new DijkstraAlgo();
        int[] value = dijkstraAlgo.dijkstraUsingPriorityQueue(list, source);
        System.out.println();
        System.out.println("Distance from source to destination is : ");
        System.out.println("Source\tDestination\tValue");
        for(int i = 0; i < value.length; i++){
            System.out.println(source+"\t\t"+i+"\t\t\t"+value[i]);
        }
    }

    private static void addEdge(List<List<Integer>> list, int u, int v) {
        list.get(u).add(v);
        list.get(v).add(u);
    }
}
