package com.test;

import java.util.HashMap;
import java.util.ArrayList;

/*
    编写一个命令行程序，定义一个整型数组[2,8,6,2,7,3,9,2,8,6,7,9,1]
    该整型数组里除了两个数字之外，其他的数字都出现了多次，请写程序找出这两个只出现一次的数字，并在命令行输出。
    输出内容：
    只出现一次的数字是3和1
 */
public class E18 {
    public static void main(String[] args) {
        int[] arr ={2, 8, 6, 2, 7, 3, 9, 2, 8, 6, 7, 9, 1};
        HashMap<Integer,Integer>map =new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int num =arr[i];
            if (map.containsKey(num)){
                int n =map.get(num);
                n++;
                map.put(num, n);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> list = new ArrayList();
        for (int num : map.keySet()) {
            int n = map.get(num);
            if (n == 1) {
                list.add(num);
            }
        }
        System.out.print("只出现一次的数字是:");
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}

