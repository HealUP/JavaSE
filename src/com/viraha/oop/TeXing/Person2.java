package com.viraha.oop.TeXing;

import javax.crypto.spec.PSource;

//父类
public class Person2 {
//   此处含构造器


    public Person2() {

        //      此处隐藏代码 默认调用父类无参构造
        super();
        //        调用父类必须在子类构造的第一行

        System.out.println("父类无参");
    }

    protected String name = "干";//protected,受保护的属性


//私有的无法被继承
//private void print(){
//    System.out.println("Person");
//}

    public void print() {
        System.out.println("Person");
    }
}

// 测试
//Student2 student2 = new Student2();
//        student2.test("鱼形");
//        student2.test1();