package com.viraha.oop.neiBuLei.ChengyuanNbl;

public class Application {
    public static void main(String[] args) {
//        new一个对象
        Outer outer = new Outer();
//         通过这个外部类实例化内部类
//      调用内部类的方法
        Outer.Inner inner = outer.new Inner();
        inner.getId();

    }
}
