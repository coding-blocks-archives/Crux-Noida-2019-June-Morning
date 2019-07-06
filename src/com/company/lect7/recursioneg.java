package com.company.lect7;

public class recursioneg {

    public static void main(String[] args) {
           int ar[]={1,2,10,4,5,6};
//        pd(4);
//        System.out.println(fact(4));
//        System.out.println(fibo(4));
      //  System.out.println(sorted(ar,0));
        System.out.println(linear(ar,0,101
        ));
    }

    public static void pd(int n){

        if(n==0){
            return;
        }

        pd(n-1);
        System.out.println(n);

    }

    public static int fact(int n){
        if(n==0){
            return 1;
        }

        return n*fact(n-1);
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }


    public static boolean sorted(int ar[],int index){

        if(index==ar.length-1){
            return true;
        }

        if(ar[index]>ar[index+1]){
            return false;
        }

        return sorted(ar,index+1);

    }

    public static boolean linear(int ar[],int index,int element){

        if(index==ar.length){
            return false;
        }

        if(ar[index]==element){
            return true;
        }

        return linear(ar,index+1,element);

    }
}
