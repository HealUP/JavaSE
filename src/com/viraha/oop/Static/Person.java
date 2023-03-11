package com.viraha.oop.Static;
//静态导入包后面直接调用
import static java.lang.Math.random;

public class Person {

    {
//        匿名代码块  可以初始赋值
        System.out.println("匿名代码块！");
    }

    static {
//        静态代码块  跟类一起最先加载
        System.out.println("静态代码块");
    }

//    构造器  方法

    public Person() {
        System.out.println("构造方法！！");
    }


    public static void main(String[] args) {
        Person person1 = new Person();
//        静态、匿名、构造方法
        System.out.println("==============================");
        Person person2 = new Person();
//        static 静态代码块只加载一次  和类一起加载

        System.out.println("========测试静态导入包=========");
        System.out.println(random());//输出随机数
    }
}
//final 关键字     被修饰后就不能被继承 inherit 了  常量修饰符