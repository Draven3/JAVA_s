package com.test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*
    编写一个命令行程序，从命令行输入一个字符串，程序需要判断输入的字符串中哪个字符出现的次数最多，
    则将出现次数最多的字符删除（如果有多个出现次数相同的并且出现次数最多，则将多个全部删除），最后将删除后的结果输出的命令行。
    例如：
    字符串"ABCDAASBCB"，其中A和B出现的次数最多，都是3次，则从该字符串中将A和B全部删除，最后将删除A和B后的字符串"CDSC"输出到命令行。
 */
public class E17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                int n = map.get(ch);
                n++;
                map.put(ch, n);
            } else {
                map.put(ch, 1);
            }
        }
        int max = -1;
        ArrayList list = new ArrayList();
        for (char ch : map.keySet()) {
            int n = map.get(ch);
            if (n > max) {
                max = n;
                list.clear();
                list.add(ch);
            }
            if (n == max) {
                list.add(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (list.contains(ch)) {
                continue;
            }
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}

