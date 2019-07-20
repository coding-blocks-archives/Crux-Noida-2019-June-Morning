package com.company.lect15;

public class TeachingAssistant implements Student,Teacher{
    @Override
    public void study() {
        System.out.println("I study more like a teacher");
    }

    @Override
    public void teach() {
        System.out.println("i study more like student");
    }

    @Override
    public void dance() {
        System.out.println("I dance like a student");
    }

    @Override
    public void bunk() {
        System.out.println("i bunk like a student");
    }
}
