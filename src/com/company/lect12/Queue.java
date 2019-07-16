package com.company.lect12;

public class Queue {

    private int data[];
    private int DEFAULT_SIZE=10;
    private int end=0;

    public Queue(){
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
          int temp=data[0];
        for (int i = 1; i <end ; i++) {
            data[i-1]=data[i];
        }
         end--;
        return temp;
    }

    private boolean isEmpty() {
        return end==0;
    }

    public int front(){
        return data[0];
    }

    public void display(){

        for (int i = 0; i <end ; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("End");
    }



}
