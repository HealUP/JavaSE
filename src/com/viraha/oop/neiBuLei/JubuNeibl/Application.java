package com.viraha.oop.neiBuLei.JubuNeibl;
/*局部内部类（也称方法内部类）演示*/
//首先定义一个外部类
class Outer{
    int m = 2;//外部类的成员变量
    void test01(){
        System.out.println("外部类的成员方法！");
    }
    void test02(){
        //定义局部内部类
        class Inner{
            int n = 1;
            void show(){
                //在局部内部类的 方法中 访问外部类的成员变量、成员方法
                System.out.println("外部类的成员变量m="+m);
                test01();
            }
        }
        //那么，如何访问局部内部类中的方法和成员变量呢？要在所属test02（本方法）方法中访问
        Inner inner = new Inner();
        System.out.println("局部内部类的成员变量："+inner.n);
        inner.show();
    }
}

public class Application {
    public static void main(String[] args) {
        //通过创建外部类对象，逐层访问局部内部类方法、变量 以及访问外部类的方法和变量
        Outer outer = new Outer();
        outer.test02();
    }
}
