package Graphs;

public class AdjacencyMatrix {
    private int [][] matrix;
    private int vertex;

    public AdjacencyMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = -1;
            }
        }
    }

    // undirected and unweighted graph
    public boolean addEdge(int startVertex,int endVertex){
        matrix[startVertex][endVertex] = 1;
        matrix[endVertex][startVertex] = 1;
        return true;
    }

    // undirected and weighted graph
    public boolean addEdge(int startVertex,int endVertex,int weight){
        matrix[startVertex][endVertex] = weight;
        matrix[endVertex][startVertex] = weight;
        return true;
    }

    // directed and unweighted graph
    public boolean addDirectedEdge(int startVertex,int endVertex){
        matrix[startVertex][endVertex] = 1;
        return true;
    }

    // directed and weighted graph
    public boolean addDirectedEdge(int startVertex,int endVertex,int weight){
        matrix[startVertex][endVertex] = weight;
        return true;
    }

    public void printGraph(){
        System.out.println("{");
         for(int i = 0; i < matrix.length; i++){
             for(int j = 0; j < matrix[i].length; j++){
                 System.out.print("\t"+matrix[i][j] + " ");
             }
             System.out.println();
         }
        System.out.println("}");
    }

}
