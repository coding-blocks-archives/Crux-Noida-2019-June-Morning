package com.company.lec20;

import java.util.PriorityQueue;

public class Priorityeg {
    public static void main(String[] args) {

        PriorityQueue<Human> priority = new PriorityQueue();
        priority.add(new Human(19,"lala"));
        priority.add(new Human(10,"lala2"));
        priority.add(new Human(20,"lala3"));

        System.out.println(priority.remove());

    }
}
