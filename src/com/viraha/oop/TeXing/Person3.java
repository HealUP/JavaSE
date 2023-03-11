package com.viraha.oop.TeXing;

public class Person3 {
public void run(){
    System.out.println("runing!");
}
}
//测试类//   一个对象的实际类型是确定的
////    new Student()
////    new Person()
////    可以指向的引用类型就不确定了：父类的引用指向子类
//public static void main(String[] args) {
////子类指向的引用和父类指向的引用是不一样的！
////   对象能执行哪些方法，主要看左边的类型
//    Student3 s1 = new Student3();//子类指向的引用
////    父类型，可以指向子类，但是不能调用子类的方法
//    Person3 s2=new Student3();//父类指向的引用
//    Object s3=new Student3();//object祖宗类
//
//    s1.run();//Student3 能调用的方法只能是自己的或者继承父类的！！
//s1.eat();
//    ((Student3)s2).eat();//s2强制转换成Student3类型
//}