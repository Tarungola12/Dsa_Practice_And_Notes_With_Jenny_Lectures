package Graphs;

public class Lec9_DFS {
    public static void main(String[] args) {
        System.out.println("in this lecture we will se dfs");
        GraphUsingHashMap graphUsingHashMap = new GraphUsingHashMap();
        graphUsingHashMap.addEdge(0,1);
        graphUsingHashMap.addEdge(0,2);
        graphUsingHashMap.addEdge(1,3);
        graphUsingHashMap.addEdge(0,3);
        graphUsingHashMap.printGraph();
//        graphUsingHashMap.Dfs(2);
//        graphUsingHashMap.DfsUsingEfficientApproachAccordingToMe(2);
        graphUsingHashMap.DfsUsingRecursion(2);
    }
}
