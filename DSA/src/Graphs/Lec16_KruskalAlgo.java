package Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

class EdgeList {
    int u;
    int v;
    int w;

    public EdgeList(int u, int v, int w) {
        this.u = u;
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return "EdgeList{" +
                "u=" + u +
                ", v=" + v +
                ", w=" + w +
                '}';
    }

    public int getU() {
        return u;
    }

    public void setU(int u) {
        this.u = u;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }
}

public class Lec16_KruskalAlgo {


    public static void main(String[] args) {
        List<EdgeList> edgeList = new ArrayList<>();
        edgeList.add(new EdgeList(0, 1, 1));
        edgeList.add(new EdgeList(0, 2, 6));
        edgeList.add(new EdgeList(1, 2, 6));
        edgeList.add(new EdgeList(1, 3, 5));
        edgeList.add(new EdgeList(2, 6, 3));
        edgeList.add(new EdgeList(2, 7, 7));
        edgeList.add(new EdgeList(3, 4, 10));
        edgeList.add(new EdgeList(3, 6, 2));
        edgeList.add(new EdgeList(4, 5, 3));
        edgeList.add(new EdgeList(4, 8, 7));
        edgeList.add(new EdgeList(5, 8, 8));
        edgeList.add(new EdgeList(6, 8, 8));
        edgeList.add(new EdgeList(7, 8, 12));

        edgeList.sort((o1, o2) -> o1.w - o2.w);

        DisjointSet disjointSet = new DisjointSet(edgeList);
        List<EdgeList> returnList = new ArrayList<>();
        int totalWeight = 0;

        for(EdgeList edgeList1 : edgeList){
            if(disjointSet.find(edgeList1.u) != disjointSet.find(edgeList1.v)){
                returnList.add(edgeList1);
                totalWeight += edgeList1.w;
                disjointSet.union(edgeList1.u,edgeList1.v);
            }
        }
        System.out.println(totalWeight);
        System.out.println(" Edge  " + " weight    ");
        for (EdgeList edgeList1 : returnList){
            System.out.println(edgeList1.u + " - " + edgeList1.v + " : " + edgeList1.w);
        }
    }
}

class DisjointSet {
    HashMap<Integer, Integer> parentHashMap = new HashMap<>();
    HashMap<Integer,Integer> rankHashMap = new HashMap<>();

    public DisjointSet(List<EdgeList> list) {
        for (EdgeList edgeList : list) {
            parentHashMap.putIfAbsent(edgeList.u, edgeList.u);
            parentHashMap.putIfAbsent(edgeList.v, edgeList.v);
            rankHashMap.putIfAbsent(edgeList.u,0);
            rankHashMap.putIfAbsent(edgeList.v, 0);
        }
    }

    int find(int vertex){
        int i = parentHashMap.get(vertex);
        if(i == vertex){
            return i;
        }
        int returnValue = find(i);
        parentHashMap.put(vertex,returnValue); // path compression.
        return returnValue;
    }

    void union(int vertex1,int vertex2){
        int parentOfVertex1 = find(vertex1);
        int parentOfVertex2 = find(vertex2);
        if(parentOfVertex1 == parentOfVertex2) return ;
        if(rankHashMap.get(parentOfVertex1) < rankHashMap.get(parentOfVertex2)) parentHashMap.put(parentOfVertex1,parentOfVertex2);
        else if(rankHashMap.get(parentOfVertex1) > rankHashMap.get(parentOfVertex2)) parentHashMap.put(parentOfVertex2,parentOfVertex1);
        else{
            parentHashMap.put(parentOfVertex2,parentOfVertex1);
            rankHashMap.put(parentOfVertex1,rankHashMap.get(parentOfVertex1)+1);
        }
    }

}