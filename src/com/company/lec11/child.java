package com.company.lec11;

public class child {


    public static void main(String[] args) {



        human shubham= new human();
        shubham.name="Shubham";

        System.out.println(shubham.name);
        System.out.println(shubham.balance);
        shubham.loan();
        shubham.loan();
        shubham.loan();
        shubham.loan();
        shubham.loan();

        human arvind =new human();
        arvind.fest();
        arvind.name="Arvind";
        System.out.println(arvind.balance);
        arvind.loan();
        System.out.println(shubham.balance);
    }
}
