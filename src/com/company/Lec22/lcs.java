package com.company.Lec22;

public class lcs {

    public static void main(String[] args) {

    }

    public static int lcs1(String s1 ,String s2, int flen, int slen){

        if(flen==0||slen==0){
            return 0;
        }

        int cnt=0;

        if(s1.charAt(flen-1)==s2.charAt(slen-1)){
            cnt=1+lcs1(s1,s2,flen-1,slen-1);
        }
        else{
            int left= lcs1(s1,s2,flen-1,slen);
            int right=lcs1(s1,s2,flen,slen-1);
            cnt=Math.max(left,right);
        }
        return cnt;
    }

    public static int lcs1(String s1 ,String s2, int flen, int slen, Integer mem[][]){

        if(flen==0||slen==0){
            return 0;
        }

        if(mem[flen][slen]!=null){
            return mem[flen][slen];
        }

        int cnt=0;

        if(s1.charAt(flen-1)==s2.charAt(slen-1)){
            cnt=1+lcs1(s1,s2,flen-1,slen-1);
        }
        else{
            int left= lcs1(s1,s2,flen-1,slen);
            int right=lcs1(s1,s2,flen,slen-1);
            cnt=Math.max(left,right);
        }

        mem[flen][slen]=cnt;
        return cnt;
    }

    public static int LcsDp(String s1 ,String s2){

        Integer[][] mem =new Integer[s1.length()+1][s2.length()+1];
        for (int f = 0; f <=s1.length() ; f++) {
            for (int s = 0; s<=s2.length() ; s++) {

                if(f==0 || s==0){
                    mem[f][s]=0;
                }
                else{
                    int cnt=0;
                    if(s1.charAt(f-1)==s2.charAt(s-1)){
                   cnt=mem[f-1][s-1]+1;
                    }

                    else{
                        int left=mem[f-1][s];
                        int right=mem[f][s-1];
                        cnt=Math.max(left,right);
                    }
                    mem[f][s]=cnt;
                }
            }
        }
        return mem[s1.length()][s2.length()];
    }


}
