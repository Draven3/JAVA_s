package com.test;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = (x + x * 11 + x * 111 + x * 1111) * 2 + x * 11111;
        System.out.println(x + "+" + x * 11 + "+" + x * 111 + "+" + x * 1111 + "+" + x * 11111 + "+" + x * 1111 + "+" + x * 111 + "+" + x * 11 + "+" + x + "=" + y);

    }
}
