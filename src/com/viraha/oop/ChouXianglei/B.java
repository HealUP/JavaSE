package com.viraha.oop.ChouXianglei;

public class B extends Test {
//    方法重写  B继承了Test类 是Test的子类   子类重写了方法实现
    @Override
    public void run() {
        System.out.println("在out文件中检查class文件是否含有构造器！！");
    }

//
    public static void main(String[] args) {
        B b = new B();
        b.run();
    }
}
//new了子类B的一个对象b,调用run()方法
