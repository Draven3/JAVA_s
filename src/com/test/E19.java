package com.test;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class E19 {
    /*
        请在你的电脑中创建一个文本文件，文件名为white_list.txt，该文件内容为：
        192.168.123.001
        192.168.123.002
        192.168.123.003
        192.168.123.004
        192.168.123.005
        192.168.123.006
        该文件的内容其实就是一个IP地址的白名单。
        编写一个命令行程序，从命令行输入一个字符串，该字符串内容为一个IP地址（如192.168.123.101），之后程序做以下处理：
        读取文件white_list.txt中内容，并判断输入的IP地址是否在白名单内，如果不在白名单，则在命令行输出:“该IP地址不允许访问网络”；
        如果在白名单内，则在命令行输出：“该IP地址可以访问网络”。
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\Data\\white_list.txt"));
        String line = null;
        ArrayList<String> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(line);

        }
        br.close();
        Scanner sc = new Scanner(System.in);
        String IP = sc.nextLine();
        boolean flag = true;
        for (String ip : list) {
            if (ip.equals(IP)) {
                flag = false;
                System.out.println("该IP地址可以访问网络");
            }
        }
        if (flag) {
            System.out.println("该IP地址不允许访问网络");
        }
    }

}
