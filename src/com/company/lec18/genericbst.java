package com.company.lec18;

public class genericbst <T extends Comparable<T>> {

    private Node root;

    public void populate(T value){
        this.root=populate(root,value);
    }

    private Node populate(Node node, T value) {
        if(node==null){
            return new Node( value);
        }

       else if(value.compareTo(node.value)<0){
            node.left=populate(node.left,value);
        }

       else if(value.compareTo(node.value)>0){
            node.right=populate(node.right,value);
        }
       return node;
    }

    public void find(T target){
        Node node=find(root,target);
        System.out.println(node);
    }

    private Node find(Node node, T target) {
         if(node==null){
             return null;
         }

         if(node.value.compareTo(target)==0){
             return node;
         }
         else if(node.value.compareTo(target)<0){
            return find(node.right,target);
         }
         else{
             return find(node.left,target);
         }
    }

    public void successor(T target){
        System.out.println(successor(find(root,target),root));
    }

    private T successor(Node node, Node root) {
    if(node==null){
        return null;
    }
    if(node.right!=null){
        Node current=node.right;
        while(current.left!=null){
            current=current.left;
        }
        return current.value;
    }

    Node succ=null;
    while(root!=null){

        if(node.value.compareTo(root.value)<0){
            succ=root;
            root=root.left;
        }
        else if(node.value.compareTo(root.value)>0){
            root=root.right;
        }
        else{
            break;
        }
    }
    return succ.value;
    }

    public void inrange(T start,T end){
        inrange(root, start, end);
    }

    private void inrange(Node node, T start, T end) {
    if(node ==null){
        return;
    }
if(node.value.compareTo(start)>0&&node.value.compareTo(end)<0)
        System.out.println(node.value);

    if(start.compareTo(node.value)<0){
          inrange(node.left,start, end);
    }

    if(end.compareTo(node.value)>0){
        inrange(node.right,start,end);
    }

    }

    public void sort(T nums[]){
       populateWithSorted(nums,0,nums.length-1);
    }

    private void populateWithSorted(T[] nums, int start, int end) {
        if (start >= end){
            return;
        }

        int mid = (start + end)/2;

        this.populate(nums[mid]);

        populateWithSorted(nums, start, mid);

        populateWithSorted(nums, mid + 1, end);
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
        T value;
        private Node left;
        private Node right;

        public Node(T value) {
            this.value = value;
        }
    }
}
