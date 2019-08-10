package com.company.Lec22;

public class oard {

    public static void main(String[] args) {
        int target=4;
        int mem[]=new int[target+1];
        System.out.println(countDp(4,4,mem));

    }

    public static int count(int face,int target){

        if(target==0){
            return 1;
        }
         int cnt=0;
        for (int i = 1; i <=face&&i<=target ; i++) {
            cnt+=count(face,target-i);
        }
        return cnt;
    }

    public static int countDp(int face,int target,int mem[]){
        if(target==0){
            return 1;
        }
        if(mem[target]!=0){
            return mem[target];
        }
        int cnt=0;
        for (int i = 1; i <=face&&i<=target ; i++) {
            cnt+=count(face,target-i);
        }
        mem[target]=cnt;
        return mem[target];
    }

    public static int diceitrDp(int faces,int target){
        int mem[]=new int[target+1];
        mem[0]=1;

        for (int i = 1; i <=target ; i++) {
            int cnt=0;

            for (int face = 1; face <=faces&& face<=i ; face++) {
                cnt+=mem[i-face];
            }
            mem[i]=cnt;
        }
        return mem[target];
    }
}
