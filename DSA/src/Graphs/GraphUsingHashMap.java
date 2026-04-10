package Graphs;

import java.util.*;

// this is undirected graph

public class GraphUsingHashMap {
    HashMap<Integer, List<Integer>> adjMap = new HashMap<>();
    private HashMap<Integer,Boolean> hashMap = new HashMap<>();
    private final HashMap<Integer,List<Pair>> adjMapPair = new HashMap<>();


    // add edge without weight
    public void addEdge(int startVertex,int endVertex){
        adjMap.putIfAbsent(startVertex,new ArrayList<>());
        adjMap.putIfAbsent(endVertex,new ArrayList<>());
        adjMap.get(startVertex).add(endVertex);
        adjMap.get(endVertex).add(startVertex);
    }

    // add edge with weight
    public void addEdge(int startVertex,int endVertex,int weight){
        adjMapPair.putIfAbsent(startVertex,new ArrayList<>());
        adjMapPair.putIfAbsent(endVertex,new ArrayList<>());
        adjMapPair.get(startVertex).add(new Pair(endVertex,weight));
        adjMapPair.get(endVertex).add(new Pair(startVertex,weight));
    }

    public void printGraph(){
        for(int v : adjMap.keySet()){
            System.out.println(v + " --> " + adjMap.get(v));
        }
    }

    public void printGraphForPair(){
        for (Integer i : adjMapPair.keySet()) {
            System.out.print(i + " --> ");
            System.out.println(adjMapPair.get(i));
        }
    }

    public void BFS(int startVertex) {
        List<Integer> startVertexList = adjMap.get(startVertex);
        HashMap<Integer,Boolean> hashMap = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        hashMap.put(startVertex,true);
        markIfPresent(startVertexList,hashMap,queue);
        while (!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            List<Integer> list = exploreNodes(vertex);
            markIfPresent(list,hashMap,queue);
        }
    }

    private void markIfPresent(List<Integer> list, HashMap<Integer, Boolean> hashMap, Queue<Integer> queue) {
        for(int value : list){
            if(hashMap.get(value) == null){
                queue.add(value);
                hashMap.put(value,true);
            }
        }
    }

    private List<Integer> exploreNodes(int vertex) {
        return adjMap.get(vertex);
    }

    public void Dfs(int startVertex) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Boolean> hashMap = new HashMap<>();
        hashMap.put(startVertex,true);
        stack.push(startVertex);
        System.out.print(startVertex + " ");
        while (!stack.isEmpty()){
            List<Integer> list = adjMap.get(stack.peek());
            int neighbourhood = markIfPresent(list,hashMap);
            if(neighbourhood == -1){
                stack.pop();
                continue;
            }
            System.out.print(neighbourhood + " ");
            stack.push(neighbourhood);
        }
    }

    private int markIfPresent(List<Integer> list, HashMap<Integer, Boolean> hashMap) {
       for(int value : list){
           if(hashMap.get(value) == null){
               hashMap.put(value,true);
               return value;
           }
       }
       return -1;
    }

    public void DfsUsingEfficientApproachAccordingToMe(int startVertex) {

    }

    public void DfsUsingRecursion(int node) {
        if(!visited(node)) return;
        System.out.print(node + " ");
        for(int value : adjMap.get(node)){
            DfsUsingRecursion(value);
        }
    }

    private boolean visited(int node) {
        if(hashMap.get(node) == null){
            hashMap.put(node,true);
            return true;
        }
        return false;
    }

    // algorithm to find minimum spanning tree
    public void primsAlgorithm(int startVertex) {
        HashMap<Integer,Boolean> hashMap1 = new HashMap<>();
        PriorityQueue<Record> priorityQueue = new PriorityQueue<>();
        int totalCost = 0;
        priorityQueue.offer(new Record(startVertex,0,-1));
        while (!priorityQueue.isEmpty()){
            Record record = priorityQueue.poll();
            if(hashMap1.get(record.vertex) != null) continue;
            hashMap1.putIfAbsent(record.vertex,Boolean.TRUE);
            totalCost += record.weight;
            storeEdgesInPriorityQueue(priorityQueue,hashMap1,record.vertex);
        }
        System.out.println(totalCost);
    }

    private void storeEdgesInPriorityQueue(PriorityQueue<Record> priorityQueue, HashMap<Integer, Boolean> hashMap, int vertex) {
        for (Pair pair : adjMapPair.get(vertex)){
            if(hashMap.get(pair.node) == null){
                priorityQueue.offer(new Record(pair.node,pair.weight,vertex));
            }
        }
    }

    public HashMap<Integer, List<Integer>> getHashMap() {
        return adjMap;
    }
}

class Record implements Comparable<Record>{
    int vertex;
    int weight;
    int parentVertex;

    @Override
    public String toString() {
        return "NodesAndWeight{" +
                "node=" + vertex +
                ", weight=" + weight +
                ", parent=" + parentVertex +
                '}';
    }

    public Record(int vertex, int weight, int parentVertex) {
        this.vertex = vertex;
        this.weight = weight;
        this.parentVertex = parentVertex;
    }

    @Override
    public int compareTo(Record o) {
        return Integer.compare(this.weight,o.weight);
    }
}
