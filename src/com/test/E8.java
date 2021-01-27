package com.test;

import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if ("GET".equals(str)) {
            StringBuilder S = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int n = (int) (Math.random() * 10);
                S.append(n); }
            System.out.println(S.toString());
        }
    }
}


