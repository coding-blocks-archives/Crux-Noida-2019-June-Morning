package com.company.lec14;

public class StackClient {
    public static void main(String[] args) {

     DynamicStack stack=new DynamicStack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);

//        try {
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
//            System.out.println(stack.pop());
////            System.out.println(stack.pop());
//            System.out.println("hello");
//            System.out.println(stack.pop());
//            System.out.println("hello");
//        }
//
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }

        for (int i = 0; i <100; i++) {
            stack.push(i);
        }

        for (int i = 0; i <100 ; i++) {
            System.out.println(stack.pop());
        }
    }
}
