package weighted;

public class Ex1 {

    public static void addEdge(int mat[][],int i, int j, int weight){
        mat[i][j] = weight;
        mat[j][i] = weight; 
    }

    public static void printGraph(int mat[][]){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }   
    }
    public static void main(String[] args) {
        int v = 5;

        int mat[][] = new int [v][v];
        addEdge(mat, 0, 1, 4);
        addEdge(mat, 0, 2, 1);
        addEdge(mat, 1, 2, 2);
        addEdge(mat, 1, 3, 5); 
        
        
        System.out.println("Adjacency Matrix of the weighted undirected graph:");
        printGraph(mat);


    }
    
}
