package com.test;

import java.util.Scanner;

public class E10 {
    public static void main(String[] args) {
        System.out.println("6, 12的最大值为：" + Demo.findMax(6, 12));
        System.out.println("6, 12, 10的最大值为：" + Demo.findMax(6, 12,10));
        System.out.println("19.35, 28.99, 65.99的最大值为：" + Demo.findMax(19.35, 28.99, 65.99));
        System.out.println("9.58, 18.65的最大值为：" + Demo.findMax(9.58,18.65));
    }
}

class Demo {
    public static int findMax(int a, int b) {
        int max = a > b ? a : b;
        return max;
    }

    public static int findMax(int a, int b, int c) {
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }

    public static double findMax(double a, double b) {
        double max = a > b ? a : b;
        return max;
    }

    public static double findMax(double a, double b, double c) {
        double temp = a > b ? a : b;
        double max = temp > c ? temp : c;
        return max;
    }
}