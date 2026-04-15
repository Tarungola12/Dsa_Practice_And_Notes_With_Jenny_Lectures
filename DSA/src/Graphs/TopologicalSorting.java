package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSorting {
    List<List<Integer>> list;
    boolean[] visited;
    Stack<Integer> stack = new Stack<>();
    Queue<Integer> queue = new LinkedList<>();
    int [] inDegree;

    public Stack<Integer> printTopologicalSorting(List<List<Integer>> list) {
        visited = new boolean[list.size()];
        this.list = list;
        for (int i = 0; i < list.size(); i++) {
            if (!visited[i]) {
                topologicalSort(i);
            }
        }
        printTopologicalStack();
        return this.stack;
    }

    private void printTopologicalStack() {
        while (!stack.isEmpty()) System.out.print(stack.pop() + "  ");
    }

    private void topologicalSort(int startVertex) {
        visited[startVertex] = true;
        for (Integer values : list.get(startVertex)) {
            if (!visited[values]) topologicalSort(values);
        }
        stack.push(startVertex);
    }

    public void topologicalUsingBfs(List<List<Integer>> list){
        this.list = list;
        inDegree = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            for(Integer value : list.get(i)){
                inDegree[value]++;
            }
        }
        for(int i = 0; i < inDegree.length; i++) if (inDegree[i] == 0) queue.offer(i);
        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + "  ");
            for(Integer neighbour : list.get(vertex)){
                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0) queue.offer(neighbour);
            }
        }
    }

    public boolean hasACycle(List<List<Integer>> list) {
        topologicalUsingBfs(list);
        return true;
    }
}
