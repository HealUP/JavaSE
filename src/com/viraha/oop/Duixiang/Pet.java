package com.viraha.oop.Duixiang;

public class Pet {
    public String  name;
    public int age;
//    无参构造 new就相当于调用了这里的构造器  进行对dog的初始化

//    定义一个shout()方法
    public void shout(){
        System.out.println("汪汪汪！！！");
    }
}
/*  测试实例
*  public static void main(String[] args) {
//        new一个对象
        Pet dog = new Pet();
        Pet cat = new Pet();
        dog.name="丢丢";
        dog.age=6;


        cat.name="花花";
        cat.age=5;

//        调用shout方法
        dog.shout();
        System.out.println("我叫"+dog.name);
        System.out.println(dog.age+"岁了！");
        System.out.println("我叫"+cat.name);
        System.out.println(cat.age+"岁了！");

    }*/