package Graphs;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo {
    boolean[] visited;
    int [] distance;
    List<List<Pairs>> list;
    PriorityQueue<Pairs> priorityQueue = new PriorityQueue<>();

    public int[] dijkstra(List<List<Pairs>> list, int source) {
        this.list = list;
        visited = new boolean[list.size()];
        distance = new int[list.size()];
        Arrays.fill(distance , Integer.MAX_VALUE);
        distance[source] = 0;

        for(int i = 0; i < list.size()-1; i++) {
            int node = findUnvisitedVertexWithMinDistance();
            visited[node] = true;
            for(Pairs pair : list.get(node)){
                int v = pair.node;
                int weight = pair.distance;
                if(!visited[v] && distance[node] + weight < distance[v]){
                    distance[v] = distance[node] + weight;
                }
            }
        }
        return distance;
    }

    private int findUnvisitedVertexWithMinDistance() {
        int u = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++){
            if(!visited[i] && distance[i] < min){
                u = i;
                min = distance[i];
            }
        }
        return u;
    }


    public int[] dijkstraUsingPriorityQueue(List<List<Pairs>> list, int source) {
        visited = new boolean[list.size()];
        priorityQueue.add(new Pairs(source,Integer.MAX_VALUE));
        for(int i = 0; i < list.size(); i++){
            Pairs node = priorityQueue.poll();
            for(Pairs pairs : list.get(node.node)){
                int vertex = pairs.node;
                int weight = pairs.distance;
                if(!visited[vertex] && distance[node.node] + weight < distance[vertex]){
                    distance[vertex] = distance[node.node] + weight;
                    priorityQueue.add(pairs);
                }
            }
        }
        return distance;
    }
}
