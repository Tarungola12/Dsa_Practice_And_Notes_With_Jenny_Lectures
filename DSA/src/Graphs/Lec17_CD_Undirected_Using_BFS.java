package Graphs;

import BinarySearchTree.BinaryTree;

import java.util.*;

public class Lec17_CD_Undirected_Using_BFS {

    public static void main(String[] args) {
        System.out.println("Using Bfs how we detect our cycle is there in graph or not");
        // but the problem here is when we have disconnected graph then we can not detect is there any cycle or not we have to call bfs for different component
        GraphUsingHashMap graph = new GraphUsingHashMap();
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,5);
        graph.addEdge(2,4);
        graph.addEdge(4,5);
        HashMap<Integer,List<Integer>> hashMapOfGraph = graph.getHashMap();
        detectCycleUsingBFS(hashMapOfGraph,0);
    }

    private static void detectCycleUsingBFS(HashMap<Integer,List<Integer>> graph, int startingVertex) {
        Queue<Pair> queue = new LinkedList<>();
        HashMap<Integer,Boolean> hashMap = new HashMap<>();
        hashMap.put(startingVertex,Boolean.TRUE);
        // here in pair class the weight will be treated as parent vertex
        queue.offer(new Pair(startingVertex,-1));
        while (!queue.isEmpty()){
            Pair currentNode = queue.poll();
            int currentValue = currentNode.node;
            int parentValue = currentNode.weight;
            for(Integer neighbour : graph.get(currentValue)){
                if(hashMap.get(neighbour) == null){
                    hashMap.put(currentValue,Boolean.TRUE);
                    queue.offer(new Pair(neighbour,currentValue));
                }else if( parentValue != neighbour){
                        System.out.println("There is a cycle.");
                        return;
                }
            }
        }
        System.out.println("There is no any cycle");
    }
}


