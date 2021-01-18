package com.test;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[5];
        int num  =  0;
        int sum  =  0;
        for (int i = 0; i < 5; i++) {
            num = (int) (num + n * Math.pow(10, i));
            arr[i] = num;
            if (i < 4) {
                sum += num * 2;
            } else {
                sum += num;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (i < 4) {
                System.out.print(arr[i] + "+");
            } else if (i < 8) {
                System.out.print(arr[8 - i] + "+");
            } else {
                System.out.print(arr[8 - i] + "=" + sum);
            }
        }
    }
}
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = (x + x * 11 + x * 111 + x * 1111) * 2 + x * 11111;
//        System.out.println(x + "+" + x * 11 + "+" + x * 111 + "+" + x * 1111 + "+" + x * 11111 + "+" + x * 1111 + "+" + x * 111 + "+" + x * 11 + "+" + x + "=" + y);
//
//    }
//}
