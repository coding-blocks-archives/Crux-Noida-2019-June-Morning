package com.company.lec18;

public class bst {

    private Node root;

    public void populate(int value){
        this.root=populate(root,value);
    }

    private Node populate(Node node, int value) {
        if(node==null){
            return new Node(value);
        }

       else if(value<node.value){
            node.left=populate(node.left,value);
        }

       else if(value>node.value){
            node.right=populate(node.right,value);
        }
       return node;
    }

    public void find(int target){
        Node node=find(root,target);
        System.out.println(node);
    }

    private Node find(Node node, int target) {
         if(node==null){
             return null;
         }

         if(node.value==target){
             return node;
         }
         else if(node.value<target){
            return find(node.right,target);
         }
         else{
             return find(node.left,target);
         }
    }

    public void display(){
        display(root,"","root");
    }

    private void display(Node node,String indent,String child) {
        if(node==null){
            return;
        }

        System.out.println(indent+node.value+child);
        display(node.left,indent+"\t","left");
        display(node.right,indent+"\t","right");

    }


    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }
    }
}
