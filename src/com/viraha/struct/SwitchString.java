package com.viraha.struct;

public class SwitchString {
    public static void main(String[] args) {
        String name="加油";
        //字符的本质还是数字，JDK7 新特性
        //反编译  java----class(字节码文件)----反编译（idea）
        switch (name){
            case "努力":
                System.out.println("努力");break;
            case"加油":
                System.out.println("加油");break;
            default:
                System.out.println("错误！！");

        }
    }
}
