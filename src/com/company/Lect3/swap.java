package com.company.Lect3;

public class swap {

    public static void main(String[] args) {
        int a=6;
        int b=7;
        System.out.println(a +" "+ b);
        swapnum(a,b);
        System.out.println(a +" "+ b);
       add(a,b);
        System.out.println(swapnum(a,b));
        System.out.println(a);


    }

    public static int swapnum(int a,int b){

        int temp=a;
        a=b;
        b=temp;
       return a;
    }

    public static void add(int a,int b){
        int c=a+b;


    }
}
