package Graphs;

public class Lec3_Graph_Representation_Using_Adjacency_Matrix {
    public static void main(String[] args) {
        System.out.println("Representation of graph Using adjacency matrix we use matrix here for store graph.2d array");
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(6);
//        adjacencyMatrix.addEdge(0,1,10);
//        adjacencyMatrix.addEdge(0,3,12);
//        adjacencyMatrix.addEdge(1,2,6);
//        adjacencyMatrix.addEdge(1,3,7);
//        adjacencyMatrix.addEdge(0,1);
//        adjacencyMatrix.addEdge(0,3);
//        adjacencyMatrix.addEdge(1,2);
//        adjacencyMatrix.addEdge(1,3);
//        adjacencyMatrix.addEdge(2,3);
//        adjacencyMatrix.addEdge(2,4);
//        adjacencyMatrix.addEdge(3,5);
//        adjacencyMatrix.addDirectedEdge(0,1);
//        adjacencyMatrix.addDirectedEdge(1,3);
//        adjacencyMatrix.addDirectedEdge(2,5);
        adjacencyMatrix.addDirectedEdge(0,1,5);
        adjacencyMatrix.addDirectedEdge(1,3,7);
        adjacencyMatrix.addDirectedEdge(2,5,89);
        adjacencyMatrix.printGraph();
    }
}
