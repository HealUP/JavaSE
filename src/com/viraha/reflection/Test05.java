package com.viraha.reflection;
//类什么时候被初始化

/*
* 1.主动引用  创建一个对象
* 2.反射也会产生主动引用
* 3.访问一个静态域，真正声明该域的类会被初始化
* =======不会产生引用的方法=====
* 1.调用父类静态属性或方法，子类Son未被加载
* 2.通过数组定义类引用，不会发生此类的初始化
* 3.调用常量池*/
public class Test05 {
    static {
        System.out.println("main类被加载");
    }

    public static void main(String[] args) throws ClassNotFoundException {
       // Son son = new Son();//主动引用  创建一个对象

        //反射也会产生主动引用
        // Class.forName("com.viraha.reflection.Son");

        //不会产生引用的方法
        //调用父类静态属性或方法，子类Son未被加载
//        System.out.println(Father.b);

        //数组
//        Son [] array = new Son[6];//只加载main类
       //调用常量池
//       System.out.println(Son.M);
        System.out.println(Son.b);
    }


}

class Father {
    static int b = 2;
    static  {
        System.out.println("父类被加载");
    }
}

class Son extends Father{
    static {
        System.out.println("子类被加载");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}