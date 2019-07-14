package com.company.lect;

import java.util.Arrays;

public class mergesort {

    public static void main(String[] args) {

        int ar[] ={5,4,1,3,2};
//        System.out.println(Arrays.toString(mergesort(ar)));
        char ch='a';
        char ch1='b';

        String s1=""+ch+ch1;
        System.out.println(s1);
        quicksort(ar,0,ar.length);
        System.out.println(Arrays.toString(ar));
    }


    public static int[] mergesort(int[] nums){
        if(nums.length==1){
            return nums;
        }

        int mid=nums.length/2;

        int first[]= mergesort(Arrays.copyOfRange(nums,0,mid));
        int second[]=mergesort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(first,second);
    }

    public static int[] merge(int[] first, int[] second) {

        int mix[]=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length&&j<second.length){

            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
                k++;
            }
            else{
                mix[k]=second[j];
                j++;
                k++;
            }
        }

        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

       return mix;
    }

    public static void quicksort(int nums[],int start,int end){

        if(end<=start){
            return;
        }

        int pivot=end-1;

       pivot= pivotadjust( nums,start,pivot);

       quicksort(nums,0,pivot);
        quicksort(nums,pivot+1,end);
    }

    private static int pivotadjust(int[] nums, int start,int pivot){

  //         int i=start;
           int j=start;

        for (int i = start; i <pivot ; i++) {
            if(nums[i]<nums[pivot]){
                int t=nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                j++;
            }
        }

        int t=nums[pivot];
        nums[pivot]=nums[j];
        nums[j]=t;
    return j;
    }
}
