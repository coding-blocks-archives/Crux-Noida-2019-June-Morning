package com.company.lec10;

public class lexonum {

    public static void main(String[] args) {
        lexnum(0,1000);
    }

    public static void lexnum(int present,int target){

        if(present>target){
            return;
        }
        System.out.println(present);

        for (int i = 0; i <10 ; i++) {

            if(present==0&&i==0){
                continue;
            }

            lexnum(present*10+i,target);
        }
    }

}
