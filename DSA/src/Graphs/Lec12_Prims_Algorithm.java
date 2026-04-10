package Graphs;

public class Lec12_Prims_Algorithm {
    public static void main(String[] args) {
        System.out.println("Prim's algorithm it is an greedy algorithm");
        GraphUsingHashMap graphUsingHashMap = new GraphUsingHashMap();
        graphUsingHashMap.addEdge(0,1,4);
        graphUsingHashMap.addEdge(0,5,3);
        graphUsingHashMap.addEdge(1,2,3);
        graphUsingHashMap.addEdge(1,5,5);
        graphUsingHashMap.addEdge(1,7,6);
        graphUsingHashMap.addEdge(2,3,2);
        graphUsingHashMap.addEdge(2,7,4);
        graphUsingHashMap.addEdge(3,4,5);
        graphUsingHashMap.addEdge(4,7,3);
        graphUsingHashMap.addEdge(4,6,7);
        graphUsingHashMap.addEdge(5,6,4);
        graphUsingHashMap.addEdge(7,6,5);
        graphUsingHashMap.addEdge(7,5,7);
        graphUsingHashMap.printGraphForPair();
        graphUsingHashMap.primsAlgorithm(0);

    }
}
