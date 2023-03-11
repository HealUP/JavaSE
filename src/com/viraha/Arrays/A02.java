package com.viraha.Arrays;

public class A02 {
    public static void main(String[] args) {
        //静态初始化
        int []a={1,2,3,4};
        System.out.println(a[3]);

        //动态初始化：默认初始化，初始化为0
        int []b=new int[10];
        b[3]=45;
        System.out.println(b [3]);
        System.out.println(b [5]);
// 引用初始化


    }
}
