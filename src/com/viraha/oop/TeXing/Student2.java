package com.viraha.oop.TeXing;

public class Student2 extends  Person2 {

    public Student2() {
//      此处隐藏代码 默认调用父类无参构造
        super();
//        调用父类必须在子类构造的第一行

        System.out.println("子类无参");


    }

    private String name="饼";//私有
    //方法
    public void print() {
        System.out.println("Student");

    }

    public void test1(){
        print();//当前类的
        this.print();//student 类中的print()
        super.print();
    }

    public void test(String name){
        System.out.println(name);//测试类中传递的name
        System.out.println(this.name);//该类的name
        System.out.println(super.name);//父类的name
    }
}
