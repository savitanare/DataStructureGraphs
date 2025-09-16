package main.java.graphasEx.AdjacencyList.directedGraph.unweighted;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

    public static void addEdges(List<List<Integer>> adj , int i, int j){
        adj.get(i).add(j);
    }

    public static void printAdjacencyList(List<List<Integer>> adj ){
        for(int i = 0; i<adj.size();i++){
            System.out.print(i + " -> ");
            for(int j : adj.get(i)){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int v = 4;

        List<List<Integer>> adj = new ArrayList<>(v);
        for(int i = 0; i < v; i ++){
            adj.add(new ArrayList<>());
        }

        addEdges(adj, 0, 1);
        addEdges(adj, 0, 2);
        addEdges(adj, 1, 2);
        addEdges(adj, 2, 3);

        System.out.println("Adjacency List Representation:");
        printAdjacencyList(adj);

    }
    
}
