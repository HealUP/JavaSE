package com.viraha.scanner;

import java.util.Scanner;

public class TWO02 {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline()方式接收");
        //hasNextLine()判断是否含有输入
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println("输出的内容为：" + str);
        }
        scanner.close();
    }
}
