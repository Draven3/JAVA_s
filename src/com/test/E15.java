package com.test;

import java.util.Scanner;

public class E15 {

    /*
        编写一个命令行程序，从命令行输入一个字符串，内容为10个整数，每个整数用英文逗号（,）隔开，之后程序做以下处理：
        将字符串中每个整数放入一个一维数组中，然后将前5个元素与后5个元素对换，即第1个元素与第10个元素互换，
        第2个元素与第9个元素互换…第5个与第6个元素互换，完成后，将结果输出到命令行。
        示例：
        输入内容："1,2,3,4,5,6,7,8,9,10"
        输入内容："10,9,8,7,6,5,4,3,2,1"
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arrStr = str.split(",");
        int[] arr = new int[arrStr.length];
        for (int i = 0, j = arrStr.length - 1; i < j; i++, j--) {
            arr[i] = Integer.parseInt(arrStr[j]);
            arr[j] = Integer.parseInt(arrStr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}

