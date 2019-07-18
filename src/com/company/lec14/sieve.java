package com.company.lec14;

public class sieve {

    public static void main(String[] args) {
        int n=10;
        boolean[] prime=new boolean[n+1];

        for (int i = 2; i*i<=prime.length; i++) {

            if(!prime[i]){
                for (int j =2*i; j <prime.length ; j+=i) {
                   prime[j]=true;
                }
            }
        }

        for (int i = 2; i <prime.length ; i++) {
            if(!prime[i]){
                System.out.println(i);
            }
        }
    }
}
