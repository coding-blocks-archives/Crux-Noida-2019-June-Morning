package com.company.Lect3;

import java.util.Scanner;

public class functioneg {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
//        functioneg eg = new functioneg();
        int start=s.nextInt();
        int end=s.nextInt();
        int step=s.nextInt();

        converter(start,end,step);
    }

    public  static void converter(int start,int end,int step){

        while(start<=end){

            float c=(5f/9)*(start-32);
            System.out.println(c);
            start=start+step;
        }

    }
}
