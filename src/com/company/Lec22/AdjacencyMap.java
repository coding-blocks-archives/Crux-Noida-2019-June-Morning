package com.company.Lec22;

import com.company.lec21.AdjacencyList;

import java.util.*;

public class AdjacencyMap<T> {

    private Map<T,Vertex> vertexMap=new HashMap<>();

    public void addVertex(T value){
        if(!vertexMap.containsValue(value)){
            vertexMap.put(value,new Vertex(value));
        }
    }

    public void addEdge(T f ,T s, int weight){

        Vertex first=vertexMap.get(f);
        Vertex second= vertexMap.get(s);

        if(first!=null&& second!=null){
            first.addneighbours(second,weight);
            second.addneighbours(first,weight);
        }
    }

    public void DFT(T start){
        Vertex vertex=vertexMap.get(start);
        Set<Vertex> set=new HashSet<>();
        Stack<Vertex> stack =new Stack<Vertex>();

        set.add(vertex);
        stack.add(vertex);

        while(!stack.isEmpty()){
            Vertex front= stack.pop();
            System.out.println(front.value);

            for (Vertex padosi:front.neighbours.values()) {
                if(!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }
    }

    public AdjacencyMap<T> kruskal(){
        AdjacencyMap<T> graph = new AdjacencyMap<>();

        ArrayList<Edge> Edges=new ArrayList<>();

        for (Vertex vertex:vertexMap.values()) {
           graph.addVertex(vertex.value);
            for (Vertex padosi:vertex.neighbours.values()) {
                int weight=vertex.weights.get(padosi);
                Edges.add(new Edge(vertex,padosi,weight));
            }
        }
        Edges.sort((o1, o2) -> o1.weight-o2.weight);
        Map<Vertex,Vertex> parent=parent();
        for (Edge edge:Edges) {
            if(union(edge.first,edge.second,parent)){
                graph.addEdge(edge.first.value,edge.second.value,edge.weight);
            }
        }
   return graph;
    }

    private boolean union(Vertex f, Vertex s, Map<Vertex,Vertex> parent){
        Vertex first=find(f,parent);
        Vertex second=find(s,parent);

        if(first!=second){
            parent.put(first,second);
            return true;
        }
        return false;
    }

    private Map<Vertex,Vertex> parent(){
      Map<Vertex,Vertex> parents=new HashMap<>();
        for (Vertex vertex:vertexMap.values()) {
            parents.put(vertex,null);
        }

        return parents;
    }

    private Vertex find(Vertex vertex, Map<Vertex, Vertex> parent) {

        while(parent.get(vertex)!=null){
            vertex=parent.get(vertex);
        }
        return vertex;
    }

    class Edge {

        Vertex first;
        Vertex second;
        int weight;

        public Edge(Vertex first, Vertex second, int weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }

//        @Override
//        public int compareTo(Edge o) {
//            return this.weight-o.weight;
//        }
    }

    class Vertex{
        private T value;
        private Map<T,Vertex> neighbours;
        private Map<Vertex,Integer> weights;

        public Vertex(T value) {
            this.value = value;
            this.neighbours = new HashMap<>();
            this.weights = new HashMap<>();
        }

        private void addneighbours(Vertex padosi,int weight){
            neighbours.put(padosi.value,padosi);
            weights.put(padosi,weight);
        }
    }
}
