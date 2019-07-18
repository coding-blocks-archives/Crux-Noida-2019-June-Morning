package com.company.lec14;

public class circularqueue {

    protected int data[];
    private int DEFAULT_SIZE=10;
    protected int end=0;
    protected int front=0;
    protected int size=0;

    public circularqueue()
    {
       this.data=new int[DEFAULT_SIZE];
    }

    public boolean enqueue(int item){

        if(isFull()){
            return false;
        }

        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public boolean isFull() {

     return size==data.length;
    }

    public int deque()  {
//        if(isEmpty()){
//            throw new Exception("Array is empty");
//        }
          int temp=data[front++];
          front=front%data.length;
          size--;

        return temp;
    }

    private boolean isEmpty() {
        return end==0;
    }

    public int front(){
        return data[front];
    }

    public void display(){

        for (int i = 0; i <size ; i++) {
            System.out.print(data[(front+i)%data.length]+" ");
        }
        System.out.println("End");
    }



}
