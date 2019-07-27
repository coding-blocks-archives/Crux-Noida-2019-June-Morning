package com.company.lec19;

import java.util.HashMap;
import java.util.Map;

public class client {
    public static void main(String[] args) {

       MapAL map = new MapAL();

        map.put("apple", "sweet fruit");
        map.put("mango","king of fruits");
        map.put("orange","yum yum");
//        String s="hiii";
//        s.hashCode();
        System.out.println(map.get("apple"));
//        Integer i = new Integer(1);
//        i.hashCode();
//        map.remove("apple");
//        System.out.println(map.get("apple"));
        System.out.println(map.get("mango"));
        System.out.println(map.get("orange"));
//        System.out.println(map.toString());
    }
}