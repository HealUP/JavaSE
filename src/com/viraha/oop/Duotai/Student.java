package com.viraha.oop.Duotai;

public class Student extends Person{
    @Override
    public void run() {
        System.out.println("RUN! ");
    }
    //子类独有的方法 eat()
    public void eat(){
        System.out.println("eat");
    }
}
