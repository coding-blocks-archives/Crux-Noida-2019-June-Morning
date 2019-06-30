package com.company.Lect5;

import java.util.ArrayList;

public class Arraylist {


    public static void main(String[] args) {

        ArrayList list =new ArrayList();

        list.add(2);
        list.add("Hello");
        System.out.println(list);
        list.set(1,5);

        list.clone();
        System.out.println(list.get(0));

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
