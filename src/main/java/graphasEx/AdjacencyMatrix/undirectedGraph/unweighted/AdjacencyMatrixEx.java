package main.java.basicsGraphsEx.UndirectedGraph;

public class AdjacencyMatrixEx {

    public static void addEdges(int mat[][], int i, int j){
        mat[i][j] = 1;
        mat[j][i] = 1;
    }

    public static void displayMatrix(int[][] mat){
        for(int[] row : mat){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 4;
        int[][] mat = new int[v][v];

        addEdges(mat, 0, 1);
        addEdges(mat, 0, 2);
        addEdges(mat, 1, 2);
        addEdges(mat, 2, 3);

        System.out.println("Adjacency Matrix Representation :");
        displayMatrix(mat);

    }

    
}
