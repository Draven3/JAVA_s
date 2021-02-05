package com.test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
/*
    编写一个命令行程序，分别使用LocalDate、LocalTime、LocalDateTime分别取得当前的日期、时间、日期及时间，并在命令行输出。
 */
public class E12 {
    public static void main(String[] args) {
        DateTimeFormatter dtf1 =DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        System.out.println(dtf1.format(localDate));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();
        System.out.println(dtf2.format(localTime));

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(dtf3.format(localDateTime));

    }
}
