package com.company.Lec9;

public class Streams {

    public static void main(String[] args) {
        System.out.println(skiphimodified("","hihithi"));
    }


    public static String replacepi(String processed ,String unprocessed) {

        if (unprocessed.length() < 2) {
            return processed + unprocessed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'p' && unprocessed.charAt(1) == 'i') {
            return replacepi(processed, unprocessed.substring(2));
        } else {
            return replacepi(processed + ch, unprocessed.substring(1));
        }
    }

    public static String skiphi(String processed ,String unprocessed) {

        if (unprocessed.length() < 2) {
            return processed + unprocessed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'h' && unprocessed.charAt(1) == 'i') {
            return skiphi(processed , unprocessed.substring(2));
        } else {
            return skiphi(processed + ch, unprocessed.substring(1));
        }
    }

    public static String skiphimodified(String processed ,String unprocessed) {

        if (unprocessed.length() < 2) {
            return processed + unprocessed;
        }

        char ch = unprocessed.charAt(0);

        if (ch == 'h' && unprocessed.charAt(1) == 'i') {
            if (unprocessed.length() > 2) {

                if (unprocessed.charAt(2) == 't') {
                    return skiphimodified(processed + unprocessed.substring(0, 3), unprocessed.substring(3));
                }
                else {
                    return skiphimodified(processed, unprocessed.substring(2));
                }
            }
            else {
                return skiphimodified(processed, unprocessed.substring(2));
            }
        }
               else {
            return skiphimodified(processed + ch, unprocessed.substring(1));
        }


    }
}
