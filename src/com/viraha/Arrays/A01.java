package com.viraha.Arrays;

import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //定义数组  首选方法
        int[] a = new int[5];//或者  int []a;声明一个数组     a=new int[5];创建一个数组
        //给数组元素中赋值
        System.out.println("请输入数据：");
        for (int i = 0; i < a.length; i++) {

            if (scanner.hasNextInt()) {
                a[i] = scanner.nextInt();//输入数据
            }
        }
        System.out.println("输出所有数组元素：");
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
        }


        }
}