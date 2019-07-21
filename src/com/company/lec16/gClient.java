package com.company.lec16;

import java.util.Scanner;

public class gClient {

    public static void main(String[] args) {

        Scanner s =new Scanner("1 true 2 true 3 false true 4 false false true 5 false false");
        Generictrees tree = new Generictrees();
        tree.populate(s);
        tree.display();
    }
}
