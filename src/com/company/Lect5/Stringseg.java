package com.company.Lect5;

public class Stringseg {


    public static void main(String[] args) {

        String line="Hello";

        String s="Hello";

//        line=s+line;
//        System.out.println(line.equals(s));
//
//        System.out.println(line.charAt(0));
//
        System.out.println(line.substring(0,1));
//
//        System.out.println(s.length());
            substrings(s);

        System.out.println(s.indexOf("k",3));
    }

    public static void substrings(String s){

        for (int i = 0; i <s.length() ; i++) {
            for (int j = i+1; j <=s.length() ; j++) {
                System.out.println(s.substring(i,j));
            }

        }
    }

}
