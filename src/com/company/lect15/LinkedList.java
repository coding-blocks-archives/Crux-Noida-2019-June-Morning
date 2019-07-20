package com.company.lect15;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size=0;

    public void insertfirst(int item){

        Node node= new Node(item);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertlast(int item){

        if(size==0){
            insertfirst(item);
        }
        Node node =new Node(item);
        tail.next=node;
        tail=node;
        size++;
    }

    public int deletefirst(){
//        if(size==0){
//            throw new Exception("list is empty");
//        }
        int temp=head.data;
        head=head.next;
        if(head==tail){
            tail=null;
        }
        size--;
        return temp;
    }

    public int deletelast(){
        if(size<2){
            deletefirst();
        }
        Node node=head;
        while(node.next!=tail){
            node=node.next;
        }
        int temp=tail.data;
        tail=node;
        tail.next=null;
        size--;
        return temp;
    }

    public void display(){
        Node node=head;

        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println("End");
    }

    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
