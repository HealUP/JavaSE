package com.viraha.Arrays;

import java.util.Arrays;

public class A06 {
    public static void main(String[] args) {
//        使用Arrays 类
        int[] b = {1, 2, 3, 45, 5};
        System.out.println(b);//输出一个对象[I@1b6d3586

        //打印数组元素  调用Araays类中的   toString 方法
//        System.out.println(Arrays.toString(b));//输出[1, 2, 3, 45, 5]
            printArrays(b );
    }

    //      可以自己 编写打印同样格式的方法
    public static void printArrays(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == b.length - 1) {
                System.out.print(b[i]+"]");
            } else {
                System.out.print(b[i]+",");
            }

        }
    }
}
