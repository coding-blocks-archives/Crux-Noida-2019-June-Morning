package com.company.lec14;

import com.company.lect12.Queue;

public class DynamicQueue extends circularqueue {
    @Override
    public boolean enqueue(int item) {
        if(this.isFull()){

            int temp[]=new int[data.length*2];

            for (int i = 0; i <size; i++) {

                temp[i]=data[(front+i)%data.length];
            }

            front=0;
            end=data.length;
            data=temp;

        }
        return super.enqueue(item);
    }
}
