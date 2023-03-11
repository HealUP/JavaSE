package com.viraha.oop.Yichang;

public class ZdyYiChang extends Exception{


//    自己定义的异常继承exception 就是自定义异常了
//    传递数字>10
    private int  detail;
//构造器
    public ZdyYiChang(int a) {
       this.detail=a;
    }

    @Override
//   重写tostring 这个打印方法
    public String toString() {
        return "ZdyYiChang{"  + detail +
                '}';
    }
}
