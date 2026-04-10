package Graphs;

import java.util.ArrayList;

record Edge(int node,int weight) {};

public class DirectedAdjList {
    private ArrayList<Edge> [] adjList;
    private int vertex;

    public DirectedAdjList(int vertex) {
        this.vertex = vertex;
        adjList = new ArrayList[vertex];
        for(int i =0; i < vertex; i++) adjList[i] = new ArrayList<>();
    }


    public boolean addEdge(int startVertex,int endVertex,int weight){
        adjList[startVertex].add(new Edge(endVertex,weight));
        return true;
    }

    public void printGraph(){
        for(int i = 0; i < adjList.length; i++){
            System.out.print(i + " --->  ");
            System.out.print(adjList[i]);
            System.out.println();
        }
    }



}
