package com.viraha.oop.HuiGu;

public class OOP03 {
    public static void main(String[] args) {
//         形参  实参的区分
//        值传递
//        返回值为空
        int a=1;
        System.out.println(a);//a=1
      OOP03.change(a);//方法的调用
        System.out.println(a);
    }
    public static void change(int a){
        a=10;
    }






}
