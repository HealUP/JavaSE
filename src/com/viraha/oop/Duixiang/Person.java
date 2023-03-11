package com.viraha.oop.Duixiang;

public class Person {

    String name;
    int age;
/*可以到out文件夹下看.java文件编译成的.class源文件  从里面可以看到
 即使
    一个类什么也不写，他也会存在一个方法，叫做构造方法
    构造方法的定义：
    1、必须和类的名字相同
    2、没有返回值类型、

其实，
 1、构造器的作用就是初始化实例的值
 2、使用new关键字，本质是在调用构造器

*/


    //    显示的定义一个构造器  无参构造  空
    public Person() {
    }


//有参构造器
    public Person(String name) {
        this.name = name;
    }
//添加了年龄属性后  构造器初始化age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
/*以下是测试类
  public static void main(String[] args) {
//使用new关键字实例化一个对象
        Person person = new Person("加油努力",22);
        System.out.println(person.name);
        System.out.println(person.age);
    }
* */