package com.company.Lec9;

import java.util.Arrays;

public class lexopermute {

    public static void main(String[] args) {

        String line ="abc";
        int fre[]=freq(line);

       lexo("",fre,line.length());
    }

    public static void lexo(String processed, int freq[],int length){

        if(length==0){
            System.out.println(processed);
            return;
        }

        for (int i = 0; i <freq.length ; i++) {
            if(freq[i]>0){
                freq[i]--;
                lexo(processed+(char)(i+'a'),freq,length-1);
                freq[i]++;
            }
        }

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
