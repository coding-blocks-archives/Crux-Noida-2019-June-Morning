package com.company.lec11;

public class numpad {


    public static void main(String[] args) {

        numpadques("","12");
    }

    public static void numpadques(String processed,String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        int digit= unprocessed.charAt(0)-'0';

        for (int i = (digit-1)*3; i <digit*3 ; i++) {
            if(i==26){
                continue;
            }

            char ch=(char)(i+'a');
            numpadques(processed+ch,unprocessed.substring(1));
        }
    }
}
