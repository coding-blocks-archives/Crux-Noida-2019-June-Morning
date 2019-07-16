package com.company.lec11;

public class Human {

   String name;

   int balance;
    final int hands;
//   public void bal(int balance){
//       this.balance=balance;
//   }

    public Human(){
        //int balance=11;

        this(10000);

        name="hi";
    }

//    public Human(Human old){
//        this.hands=old.hands;
//        this.balance=old.balance;
//        this.name=old.name;
//    }

    public Human(int balance){
        this(balance,"Anonymous");

    }

    public Human(int balance,String name){
        this.balance=balance;
        this.name=name;
        hands=2;
    }

   public int loan(){
        int t=this.balance/10;
        balance=balance-t;
        System.out.println("Haan gareeb ho rha hun "+balance);
        return balance;
    }

    public static void fest(){
        System.out.println("hurray hurray");

    }


    public void eat(){

        if(balance<100){
            System.out.println("nikal yahan se. dafa ho ja");
            return;
        }
        System.out.println("bhook lagi he khaana do");
        balance=balance-200;
    }
}
