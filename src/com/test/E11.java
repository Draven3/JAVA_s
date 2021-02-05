package com.test;
/*
    编写一个命令行程序，计算0到1000之间偶数的合计（包含1000），但不计算40和48两个数，
    且当合计大于等于25000时，停止计算。并按照以下格式将结果输出到命令行：
    0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为：XXX
 */
public class E11 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=0;i<=1000;i++){
            if (i%2==1 || i==40 || i==48){
                continue;
            }
            sum+=i;
            if (sum>=25000){
                break;
            }
        }
        System.out.println("0到1000之间(40 48跳过，大于等于25000跳出)偶数的和为：" + sum);
    }

}
