package com.company.lect4;

import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        int ar[]={0,5,5,4,3,2,1};
        insertion(ar);
         System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int ar[]){

        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar.length-i-1 ; j++) {
                if(ar[j]>ar[j+1]){
                    swap.swapar(ar,j,j+1);
                }
            }
        }
    }

    public static void selectionsort(int ar[]){

        for (int i = 0; i <ar.length ; i++) {

            int max=swap.maxIndexar(ar,0,ar.length-i-1);
            swap.swapar(ar,max,ar.length-i-1);
        }
    }

    public static void insertion(int ar[]){

        for (int i = 0; i <ar.length-1 ; i++) {

            for (int j = i+1; j>0 ; j--) {

                if(ar[j]<ar[j-1]){
                    swap.swapar(ar,j,j-1);
                }

                else{
                    break;
                }
            }

        }

    }


}
