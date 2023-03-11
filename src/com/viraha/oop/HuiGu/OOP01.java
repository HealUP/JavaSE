package com.viraha.oop.HuiGu;
//  oop就是一个类
public class OOP01 {
    //    main方法
    public static void main(String[] args) {

      String h=Hello();
       int c= max(3,5);
        System.out.println(h);
        System.out.println(c);
    }
        public static String Hello () {
            return "hello";
        }

        public static int max ( int a, int b){
            return a > b ? a : b;//三目运算符
        }
    }
//return 返回一个结果
//break 提出switch循环  结束循环