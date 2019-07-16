package com.company.lec11;

public class StackClient {
    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        try {
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
//            System.out.println(stack.pop());
            System.out.println("hello");
            System.out.println(stack.pop());
            System.out.println("hello");
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
