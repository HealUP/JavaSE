package com.viraha.oop.Neibul;
/*成员内部类演示*/

//首先定义一个外部类
class Outer{
    private int id = 24;
    void test01(){
        System.out.println("外部类成员方法！");
    }

//定义一个内部类，即：类中类
class Inner{
        int n = 2;
        void show01(){
            //内部类的方法中,访问外部类的成员变量
            System.out.println(id);
        }
        void show02(){

        }
}
//内部类在外部类中使用，访问成员内部类的成员变量
    void test02(){
        Inner inner = new Inner();//或者 Outer outer = new Outer(); Outer.Inner inner = outer.new Inner();
        System.out.println("内部成员变量"+inner.n);
    }
}

public class Application {
    public static void main(String[] args) {
        //外部类访问内部类，要通过外部类创建内部类对象，
        Outer.Inner inner = new Outer().new Inner();
        //分别访问内部类的成员以及方法
        System.out.println(inner.n);
        inner.show01();
    }
}
