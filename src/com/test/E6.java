package com.test;

public class E6 {
    /*
    请编写一个命令行程序，定义两个合适的数字类型，分别用于存储以下两个数据：
    世界人口：71亿
    中国人口：14亿
    并在命令行输出以下内容：
    2019年世界人口总数约：7100000000
    2019年中国人口总数约：1400000000
 */

    public static void main(String[] args) {
        long worldPopulation = (long) (71 * Math.pow(10, 8));
        long chinesePopulation = (long) (14 * Math.pow(10, 8));
        System.out.println("2019年世界人口总数约：" + worldPopulation);
        System.out.println("2019年中国人口总数约：" + chinesePopulation);
    }
}

