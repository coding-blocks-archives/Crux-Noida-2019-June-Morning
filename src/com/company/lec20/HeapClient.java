package com.company.lec20;

public class HeapClient {
    public static void main(String[] args) throws Exception {

        Heap<Integer> heap = new Heap<>();

        heap.insert(4);
        heap.insert(5);
        heap.insert(8);
        heap.insert(2);

       System.out.println(heap.remove());
        heap.display();
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
    }
}