package com.company.lec17;

import java.util.Scanner;

public class BinaryTree {


    private Node root;

    public void populate(Scanner s){

        this.root=populate(root,s);
    }

    private Node populate(Node node, Scanner s) {
        if(node==null){
            System.out.println("enter the value of node");
            int value= Integer.parseInt(s.nextLine());
            return new Node(value);
        }
        System.out.println("Enter the direction");
        String dir=s.nextLine();
        if(dir.equals("left")){
            node.left=populate(node.left,s);
        }
        else{
            node.right=populate(node.right,s);
        }
        return node;

    }
    public void height(){
       int h= height(root);
        System.out.println(h);
    }

    private int height(Node node) {
        if(node==null){
            return 0;
        }

        return 1+Math.max(height(node.left),height(node.right));
    }

    public void diameter(){
       int diameter= diameter(root);
        System.out.println(diameter);
    }

    private int diameter(Node node) {
    if(node==null){
        return 0;
    }
    int current= 1+height(node.left)+height(node.right);

    int max=Math.max(diameter(node.left),diameter(node.right));

    return Math.max(max,current);

    }

    public void display(){
        display(root,"","root");
    }

    private void display(Node node, String indent, String root1) {
        if(node==null){
            return;
        }

        System.out.println(indent+node.value);
        display(node.left,indent+"\t","left");
        display(node.right,indent+"\t","right");
    }

    public void find(int target){

        boolean find=find(root,target);
        System.out.println(find);
    }

    private boolean find(Node node, int target) {

        if(node==null){
            return false;
        }
        return node.value==target||find(node.left,target)||find(node.right,target);
    }

    public void mirror(){
    mirror(root);
    }

    private void mirror(Node node) {
        if(node==null){
            return;
        }
        Node temp= node.left;
        node.left=node.right;
        node.right=temp;

        mirror(node.left);
        mirror(node.right);
    }


    private class Node{
        private Node left;
        private Node right;

        private int value;

        public Node(int value) {
            this.value = value;
        }
    }
}
