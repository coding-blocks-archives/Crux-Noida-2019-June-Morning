package com.company.lect15;

public class lnClient {

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertfirst(14);
        list.insertfirst(13);
        list.insertfirst(15);
        list.insertlast(20);
        System.out.println("deleted element is "+list.deletefirst());
        list.display();
    }
}
