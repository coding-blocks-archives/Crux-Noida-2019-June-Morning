package com.company.Lec22;

public class fibo {

    public static void main(String[] args) {
        //System.out.println(fibo(5));
        int n=4;
       long ar[] =new long[n+1];
        System.out.println(fiboDp(n,ar));
    }


    public static int fibo(int n){

        if(n<2){
            return n ;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public static long fiboDp(int n, long mem[]){

        if(n<2){
            return n ;
        }

        if(mem[n]!=0){
            return mem[n];
        }

        mem[n]= fiboDp(n-1,mem)+fiboDp(n-2,mem);
        return mem[n];
    }

    public static long fiboItrDp(int n,long mem[]){

        mem[0]=0;
        mem[1]=1;

        for (int i = 2; i <=n ; i++) {
            mem[i]=mem[i-1]+mem[i-2];
        }
        return mem[n];
    }



}
