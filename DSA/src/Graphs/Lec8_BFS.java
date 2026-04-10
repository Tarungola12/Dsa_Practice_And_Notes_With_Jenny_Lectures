package Graphs;

public class Lec8_BFS {
    public static void main(String[] args) {
        System.out.println("BFS as we know it" +
                " first explore and then it print side by side and don't repeat we use two" +
                " data structure queue and array or according to me use hashmap for best so " +
                "i will use hash map for mark vertex to true when i visited that node and queue " +
                "for print the elements");
        GraphUsingHashMap graphUsingHashMap = new GraphUsingHashMap();
        graphUsingHashMap.addEdge(0,1);
        graphUsingHashMap.addEdge(0,2);
        graphUsingHashMap.addEdge(1,3);
        graphUsingHashMap.addEdge(0,3);
        graphUsingHashMap.printGraph();
        graphUsingHashMap.BFS(1);

    }
}
