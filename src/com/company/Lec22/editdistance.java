package com.company.Lec22;

public class editdistance {

    public static void main(String[] args) {
        String s1="a";
        String s2="abc";
        System.out.println(editdistance(s1,s2,s1.length(),s2.length()));
    }

    public static int editdistance(String s1,String s2, int flen,int slen){


        if(flen==0){
            return slen;
        }
        if(slen==0){
            return flen;
        }

        if(s1.charAt(flen-1)==s2.charAt(slen-1)){
            return editdistance(s1,s2,flen-1,slen-1);
        }
        else{
            return 1+(Math.min(editdistance(s1,s2,flen-1,slen),Math.min(editdistance(s1,s2,flen,slen-1),editdistance(s1,s2,flen-1,slen-1))));
        }
    }
}
