package com.company.lect12;

public class optimizedQueue {

    private int data[];
    private int DEFAULT_SIZE=10;
    private int end=0;
    private int front=0;

    public optimizedQueue(){
       this.data=new int[DEFAULT_SIZE];
    }

    public boolean enqueue(int item){

        if(isFull()){
            return false;
        }

        data[end++]=item;
        return true;
    }

    private boolean isFull() {

     return end==data.length;
    }

    public int deque()  {
//        if(isEmpty()){
//            throw new Exception("Array is empty");
//        }
          int temp=data[front++];

        return temp;
    }

    private boolean isEmpty() {
        return end==0;
    }

    public int front(){
        return data[front];
    }

    public void display(){

        for (int i = front; i <end ; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }



}
