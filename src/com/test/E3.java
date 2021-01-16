package com.test;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        int i=0;
        int j=str.length()-1;
        boolean result =true;
        for (;i<j;i++,j--){
            if (str.charAt(i)!=str.charAt(j)){
                result =false;
                break;
            }
        }
        if (result){
            System.out.println("该字符串是一个回文数");
        }else {
            System.out.println("该字符串不是一个回文数");
        }
    }
}
