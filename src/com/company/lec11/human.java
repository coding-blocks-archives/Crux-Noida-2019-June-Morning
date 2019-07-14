package com.company.lec11;

public class human {

   String name;

   int balance=10000;

   public void bal(int balance){
       this.balance=balance;
   }

   public int loan(){
        int t=this.balance/10;
        balance=balance-t;
        System.out.println("Haan gareeb ho rha hun "+balance);
        return balance;
    }

    public void fest(){
        System.out.println("hurray hurray");
    }


    public void eat(){

        if(balance<100){
            System.out.println("nikal yahan se. dafa ho ja");
        }
        System.out.println("bhook lagi he khaana do");
        balance=balance-200;
    }
}
