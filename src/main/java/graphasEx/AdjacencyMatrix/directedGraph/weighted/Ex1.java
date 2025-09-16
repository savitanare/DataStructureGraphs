package main.java.graphasEx.weightedDirectedGraph;

public class Ex1 {

    public static void addEdges(int mat[][], int i , int j, int weight){
        mat[i][j] = weight;
    }

    public static void printMatrix(int mat[][]){
        for(int i = 0; i <mat.length;i++){
            for(int j = 0 ; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int v = 5;
        int mat[][] = new int[v][v];

        addEdges(mat, 0, 1, 3);
        addEdges(mat, 1, 2, 4);
        addEdges(mat, 3, 4, 5);
        addEdges(mat, 4, 2, 6);
        addEdges(mat, 2, 3, 2);

        System.out.println("Adjacency Matrix for Weighted Directed graph");
        printMatrix(mat);
        
    }
    
}
