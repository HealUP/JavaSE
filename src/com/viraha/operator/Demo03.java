package com.viraha.operator;

public class Demo03 {
    public static void main(String[] args) {
        //自增，自减 ++  -- 一元运算符
int a=2;
int b=a++;
int c=++a;
        System.out.println(b);//此时，b输出的是2.  先给b 赋值，再自增a=a+1
        System.out.println(a);//a已经自增1了
        System.out.println(c);//a=a+1先自增，再赋值


        //很多运算，都可以使用一些工具类来操作,比如Math类，很多数学运算的类
        double pow=Math.pow(4,2);//幂运算  4为底，2为指数
        System.out.println(pow);
    }
}