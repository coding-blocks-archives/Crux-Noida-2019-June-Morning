package com.company.Lect6;

public class buildereg {

    public static void main(String[] args) {
          String s="Hello";
        StringBuilder builder=new StringBuilder();
//        for (int i = 0; i <1000000; i++) {
//           // s=s+"a";
//            builder.append("a");
//        }
//        builder.setCharAt(3,'a');
        System.out.println(toggle(s));
        System.out.println((int)('a'));
        System.out.println(builder.toString());
    }

    public static StringBuilder toggle(String s){

        StringBuilder builder= new StringBuilder(s);
        for (int i = 0; i <builder.length() ; i++) {
            char ch=s.charAt(i);

            if(ch>='A'&& ch<='Z'){

                ch=(char)('a'+(ch-'A'));
            }

            else{
                ch=(char)('A'+(ch-'a'));
            }

            builder.setCharAt(i,ch);
        }

        return builder;
    }
}
