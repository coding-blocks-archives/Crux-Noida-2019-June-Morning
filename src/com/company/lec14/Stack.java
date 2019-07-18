package com.company.lec14;

public class Stack {

    protected int data[];
    private int DEFAULT_SIZE=10;

    private int top;

    public Stack(){

        this.data=new int[DEFAULT_SIZE];
        this.top=-1;
    }

    public boolean push(int item){
        if(isFull()){
            return false;
        }

        data[++top]=item;
        return true;
    }

    public boolean isFull() {

        return top==data.length-1;
    }

    public int pop() {
//        if(isEmpty()){
//          throw new Exception("abey khali he be");
//        }
        return data[top--];

    }

    private boolean isEmpty() {
          return top==-1;
    }

    public int peek(){
          return data[top];
    }
}
