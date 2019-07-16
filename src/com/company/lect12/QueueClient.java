package com.company.lect12;

public class QueueClient {

    public static void main(String[] args) {

        circularqueue q= new circularqueue();

        for (int i = 0; i <10 ; i++) {
            q.enqueue(i);
            q.display();
        }

        for (int i = 0; i <8 ; i++) {
          q.deque();
            q.display();
        }

        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(14);
        q.display();
    }
}
