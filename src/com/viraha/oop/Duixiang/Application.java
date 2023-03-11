package com.viraha.oop.Duixiang;

//主启动类Application
//一个项目应该只存在一个main()方法


import com.viraha.oop.TeXing.Student1;

public class Application {

    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.say();
        student1.setMoney(1000_0000);//子类通过调用父类的set接口获得money
        System.out.println("i have"+student1.getMoney());//子类通过调用父类的get接口输出money
    }

    }

