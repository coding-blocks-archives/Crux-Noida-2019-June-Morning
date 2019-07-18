package com.company.lect12;

public class PetrolEngine extends Engine {
//       int acc_speed=10;
    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

//    @Override
//    public void handbrakes() {
//        System.out.println("handbrakes");
//    }

    @Override
    public void start(){
        System.out.println("I start as petrol engine");
    }
    public void makeNoise(){
        System.out.println("hurr hurr");
    }

    public static void khamba(){
        System.out.println("this a petrol engine khamba");
    }

}
