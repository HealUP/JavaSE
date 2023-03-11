package com.viraha.scanner;
import java.util.Scanner;
//scanner 进阶用法
public class TWO03 {
    public static void main(String [] args){
        //从键盘接收数据
        Scanner scanner =new Scanner(System.in);

        System.out.println("请输入数据：");
        //此处省略了if 的判断语句，scanner.hasNextLine
        String str=scanner.nextLine();//输入的是String类型 字符串
        System.out.println("输出的内容为："+str);
        scanner.close();
    }
}
