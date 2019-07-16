package com.company.lec11;

public class Stack {

    private int data[];
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

    private boolean isFull() {
        return top==data.length-1;
    }

    public int pop() throws Exception{
        if(isEmpty()){
          throw new Exception("abey khali he be");
        }
        return data[top--];

    }

    private boolean isEmpty() {
          return top==-1;
    }

    public int peek(){
          return data[top];
    }
}
