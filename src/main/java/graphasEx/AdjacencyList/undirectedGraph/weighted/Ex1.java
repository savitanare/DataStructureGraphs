package main.java.graphasEx.AdjacencyList.undirectedGraph.weighted;

import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
    public static void addEdges(List<List<SimpleEntry<Integer, Integer>>> adj , int i , int j, int weight){

        adj.get(i).add(new SimpleEntry<>(j, weight));
    }

    public static void displayAdjList(List<List<SimpleEntry<Integer, Integer>>> adj){
        for(int i = 0 ; i < adj.size(); i++){
            System.out.print(i + ": ");
            for(SimpleEntry<Integer, Integer> j : adj.get(i)){
                System.out.print("{" + j.getKey() + ", " +j.getValue() + "} ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 4;

        List<List<SimpleEntry<Integer, Integer>>> adj = new ArrayList<>(v);

        for(int i = 0 ; i < v; i ++){
            adj.add(new ArrayList<>());
        }

        addEdges(adj, 1, 0, 4);
        addEdges(adj, 1, 2, 3);
        addEdges(adj, 2, 0, 1);
        addEdges(adj, 3, 3, 2);

        System.out.println("Directe Unweighted Graph : ");

        displayAdjList(adj);


    }
    
}
