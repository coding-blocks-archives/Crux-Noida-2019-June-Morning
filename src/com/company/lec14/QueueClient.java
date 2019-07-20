package com.company.lec14;

import com.company.lect12.circularqueue;

public class QueueClient {

    public static void main(String[] args) {

        DynamicQueue q= new DynamicQueue();

        for (int i = 0; i <50 ; i++) {
            q.enqueue(i);
            q.display();
        }

        for (int i = 0; i <48 ; i++) {
          q.deque();
            q.display();
        }

        q.enqueue(11);
        q.enqueue(12);
        q.enqueue(14);
        q.display();
    }
}
