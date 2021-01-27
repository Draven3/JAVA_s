package com.test;

import java.util.Scanner;

public class E7 {
    /*
        编写一个命令行程序，只要从命令行输入的内容是GET，则取得6位的随机数作为验证码，并在命令行输入。
        示例：
        命令行输入：GET
        命令行输出：XXXXXX（自动生成的随机数）
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if ("GET".equals(str)) {
            StringBuilder S = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                int n = (int) (Math.random() * 10);
                S.append(n);
            }
            System.out.println(S.toString());
        }
    }
}
