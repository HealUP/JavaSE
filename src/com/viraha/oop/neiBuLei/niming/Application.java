package com.viraha.oop.neiBuLei.niming;


//�����ڲ���
public class Application {
    public static void main(String[] args) {
        studentEat(new Apple(){
            @Override
            public void eat() {
                System.out.println("eat apple��");
            }
        });
    }

    public static void studentEat(Apple apple) {
        apple.eat();
    }
}
