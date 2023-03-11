package com.viraha.oop.TeXing;

public class A extends B{
   @Override//重写
    public  void test() {
        System.out.println("A=>test()");

    }
}
//测试public class Application {
//    public static void main(String[] args) {
//        A a = new A();
//        a.test();
////       子类重写了父类的方法
//        B b=new A();
//        b.test();
//    }