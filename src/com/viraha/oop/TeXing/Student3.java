package com.viraha.oop.TeXing;
//Student3 继承了 Person3
public class Student3 extends Person3{

    @Override
    public void run() {
        System.out.println("runrunrun");//子类重写父类
    }

    public void eat(){
        System.out.println("eating!");
    }
}

