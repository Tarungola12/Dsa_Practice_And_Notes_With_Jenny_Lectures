package Graphs;

public class Lec6_Graph_Using_HashMap {
    public static void main(String[] args) {
        System.out.println("we can use easily hashmap with graph");
        GraphUsingHashMap graphUsingHashMap = new GraphUsingHashMap();
        graphUsingHashMap.addEdge(0,1);
        graphUsingHashMap.addEdge(0,2);
        graphUsingHashMap.addEdge(1,3);
        graphUsingHashMap.addEdge(0,3);
        graphUsingHashMap.printGraph();

        // now we can make also for directed and weighted graph we know it's very simple
    }
}

