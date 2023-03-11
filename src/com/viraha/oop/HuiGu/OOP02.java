package com.viraha.oop.HuiGu;

/*静态方法   非静态方法*/
public class OOP02 {
    //main()方法
    public static void main(String[] args) {
//        Student01.sayStudent();//调用学生类里面的方法
//        对象类型   对象名字     对象值
        Student01 student01 = new Student01();
        student01.sayStudent();
    }



//    static 和类一起加载的就是说  static 后类就已经存在了
//    而没有static 修饰符的  类要进行实例化  就是new一个
}
