package Graphs;

public class Lec4_GraphRepresentation_Using_AdjacencyList {
    public static void main(String[] args) {
        System.out.println("we use here list array list or linked list here we store not 0 as" +
                " in last previous case we store here only and only where each vertex which is" +
                " connected to other vertex we store here only that not other information");
        UndirectedAdjacencyList undirectedAdjacencyList = new UndirectedAdjacencyList(6);
        undirectedAdjacencyList.addEdge(0, 1);
        undirectedAdjacencyList.addEdge(0, 3);
        undirectedAdjacencyList.addEdge(1, 2);
        undirectedAdjacencyList.addEdge(1, 3);
        undirectedAdjacencyList.addEdge(2, 3);
        undirectedAdjacencyList.addEdge(2, 4);
        undirectedAdjacencyList.addEdge(3, 5);
//        undirectedAdjacencyList.printGraph();

        // now for weighted we can make custom pair class, and we store weight and vertex same

        // we have to do only record Edge(int node,int weight) {}

        DirectedAdjList directedAdjList = new DirectedAdjList(6);
        directedAdjList.addEdge(0,1,10);
        directedAdjList.addEdge(0,3,3);
        directedAdjList.addEdge(1,2,6);
        directedAdjList.addEdge(1,3,78);
        directedAdjList.addEdge(2,3,34);
        directedAdjList.addEdge(2,4,35);
        directedAdjList.addEdge(3,5,67);
        directedAdjList.printGraph();
    }
}
