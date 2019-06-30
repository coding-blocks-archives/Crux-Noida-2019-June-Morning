package com.company.Lect5;

import java.util.Scanner;

public class twodsamples {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int ar[][] =new int[3][3];

        int ar1[][]={ {1,2,3},{4,5,6},{7,8,9}};

//        for (int i = 0; i <ar.length ; i++) {
//            for (int j = 0; j <ar[i].length ; j++) {
//               ar[i][j]=s.nextInt();
//            }
//
//        }


        horizontalwave(ar1);
    }

    public static void horizontalwave(int ar[][]){

        for (int i = 0; i <ar.length ; i++) {

            if(i%2==0){
                for (int j = 0; j <ar[i].length ; j++) {
                    System.out.print(ar[i][j]+ " ");
                }
            }
            else{
                for (int j = ar[i].length-1; j >=0 ; j--) {
                    System.out.print(ar[i][j]+ " ");
                }
            }
            System.out.println();

        }
    }

    public static void verticalwave(int ar1[][]){
        for (int i = 0; i <ar1.length ; i++) {
            for (int j = 0; j <ar1[i].length ; j++) {
                System.out.print(ar1[j][i]+" ");
            }
            System.out.println();
        }

    }

}
