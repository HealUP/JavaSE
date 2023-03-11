package com.viraha.oop.Duixiang;


//    学生类   这是一个但单纯的类  一个程序只有一个主启动类
public class Student {
        //属性： 字段
        String name;
        int age;


//        方法
          public void Study(){
              System.out.println(this.name+"在学习");
        }

}

//以下是测试类

/*public class Application {
    public static void main(String[] args) {
//        类：是抽象的，实例化
//        类实例化后返回一个自己的对象
//        student对象就是Student类的一个具体实例！！
//       在这里，xiaohua和xiaohong都是Student 类的1个具体实例



        Student xiaohua =new Student();
        Student xiaohong=new Student();
//     给实例化的对象赋值
        xiaohua.name="小华" ;
        xiaohua.age=21;
        xiaohong.name="小红";
        xiaohong.age=22;
        System.out.println(xiaohua.name);
        System.out.println(xiaohua.age);
        System.out.println(xiaohong.name);
        System.out.println((xiaohong.age));
    }
}

*/