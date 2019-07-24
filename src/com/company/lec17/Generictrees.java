package com.company.lec17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Generictrees {

    private Node root;
    public void populate(Scanner s){
        System.out.println("Enter the value of0 root");
        int value=s.nextInt();
        this.root=new Node(value);
        populate(s,root);
    }

    private void populate(Scanner s, Node node) {

        while(true){
            System.out.println("do you wan to add child of node= "+node.value);
            boolean yes =s.nextBoolean();
            if(yes){
                System.out.println("Enter the value of child node ");
                int value=s.nextInt();
                Node child =new Node(value);
                node.children.add(child);
                populate(s,child);

            }
            else{
                break;
            }
        }

    }

    public void levelorder(){
        levelorder(root);
    }

    private void levelorder(Node node) {
        Queue<Node> queue= new LinkedList();
        queue.add(node);
        while(!queue.isEmpty()){
            Node front = queue.remove();
            System.out.print(front.value);
            for (int i = 0; i <front.children.size() ; i++) {
                Node child=front.children.get(i);
                queue.add(child);

            }
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        System.out.println(indent+node.value);
        for (int i = 0; i <node.children.size(); i++) {
            display(node.children.get(i),indent+"\t");
        }
    }

    public void postorder(){
        postorder(root);
    }

    private void postorder(Node node) {

        for (int i = 0; i <node.children.size(); i++) {
            postorder(node.children.get(i));
        }
        System.out.print(node.value+ " ");
    }
    public void count(){
        System.out.println(count(root));

    }

    private int count(Node node) {
        int cnt=1;
        for (int i = 0; i <node.children.size(); i++) {
            cnt +=count(node.children.get(i));
        }
        return cnt;
    }

    private class Node{
        private int value;
        private ArrayList<Node> children;

        public Node(int value) {
            this.value = value;
            this.children = new ArrayList<>();
        }
    }
}
