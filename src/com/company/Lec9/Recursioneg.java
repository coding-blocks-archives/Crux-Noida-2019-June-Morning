package com.company.Lec9;

public class Recursioneg {


    public static void main(String[] args) {
        //dice("",4);
        asciisubsequence("","abc");
    }

    public static void dice(String processed,int target){

       if(target==0){
           System.out.println(processed);
           return;
       }

        for (int i = 1; i <=6&&i<=target ; i++) {

            dice(processed+i,target-i);
        }
    }

    public static void asciisubsequence(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch= unprocessed.charAt(0);
        unprocessed=unprocessed.substring(1);

        asciisubsequence(processed+ch,unprocessed);
        asciisubsequence(processed+(int)ch,unprocessed);
        asciisubsequence(processed,unprocessed);
    }
}
