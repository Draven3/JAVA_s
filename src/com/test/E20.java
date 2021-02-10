package com.test;
import java.io.File;
import java.util.Scanner;
/*
    编写一个命令行程序，从命令行输入一个本机地址（也就是本机一个目录的地址），之后程序根据该地址，遍历目录中的所有文件，并将文件名输出到命令行。
    示例：
    输入内容：D://工作/项目A文件
    输出内容：目录【D://工作/项目A文件】中有以下文件：
    xxxxxx.docx
    xxxxxx.xlsx
    xxxxxx.pdf
 */
public class E20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        File file = new File(str);
        File[] fileArray = file.listFiles();
        if (fileArray != null) {
            for (File file1 : fileArray) {
                System.out.println(file1.getAbsolutePath());

            }
        }
    }
}
