package Graphs;

import java.util.*;

public class ConnectedComponents {
    Queue<Integer> queue;
    boolean[] visited;
    List<List<Integer>> list;
    int [] parent;
    int [] rank;
    Stack<Integer> stack = new Stack<>();

    public void findConnectedComponentsUsingBFS(List<List<Integer>> list) {
        queue = new LinkedList<>();
        this.list = list;
        visited = new boolean[list.size()];
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (!visited[i]) {
                count++;
                bfs(i);
            }
        }
        System.out.println("Total number of connected components are : " + count);
    }

    private void bfs(int vertex) {
        visited[vertex] = true;
        for (Integer value : list.get(vertex)){
            if(!visited[value]){
                visited[value] = true;
                bfs(value);
                queue.offer(value);
            }
        }
    }

    public void findConnectedComponentsUsingDFS(List<List<Integer>> list) {
            this.list = list;
            visited = new boolean[list.size()];
            int count = 0;
            for (int i = 0; i < list.size(); i++) {
                if (!visited[i]) {
                    count++;
                    dfs(i);
                }
            }
            System.out.println("Total number of connected components are : " + count);
        }

    private void dfs(int startVertex) {
        visited[startVertex] = true;
        for(Integer value : list.get(startVertex)){
            if(!visited[value]){
                visited[value] = true;
                dfs(value);
            }
        }
    }

    public void findConnectedComponentsUsingDisjointSet(List<List<Integer>> list) {
        rank = new int[list.size()];
        parent = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            parent[i] = i;
            rank[i] = 0;
        }
        for(int i = 0; i < list.size(); i++){
            for(Integer value : list.get(i)){
                if(i < value) union(i,value);
            }
        }
        int count = 0;
        for(int i = 0; i < parent.length; i++){
            if(parent[i] == i) count++;
        }
        System.out.println("Total number of connected components are : " + count);

    }

    private void union(int startVertex, Integer endVertex) {
        int parentOfStart = find(startVertex);
        int parentOfEnd = find(endVertex);
        if(parentOfStart == parentOfEnd) return;
        else if(rank[parentOfStart] > rank[parentOfEnd]) parent[parentOfEnd] = parentOfStart;
        else if(rank[parentOfStart] < rank[parentOfEnd]) parent[parentOfStart] = parentOfEnd;
        else {
            parent[parentOfStart] = parentOfEnd;
            rank[parentOfEnd]++;
        }
    }

    private int find(Integer endVertex) {
        if(parent[endVertex] == endVertex) return endVertex;
        int parentOfEnd = find(parent[endVertex]);
        parent[endVertex] = parentOfEnd;
        return parentOfEnd;
    }

    public void stronglyConnectedComponents(List<List<Integer>> list) {
        this.list = list;
        visited = new boolean[list.size()];
        for(int i = 1; i < list.size(); i++){
            if(!visited[i]) dfsWithTopological(i);
        }
        List<List<Integer>> reverseList = reverseTheEdges();
        visited = new boolean[list.size()];
        int count = 0;
        while(!stack.isEmpty()){
            int vertex = stack.pop();
            if(!visited[vertex]){
                count++;
                dfs(reverseList,vertex);
            }
        }
        System.out.println("Strongly connected components are : "+count);
    }

    private void dfs(List<List<Integer>> reverseList, int vertex) {
        visited[vertex] = true;
        for(Integer value : reverseList.get(vertex)){
            if(!visited[value]) dfs(reverseList,value);
        }
    }

    private List<List<Integer>> reverseTheEdges() {
//        List<List<Integer>> reverseList = new ArrayList<>(this.list);
//
//        for(int i = 0; i < list.size(); i++) reverseList.add(new ArrayList<>());
//
//        for(int i = 1; i < list.size(); i++){
//            for(Integer value : list.get(i)){
//                reverseList.get(value).add(i);
//            }
//        }
//
//        return reverseList;
        List<List<Integer>> reverseList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) reverseList.add(new ArrayList<>());
        for(int i = 1; i < list.size(); i++){
            for(Integer value : list.get(i)){
                reverseList.get(value).add(i);
            }
        }
        return reverseList;
    }

    private void dfsWithTopological(int startVertex) {
        visited[startVertex] = true;
        for(Integer value : list.get(startVertex)){
            if(!visited[value]) dfsWithTopological(value);
        }
        stack.push(startVertex);
    }

}
