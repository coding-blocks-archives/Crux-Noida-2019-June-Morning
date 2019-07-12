package com.company.lec10;

public class mazecount {


    public static void main(String[] args) {
        System.out.println(mazepathcount("",3,3));

    }

    public static int mazepathcount(String processed,int row,int col) {

        if (row == 1 && col == 1) {
            //System.out.println(processed);
            return 1 ;
        }
        int cnt=0;

        if (row > 1) {
            cnt+=mazepathcount(processed + "V", row - 1, col);
        }

        if (col > 1) {
            cnt+= mazepathcount(processed + "H", row, col - 1);
        }
        return cnt;

    }

}
