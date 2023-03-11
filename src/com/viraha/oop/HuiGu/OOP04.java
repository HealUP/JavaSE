package com.viraha.oop.HuiGu;

public class OOP04 {
    public static void main(String[] args) {
        Person a = new Person();   //类的实例化
        System.out.println(a.name);//空的 null
        change(a);//a是实参  且是Person 类型的
        System.out.println(a.name);//加油
//引用传递
//        本质还是值传递


    }
    public static void change(Person person){
        person.name="加油！";
    }

}
//    创建一个Person类，有一个name属性
    class Person{
        String name;//目前还没赋值，所以是空的

    }

