package com.company.lect12;

public class Engine {

    int acc_speed=2;
     public void start(){
        System.out.println("I start as a generic engine");
    }
//    final public void start(){
//        System.out.println("I start as a generic engine");
//    }

    public void stop(){
        System.out.println("I stop as a generic engine");
    }

    public void accelerate(){
        System.out.println("I accelerate as a generic engine");
    }

    public void accelerate(int acc_speed){
        System.out.println("I accelerate as a generic engine: "+acc_speed);
    }

//    public abstract void handbrakes();
//
        public static void khamba(){
            System.out.println("this a engine khamba");
        }
}
