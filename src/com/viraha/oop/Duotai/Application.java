package com.viraha.oop.Duotai;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        //父类的引用指向子类的对象 student类是继承person类的（学生是学生没错，退一步可以是人）
        Person s2 = new Student();
        //对象能执行哪些方法，主要看的是对象左边的类型，和右边关系不大！
        s1.eat();
        s1.run();//子类重写了父类的方法，执行的是子类的方法
        s2.run();
       // s2.eat() 爆红;//父类型，可以指向子类，但是不能调用子类独有的方法。
        ((Student)s2).eat();
    }
}
