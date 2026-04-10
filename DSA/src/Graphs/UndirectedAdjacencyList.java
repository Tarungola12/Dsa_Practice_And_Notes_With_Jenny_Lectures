package Graphs;

import java.util.AbstractMap;
import java.util.ArrayList;

class Pair{
    int node;
    int weight;

    public Pair(int node, int weight) {
        this.node = node;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "(" + node + ","+weight + ")";
    }
}

public class UndirectedAdjacencyList {
    private ArrayList<Integer>[] adjList;
    private int vertex;

    // we can also use this for store pair
    // record Edge(int node,int weight) {}

    // we can also use
    // AbstractMap.SimpleEntry<Integer,Integer>

    public UndirectedAdjacencyList(int vertex) {
        this.vertex = vertex;
        adjList = new ArrayList[vertex];
        for(int i =0; i < vertex; i++) adjList[i] = new ArrayList<>();
    }

    // undirected without weighted
    public boolean addEdge(int startVertex,int endVertex){
        adjList[startVertex].add(endVertex);
        adjList[endVertex].add(startVertex);
        return true;
    }

//    public boolean addEdge(int startVertex,int endVertex,int weight){
//        adjList[startVertex].add(endVertex);
//        adjList[endVertex].add(startVertex);
//        return true;
//    }

    public void printGraph(){
        for(int i = 0; i < adjList.length; i++){
            System.out.print(i+" --->");
            for(int j = 0; j < adjList[i].size(); j++){
                System.out.print("\t" + adjList[i].get(j)+"->");
            }
            System.out.println();
        }
    }



}
