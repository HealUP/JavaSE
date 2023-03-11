package com.viraha.oop.Duotai;

public class Person {
    public void run(){
        System.out.println("run");
    }
}
/*多态注意事项：
1、多态是方法的多态，属性没有多态
2、父类和子类，有联系
3、存在条件：继承关系，子类需要重写方法，父类引用指向子类对象
不能重写的方法有：
1.static 方法，属于类，不属于实例
2.final 常量
3.private 私有
即：
Person s1 = new Student()
父类  引用 指向 子类对象
* */