package com.company.lec2;

public class pattern3 {

    public static void main(String[] args) {

        int n=5;
        int row=n;
         int vmir=1;
        while(vmir<=2*n-1){
            int hmir=1;
            int col=1;
            while(hmir<=2*n-1){
                if(col<row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

                if(hmir<n){
                    col=col+1;
                }
                else{
                    col=col-1;
                }
                hmir=hmir+1;
            }
           System.out.println();
            if(vmir<n){
                row=row-1;
            }
            else{
                row=row+1;
            }
            vmir=vmir+1;
        }
    }
}
