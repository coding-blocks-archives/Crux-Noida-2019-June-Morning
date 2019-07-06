package com.company.lect7;

import java.util.Arrays;

public class frequency {


    public static void main(String[] args) {
        String s="acbacdsab";
        int ar[]=freq(s);
        System.out.println(Arrays.toString(ar));


        for (int i = 0; i <ar.length ; i++) {
            while(ar[i]>0){
                System.out.print((char)(i+'a'));
                ar[i]--;
            }


        }

//        for (int i = 0; i <ar.length ; i++) {
//
//            if(ar[i]>0){
//                System.out.print((char)('a'+i));
//                if(ar[i]>1) {
//                    System.out.print(ar[i]);
//                }
//            }
//        }
    }

    public static int[] freq(String s){
        int ar[]=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            ar[ch-'a']++;
        }
        return ar;
    }
}
