package com.Heimajinjie.JavaApi.baozhuanglei;

public class zhuanhuan {
    public static void main(String[] args) {
   /* 基本类型转换为 字符串*/
//        1、+ “” （工作中常用）
    int i = 100;

    String s1 = i+"200";
        System.out.println(s1);//输出的结果是拼接的字符串
//        2、使用包装类的tostring()方法
        String s2 = Integer.toString(100);
        System.out.println(s2+200);
//        3、使用String类的静态方法 valueOf()
        String s3 = String.valueOf(100);
        System.out.println(s3+200);

       /* 字符串转换为 基本类型*/
//        使用包装类的静态方法
        int i4 = Integer.parseInt(s1);//Integer类
        System.out.println(i4-70);
        String d1 = Double.toString(0.56);//先让double类型的数值转换为字符串
        double d = Double.parseDouble(d1);//Double 类
        System.out.println(d1+0.5);

    }
}
