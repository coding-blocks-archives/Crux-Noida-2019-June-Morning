package com.company.lect15;

public class JavaTeacher implements Teacher {


    @Override
    public void study() {
        System.out.println("Iam a Java Teacher");
    }

    @Override
    public void teach() {
        System.out.println("I teach like a Java Teacher");
    }

    @Override
    public void dance() {
        System.out.println("I dance in java");
    }


}
