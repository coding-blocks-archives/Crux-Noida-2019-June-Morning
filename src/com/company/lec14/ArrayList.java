package com.company.lec14;

public class ArrayList {

    private int data[];
    private int DEFAULT_SIZE = 10;
    private int size=0;
    public ArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int item) {
        if(isFull()){
            resize();
        }
        System.out.println("inserting item"+item);
        data[size++]=item;
    }

    private void resize() {
        System.out.println("Me badal gya");
        int temp[]=new int[data.length*2];

        for (int i = 0; i <data.length ; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
     return size==data.length;
    }


    public void remove() {
     size--;
    }

    public int get(int index) {
       return data[index];
    }

    public void set(int index, int element) {
      data[index]=element;
    }

}
