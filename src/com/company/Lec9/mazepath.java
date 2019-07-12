package com.company.Lec9;

import java.util.ArrayList;

public class mazepath {


    public static void main(String[] args) {

        ArrayList list=new ArrayList();
//        listmazepath("",3,3,list);
        System.out.println(mazepathcount("",3,3));
//        System.out.println(list);


    }

    public static void listmazepath(String processed,int row,int col,ArrayList list){

        if(row==1&&col==1){
            list.add(processed);
            return;
        }
        int cnt =0;

        if(row>1){
            listmazepath(processed+"V",row-1,col,list);
        }

        if(col>1){
            listmazepath(processed+"H",row,col-1,list);
        }

    }

    public static void mazepath(String processed,int row,int col) {

        if (row == 1 && col == 1) {
            System.out.println(processed);
           return ;
        }

        if (row > 1) {
            mazepath(processed + "V", row - 1, col);
        }

        if (col > 1) {
            mazepath(processed + "H", row, col - 1);
        }

    }

    public static int cnt=0;

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

        public static ArrayList list2mazepath(String processed,int row,int col){

            if(row==1&&col==1){
                ArrayList list =new ArrayList();
                list.add(processed);
                return list;
            }
             ArrayList list =new ArrayList();

            if(row>1){
               list.addAll(list2mazepath(processed+"V",row-1,col));
            }

            if(col>1){
                list.addAll(list2mazepath(processed+"H",row,col-1));
            }
            return list;
        }


    }

