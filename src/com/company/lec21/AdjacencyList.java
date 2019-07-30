package com.company.lec21;

import java.util.*;

public class AdjacencyList<T>{

    private LinkedList<Vertex> vertices;

    public AdjacencyList() {
        this.vertices = new LinkedList<>();
    }

    public void display(){

        for (Vertex vertex:vertices) {
            System.out.print(vertex.value+" => ");
            for (Vertex padosi:vertex.neighbours){
                System.out.print(padosi.value+ " ");
            }
            System.out.println();
        }
    }

    public void BFT(){

        Vertex vertex= vertices.get(0);
        Set<Vertex> set=new HashSet<>();
        Queue<Vertex> queue =new LinkedList<Vertex>();

        set.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){
            Vertex front= queue.remove();
            System.out.println(front.value);

            for (Vertex padosi:front.neighbours) {
                if(!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
    }

    public void DFT(){

        Vertex vertex= vertices.get(0);
        Set<Vertex> set=new HashSet<>();
        Stack<Vertex> stack =new Stack<Vertex>();

        set.add(vertex);
        stack.add(vertex);

        while(!stack.isEmpty()){
            Vertex front= stack.pop();
            System.out.println(front.value);

            for (Vertex padosi:front.neighbours) {
                if(!set.contains(padosi)){
                    set.add(padosi);
                    stack.add(padosi);
                }
            }
        }
    }

    public boolean BFS(T value){

        Vertex vertex= vertices.get(0);
        Set<Vertex> set=new HashSet<>();
        Queue<Vertex> queue =new LinkedList<Vertex>();

        set.add(vertex);
        queue.add(vertex);

        while(!queue.isEmpty()){
            Vertex front= queue.remove();
            if(front.value.equals(value)){
                return true;
            }

            for (Vertex padosi:front.neighbours) {
                if(!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }
        return false;
    }

    public void shortestpath(){

        Vertex vertex= vertices.get(0);
        Set<Vertex> set=new HashSet<>();
        Queue<Vertex> queue =new LinkedList<Vertex>();

        set.add(vertex);
        queue.add(vertex);
        queue.add(null);
          int level=0;
        while(!queue.isEmpty()){
            Vertex front= queue.remove();
            if(front==null){
                queue.add(null);
                level++;
                continue;
            }
            System.out.println(front.value +"level "+level);
            for (Vertex padosi:front.neighbours) {
                if(!set.contains(padosi)){
                    set.add(padosi);
                    queue.add(padosi);
                }
            }
        }

    }

    public boolean bipartite(){
        Vertex vertex= vertices.get(0);
        Set<Vertex> set=new HashSet<>();
        Queue<Vertex> queue =new LinkedList<Vertex>();
        Set<Vertex> red = new HashSet<>();
        Set<Vertex> green = new HashSet<>();

        set.add(vertex);
        queue.add(vertex);
        red.add(vertex);

        while(!queue.isEmpty()){
            Vertex front= queue.remove();
            if(red.contains(front)){
                for (Vertex padosi:front.neighbours) {
                    if(!set.contains(padosi)){
                        set.add(padosi);
                        queue.add(padosi);
                        green.add(padosi);
                    }
                    else{
                        if(red.contains(padosi)){
                            return false;
                        }
                    }
                }
            }

            if(green.contains(front)){
                for (Vertex padosi:front.neighbours) {
                    if(!set.contains(padosi)){
                        set.add(padosi);
                        queue.add(padosi);
                        red.add(padosi);
                    }
                    else{
                        if(green.contains(padosi)){
                            return false;
                        }
                    }
                }
            }
        }

       return true;
    }

    public void addedge(T first ,T second){

        Vertex f=get(first);
        Vertex s=get(second);

        if(f!=null&& s!=null){
            f.neighbours.add(s);
            s.neighbours.add(f);
        }

    }

    private Vertex get(T value) {

        for (Vertex vertex: vertices) {
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }

    public void addVertex(T value){

        vertices.add(new Vertex(value));
    }

    private class Vertex{
        private T value;
        private LinkedList<Vertex> neighbours;

        public Vertex(T value) {
            this.value = value;
            neighbours = new LinkedList<>();
        }
    }
}
