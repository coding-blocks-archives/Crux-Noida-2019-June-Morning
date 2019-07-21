package com.company.lec16;

import java.util.ArrayList;
import java.util.Scanner;

public class Generictrees {

    private Node root;
    public void populate(Scanner s){
        System.out.println("Enter the value of root");
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

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        System.out.println(indent+node.value);
        for (int i = 0; i <node.children.size(); i++) {
            display(node.children.get(i),indent+"\t");
        }
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
