package com.company.lec21;

public class graphclient {
    public static void main(String[] args) {

        AdjacencyList list = new AdjacencyList();
        list.addVertex("A");
        list.addVertex("B");
        list.addVertex("C");
        list.addVertex("D");

        list.addedge("A","D");
        list.addedge("A","C");
        list.addedge("D","B");
        list.addedge("C","D");


        list.display();
        list.BFT();

        System.out.println(list.bipartite());
    }
}