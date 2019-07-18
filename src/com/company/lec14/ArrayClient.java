package com.company.lec14;

public class ArrayClient {

    public static void main(String[] args) {
        ArrayList ar = new ArrayList();
        for (int i = 0; i <100 ; i++) {
            ar.add(i);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(ar.get(i));
        }

    }
}
