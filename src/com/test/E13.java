package com.test;


/*
    编写一个命令行程序，从命令行输入两个字符串（用英文逗号隔开，内容均为整数），程序接收到输入的内容后，
    将其分别赋值给两个整型变量，并用第一个整型内容除以第二个整型内容，并将结果输出到命令行。
    注意：考虑到除数不能为0，所以需要使用try...catch进行异常捕获，如果没有发生异常，则将结果输出到命令行；
    如果发生异常，则将异常信息转为字符串后输出到命令行。
    示例：
    输入内容：10, 5
    输出内容：2
    输入内容：5, 0
    输出内容：xxxxxxxxxx......(这里省略没写，其实内容就是异常信息)
 */

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] nums = str.split(",");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);
        try {
            int result = num1 / num2;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("除数不能为0");
        }
    }
}

