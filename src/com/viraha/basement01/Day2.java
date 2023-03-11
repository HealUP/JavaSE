package com.viraha.basement01;

/*类变量、实例变量、局部变量、常量*/
//day2是个类
public class Day2 {

    //类变量 加了static ,相当于C中的全局变量
    static double salary=15000;
    String name;
    int age;//两个实例变量,不赋予初始值


    //main 方法
    public static void main(String[] args) {
        //类变量，即C中的全局变量
//局部变量；必须声明和初始化值
        int a = 1, b = 2, c = 3;
        double pi = 3.14;
        char x = 'c';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(pi);
        System.out.println(x);
//实例变量，这样用，才能输出，而且自动初始化为0/0.0；
        Day2 day2 = new Day2();

        System.out.println(day2.age);
        System.out.println(day2.name);
        System.out.println(salary);
    }
    //其他方法例如 add（）方法,相当于自定义函数
    public void add(){

    }
}
//布尔值默认false,除了基本类型，其他的默认值都是null




