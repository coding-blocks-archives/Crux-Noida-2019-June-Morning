package com.company.lect12;

public class client {

    public static void main(String[] args) {
    Engine engine = new Engine();
        engine.acc_speed=7;
        engine.start();
        engine.stop();
        engine.accelerate();
        engine.khamba();
//          engine.makeNoise();
        // sum("abc",1,2);
    }
//    public static void sum(String s,int... ar){
//        int s1=0;
//        for (int i = 0; i <ar.length ; i++) {
//            s1=s1+ar[i];
//        }
//        System.out.println(s1);
//    }


}
