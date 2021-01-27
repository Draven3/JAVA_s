package com.test;

import java.util.HashMap;
import java.util.Scanner;

public class E9 {
    /*
    编写一个命令行程序，模拟一个用户登录操作：
    假设网站中已经注册的账户和密码如下：
    账户         密码
    admin      admin@123
    guess      123456
    my           my_666
    程序中用Map集合存储以上账户。
    从命令行输入账户和密码（分两次输入），
    请输入账号：XXXXXX
    请输入密码：XXXXXX
    在main函数中分别接收输入的账号和密码，之后判断输入的账号和密码是否在Map集合中，如果存在，则在命令行输出：登录成功。
    如果不存在，则在命令行输出：您输入的账号或密码不正确。
    示例：
    命令行输入：
    请输入账号：admin
    请输入密码：admin@123
    命令行输出：登录成功
    命令行输入：
    请输入账号：admin
    请输入密码：admin123
    命令行输出：您输入的账号或密码不正确
 */
    public static void main(String[] args) {
        HashMap<String,String> map =new HashMap<>();
        map.put("admin","admin@123");
        map.put("guess", "123456");
        map.put("my", "my_666");
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入账号：");
        String username =sc.nextLine();
        System.out.print("请输入密码：");
        String password = sc.nextLine();
        if(map.containsKey(username)){
            if (password.equals(map.get(username))){
                System.out.println("登陆成功");
            }else {
                System.out.println("您输入的账号或密码不正确");
            }
        }else {
            System.out.println("您输入的账号或密码不正确");
        }
    }

}
