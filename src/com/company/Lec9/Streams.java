package com.company.Lec9;

public class Streams {

    public static void main(String[] args) {
        System.out.println(replacepi("","pppipppi"));
    }


    public static String replacepi(String processed ,String unprocessed) {

        if (unprocessed.length() < 2) {
            return processed + unprocessed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'p' && unprocessed.charAt(1) == 'i') {
            return replacepi(processed + "3.14", unprocessed.substring(2));
        } else {
            return replacepi(processed + ch, unprocessed.substring(1));
        }
    }

    public static String skiphi(String processed ,String unprocessed) {

        if (unprocessed.length() < 2) {
            return processed + unprocessed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'p' && unprocessed.charAt(1) == 'i') {
            return replacepi(processed , unprocessed.substring(2));
        } else {
            return replacepi(processed + ch, unprocessed.substring(1));
        }
    }
}
