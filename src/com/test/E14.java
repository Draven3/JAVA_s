package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
    编写一个命令行程序，使用Calendar类中的相关方法，将时间2020年12月10日 10:30:00赋值给Calendar类的对象，
    之后使用SimpleDateFormat对其进行格式化（2020-12-10 10:30:00）后在命令行输出
 */
public class E14 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date data = sdf.parse("2020-12-10 10:30:00");
            calendar.setTime(data);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String timeStr = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
        System.out.println(timeStr);
    }
}


