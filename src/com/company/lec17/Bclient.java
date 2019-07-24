package com.company.lec17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bclient {

    public static void main(String[] args) throws FileNotFoundException {

        BinaryTree tree = new BinaryTree();
       File file =new File("input");
        Scanner s= new Scanner(file);
        tree.populate(s);
        tree.populate(s);
        tree.populate(s);
        tree.populate(s);

        tree.display();
        tree.height();
        tree.diameter();
        tree.mirror();
        tree.display();
        tree.find(150);
    }
}
