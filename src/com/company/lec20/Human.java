package com.company.lec20;

public class Human implements Comparable<Human> {

    private int age;

    public int getAge() {
        return age;
    }

    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return age +"="+ name;
     }

    @Override
    public int compareTo(Human second) {
        return -(this.age-second.age);
    }
}
