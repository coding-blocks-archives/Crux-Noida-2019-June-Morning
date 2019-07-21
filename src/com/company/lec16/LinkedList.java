package com.company.lec16;

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

    public void insert(int index,int item){

        if(index==0){
            insertfirst(item);
            return;
        }

        if(index==size){
            insertlast(item);
            return;
        }

        Node prev=get(index-1);
        Node node= new Node(item);
        node.next=prev.next;
        prev.next=node;
        size++;
    }

    public void insertlast(int item){

        if(size==0){
            insertfirst(item);
            return;
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

    public void duplicates(){

        Node node =head;

        while(node.next!=null){

            if(node.next.data==node.data){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;

    }

    public int delete(int index){

        if(index==0){
           return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }

        Node prev=get(index-1);
        int temp=prev.next.data;
        prev.next=prev.next.next;
        size--;
        return temp;
    }

    public int deletelast(){
        if(size<2){
           return deletefirst();

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

    public Node mid(){
        Node slow=head;
        Node fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node get(int index){
        Node node=head;

        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node node=head;

        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
        System.out.println("End");
    }


    public LinkedList merge(LinkedList first , LinkedList second){

        Node firstnode=first.head;
        Node secondnode=second.head;
        LinkedList list =new LinkedList();
        while(firstnode!=null &&secondnode!=null){

            if(firstnode.data<secondnode.data){
                list.insertlast(firstnode.data);
                firstnode=firstnode.next;
            }
            else{
                list.insertlast(secondnode.data);
                secondnode=secondnode.next;
            }
        }

        while(firstnode!=null){
            list.insertlast(firstnode.data);
            firstnode=firstnode.next;
        }

        while(secondnode!=null){
            list.insertlast(secondnode.data);
            secondnode=secondnode.next;
        }
        return list;
    }


    private class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

    }
}
