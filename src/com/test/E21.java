package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//编写一个命令行程序，从命令行输入一个字符串，之后程序做如下操作：
//        1. 判断输入字符串是否是一个正确的日期（正确的日期格式：YYYY-MM-DD或YYYY/MM/DD或YYYY年MM月DD日），
//        如果不是正确的日期，则在命令行输出"您输入的内容不是一个日期"，如果是一个正确的日期，则继续进行以下操作。
//        2. 根据输入的日期，判断这一天是这一年的第几天
//        注意：需要考虑日期所在年是否是闰年！
//        示例：
//        命令行输入：2019/01/05
//        命令行输出：2019/01/05是2019年第5天
public class E21 {
    public static void main(String[] args) {
        Date date =test.date();
        Calendar calendar =Calendar.getInstance();
        calendar.setTime(date);
        int Days =test.Days(calendar.get(calendar.YEAR),calendar.get(Calendar.MONDAY)+1,calendar.get(Calendar.DATE));
        System.out.println("此日期为当年的第"+Days+"天");

    }
}

class test {
    public static Date date() {
        Scanner scanner = new Scanner(System.in);
        Date date = null;

        DateFormat s = new SimpleDateFormat("yyyy/MM/dd");
        boolean b = true;
        while (b) {
            String str = scanner.next();
            try {
                s.setLenient(false);

                date = s.parse(str);
                b = false;
            } catch (Exception e) {
                System.out.println("输入错误，请重新输入：");
            }
        }
        return date;
    }

    public static int Days(int year, int month, int day) {
        int num = 0;
        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    num += 31;
                    break;
                case 2:
                    num += (year % 4 == 0 && year % 100!=0||year%400==0)?29:28;
                    break;
                default:
                    num+=30;
                    break;
            }
        }
        num+=day;
        return num;
    }
}
