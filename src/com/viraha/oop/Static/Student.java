package com.viraha.oop.Static;

public class Student {
//    静态属性  静态属性可以类调用  多线程
//    非静态属性不可以类调用 用对象调用
//    静态方法  可以直接调用
//    非静态方法要new一个对象才能调用
    private static int  age;//属性私有且 静态

    private double score;//属性私有 非静态

    public Student() {
        Student.age=5;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.age);
        System.out.println(s1.score);

    }
}
