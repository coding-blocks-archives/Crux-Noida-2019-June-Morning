package com.company.lec18;

public class bstclient {

    public static void main(String[] args) {

        genericbst<Integer> tree=new genericbst<>();
        tree.populate(10);
        tree.populate(5);
        tree.populate(15);
        tree.populate(30);
        tree.populate(2);
        tree.populate(14);
        tree.display();
//        tree.find(15);
//        tree.find(10);
        tree.inrange(7,30);
    }
}
