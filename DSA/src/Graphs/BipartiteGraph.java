package Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BipartiteGraph {
    int [] color;
    Queue<Integer> queue;
    List<List<Integer>> list;

    public boolean isGraphBipartite(List<List<Integer>> list) {
        color = new int[list.size()];
        Arrays.fill(color, -1);
        queue = new LinkedList<>();
//        color[0] = 0;
//        queue.add(0);
//        for(int i = 0; i < list.size(); i++){
//            int vertex;
//            if (!queue.isEmpty()) {
//                vertex = queue.poll();
//            }else vertex = i;
//            for(Integer neighbour : list.get(vertex)) {
//                if (color[vertex] == 0) {
//                    if (color[neighbour] == -1 || color[neighbour] == 1) {
//                        color[neighbour] = 1;
//                    } else return false;
//                }
//                else if(color[vertex] == 1){
//                    if(color[neighbour] == -1 || color[neighbour] == 0){
//                        color[neighbour] = 0;
//                    }else return false;
//                }
//            }
//        }
        for(int i = 0; i < list.size(); i++){
            if (color[i] != -1) continue;
            queue.offer(i);
            color[i] = 0;
            while (!queue.isEmpty()){
                int node = queue.poll();
                for(int neighbour : list.get(node)){
                    if(color[neighbour] == -1){
                        color[neighbour] = 1 - color[node];
                        queue.offer(neighbour);
                    } else if (color[neighbour] == color[node]) return false;
                }
            }
        }

        return true;
    }

    public boolean isGraphBipartiteUsingDFS(List<List<Integer>> list) {
        color = new int[list.size()];
        Arrays.fill(color , -1);
        this.list = list;
        for(int i = 0; i < list.size(); i++){
            if(color[i] != -1) continue;
            color[i] = 0;
            if(!dfs(i)) return false;
        }
        return true;
    }

    public boolean dfs(int vertex){
        for(int neighbour : list.get(vertex)){
            if(color[neighbour] == -1){
                color[neighbour] = 1 - color[vertex];
                if(!dfs(neighbour)) return false;
            } else if (color[neighbour] == color[vertex]) {
                return false;
            }
        }
        return true;
    }
}
