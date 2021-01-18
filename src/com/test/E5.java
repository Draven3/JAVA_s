package com.test;

public class E5 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        int j = 0;
        for (int i=30;i>=0;i--){
            if (i%2==1 && j<12){
                arr[j]=i;
                j++;

            }
        }
        for (int i =0;i<12;i++){
            System.out.println(arr[i]);
        }
    }
}
