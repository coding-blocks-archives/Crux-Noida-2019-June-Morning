
package com.company.lec2;

import java.util.Scanner;

class salary {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
         int sal=s.nextInt();

        if(sal>5000){
            sal=sal+5000;
        }
        else{
            sal=sal+3000;
        }
        System.out.println(sal);

    }
}
