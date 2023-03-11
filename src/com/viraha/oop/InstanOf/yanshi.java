package com.viraha.oop.InstanOf;
//定义抽象类 含一个抽象方法 没写abstract是因为 省略了
class A {
    public void shout(){
     //不写方法体，就是抽象方法，子类继承后重写该方法！
    }
}
class B extends A{
    public void shout(){
        System.out.println("gou wanggwangwang!");
    }
    public void eat(){
        System.out.println("gou chigutou!");
    }
}

//测试  instanceof 判断一个对象是否是类或者接口的实例，是返回True,不是返回False
public class yanshi {
    public static void main(String[] args) {
        //多态 向上转型
        //B B1 = new B();   A a1 = B1
        A a1 = new B();
        //向下转型
        B b2 = (B)a1;
        A a3 = new A();
        System.out.println("A a1 = new B():"+(a1 instanceof A));
        System.out.println("A a1 = new B():"+(a1 instanceof B));
        System.out.println("B b2 = (B)a1:"+(b2 instanceof A));
        System.out.println("B b2 = (B)a1:"+(b2 instanceof B));
        System.out.println("B b2 = (B)a1:"+(a3 instanceof B));//
/*子类转化为父类，可能丢失一些方法
* 1、父类引用指向子类对象
* 2、子类转化为父类，自动转 Person s1 = new Student() s1现在是父类的
* 3、父类转化为子类，强制转 Student s2 = (Student)s1
* 4、方便方法的调用，减少重复的代码，简洁。*/


    }
}
