package com.company.Lec22;

public class mazepath {

    public static void main(String[] args) {

    }

    public static int mazecount(int row,int col){

        if(row==1||col==1){
            return 1;
        }

        return mazecount(row-1,col)+mazecount(row,col-1);
    }

    public static int mazecountDp(int row,int col,int mem[][]){

        if(row==1||col==1){
            return 1;
        }

        if(mem[row][col]!=0){
            return mem[row][col];
        }

        mem[row][col] =mazecountDp(row-1,col,mem)+mazecountDp(row,col-1,mem);
        return mem[row][col];
    }

    public static int mazecountDpitr(int row,int col,int mem[][]){

        for (int r = 1; r <=row ; r++) {
            for (int c = 1; c <=col ; c++) {
                if(row==1||col==1){
                mem[r][c]=1;
                }
                else{
                 mem[r][c]=mem[r-1][c]+mem[r][c-1];
                }
            }
        }
        return mem[row][col];
    }
}
