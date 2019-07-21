package com.company.lec16;

import com.company.lect15.LinkedList;

public class lnClient {

    public static void main(String[] args) {
        LinkedList list =new LinkedList();
        list.insertfirst(14);
        list.insertfirst(13);
        list.insertfirst(15);
        list.insert(6,5);
        list.insertlast(20);
//        System.out.println("deleted element is "+list.deletefirst());
        list.display();
    }
}
