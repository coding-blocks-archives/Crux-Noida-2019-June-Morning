package com.company.lect4;

public class Searching {

    public static void main(String[] args) {
        int ar[]={3,4,5,9,10};
//        System.out.println(linearSearch(ar,9));
//        if(linearSearch(ar,9)){
//            System.out.println("Element found");
//        }
//        else{
//            System.out.println("not found");
//        }
        System.out.println(binarysearch(ar,9));

    }

    public static boolean linearSearch(int ar[], int element){

        for (int i = 0; i <ar.length ; i++) {
               if(ar[i]==element){
                   return true;
               }
        }
        return false;
    }

    public static int binarysearch(int ar[],int element){

        int start=0;
        int end=ar.length-1;

        while(start<=end){

            int mid=(start+end)/2;

            if(ar[mid]==element){
                return mid;
            }

            else if(ar[mid]<element){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}
