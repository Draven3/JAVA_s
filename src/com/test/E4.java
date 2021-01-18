package com.test;

public class E4 {

        public static void main(String[] args) {
            int scoreLimit = 451;
            int score = 369;
            String result = score >= scoreLimit ? "通过一本录取分数线" : "未通过一本录取分数线";
            System.out.println("您的高考总分: " + score);
            System.out.println("第一批本科录取分数线:" + scoreLimit);
            System.out.println("高考结果：" + result);
        }
    }

