package com.company.Lect6;

import java.util.Arrays;
import java.util.Scanner;

public class assignmentques {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int precision=s.nextInt();
      float ans= root(n);

      float inc= 0.1f;

        for (int i = 0; i <precision ; i++) {

            while(ans*ans<=n){
                ans=ans+inc;
            }
            ans=ans-inc;
            inc=inc/10;
        }

        System.out.printf("%."+precision+"f",ans);
    }


    public static int root(int n){

        int start=0;
        int end=n;
        int ans=0;
        while(start<=end){

            int mid= (start+end)/2;

            if(mid*mid==n){
                return mid;
            }

            if(mid*mid<n){
                start=mid+1;
                ans=mid;
            }

            else{
                end=mid-1;
            }
        }
        return ans;
    }


}
