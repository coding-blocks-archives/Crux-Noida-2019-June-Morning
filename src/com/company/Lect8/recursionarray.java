package com.company.Lect8;

import com.company.lect4.swap;

import java.util.Arrays;

public class recursionarray {


    public static void main(String[] args) {
        pattern(4,0);
        int ar[]={3,4,2,1,5};
        bubblesort(ar,ar.length-1,0);
        System.out.println(Arrays.toString(ar));
    }

    public static void pattern(int row,int col){

        if(row==0){
            return;
        }

        if(col==row){
            System.out.println();
            pattern(row-1,0);
            return;
        }

        System.out.print("* ");
        pattern(row,col+1);
    }

    public static void bubblesort(int ar[],int row,int col){

        if(row==0){
            return;
        }

        if(col==row){

            bubblesort(ar,row-1,0);
            return;
        }

        if(ar[col]>ar[col+1]){
            swap.swapar(ar,col,col+1);
        }


        bubblesort(ar,row,col+1);
    }
}
