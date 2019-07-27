package com.company.lec19;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("apple", "sweet fruit");
        map.put("mango","king of fruits");
        map.put("orange","yum yum");

        System.out.println(map.get("apple"));
        map.remove("apple");
        System.out.println(map.get("apple"));
        Integer i=new Integer(1);
        i.hashCode();


        System.out.println(map.get(1));
     map.remove("apple");
        System.out.println("apple");
        System.out.println(map.keySet());
        System.out.println(map.values());

        for (String fruit: map.keySet()) {
            System.out.println(fruit);
        }

        for(String fruitvalue: map.values()){
            System.out.println(fruitvalue);
        }

        Map<Character,Integer> freq= vowels("Hello");
        System.out.print(freq.toString());
    }

    public static Map<Character,Integer> find(String line) {

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (freq.containsKey(ch)) {

                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }
        return freq;
    }

    public static Map<Character,Integer> vowels(String line) {

        Map<Character, Integer> freq = new HashMap<>();

        freq.put('a',0);
        freq.put('e',0);
        freq.put('i',0);
        freq.put('o',0);
        freq.put('u',0);
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (freq.containsKey(ch)) {

                freq.put(ch, freq.get(ch) + 1);
            }
        }
        return freq;
    }
}
