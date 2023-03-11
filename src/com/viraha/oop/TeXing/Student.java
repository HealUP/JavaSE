package com.viraha.oop.TeXing;
//三大特性  1、封装
public class Student {
//  一、  属性私有
    private String name;//名字
    private int id;//学号
    private  char  sex;//性别
// 二、   提供一些可以直接操作这个属性的方法！！
//    提供一些public 的 get set 方法
//    get 获取这个数据

    public String getName() {
        return name;
    }
//给这个数据设置值
    public void setName(String name) {
        this.name = name;//this.name,Student这个类下的属性name
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
}
/*  测试
 public static void main(String[] args) {
        Student s1= new Student();

        s1.setName("鱼形饼干");
        System.out.println(s1.getName());
        s1.setSex('M');//char 类型要单引号引起来
        System.out.println(s1.getSex());
        s1.getSex();
        s1.setId(2021);
        System.out.println(s1.getId());



    }*/