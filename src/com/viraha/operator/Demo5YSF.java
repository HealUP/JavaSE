package com.viraha.operator;

public class Demo5YSF {
    public static void main(String[] args) {
        int a=20;
        int b=23;
        a+=b;//a=a+b
        a-=b;//a=a-b
        // 字符串连接符  +， String    面试题
        System.out.println(""+a+b);//先转化成string类
        System.out.println(a+b+"");//先运算a+b,再打印空字符串


       // 三元运算符(条件运算符)
              //  x==true?y:z

        int score=50;
        String type=score<60?"不及格":"及格";
        System.out.println(type);
    }
}

