package com.company.lect4;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {

        int ar[]={1,2,3,4,5};
//        System.out.println(Arrays.toString(ar));
//        swap(ar,1,2);
//        System.out.println(Arrays.toString(ar));
//
        System.out.println(Arrays.toString(increase(ar)));
        System.out.println(Arrays.toString(ar));
    }

    public static void swapar(int ar[],int i,int j){

        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    public static int max(int ar[]){
        int max=ar[0];
        for (int i = 1; i <ar.length ; i++) {
            if(max<ar[i]){
                max=ar[i];
            }
        }
        return max;
    }

    public static int maxIndex(int ar[]){
        int max=0;
        for (int i = 1; i <ar.length ; i++) {
            if(ar[max]<ar[i]){
                max=i;
            }
        }
        return max;
    }

    public static int maxIndexar(int ar[],int start,int end){
        int max=start;
        for (int i = start; i <=end ; i++) {
            if(ar[max]<ar[i]){
                max=i;
            }
        }
        return max;
    }
    public static int[] increase(int ar[]){

        for (int i = 0; i <ar.length ; i++) {
            ar[i]=ar[i]+10;
        }
        return ar;
    }


}
