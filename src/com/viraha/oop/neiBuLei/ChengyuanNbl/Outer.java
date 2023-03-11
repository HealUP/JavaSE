package com.viraha.oop.neiBuLei.ChengyuanNbl;
//外部类
public class Outer {
//    属性私有
    private int id=100;
    public void out(){
        System.out.println("这是内部类的方法！");

    }
//    内部类
    public class Inner{
        public void In(){
            System.out.println("这是内部类的方法！");
        }
//        内部类可以获得外部类的私有属性！
    public void getId(){
        System.out.println(id);
    }

}

}
//一个Java类中，可以有多个class类，但只能有一个public class
//局部内部类

//匿名内部类  不用把实例保存在变量中