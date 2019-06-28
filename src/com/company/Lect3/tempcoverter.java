package com.company.Lect3;

import java.util.Scanner;

public class tempcoverter {

    public static void main(String[] args) {


        Scanner s =new Scanner(System.in);
        int start=s.nextInt();
        int end=s.nextInt();
        int step=s.nextInt();

        while(start<=end){

            float c=(5f/9)*(start-32);
            System.out.println(c);
            start=start+step;
        }

    }
}
