package com.viraha.Arrays;

import java.util.Arrays;

public class A08 {
    //    冒泡排序
//    比较数组中相邻的元素，每次比较产生一个最大或者最小的数字
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 544, 64, 65, 75, 34};
        int[] sort = sort(a);//调用
//        printArrays(a);
//        或者使用现成的Arrays类中的打印数组的方法
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序方法

    public static int[] sort(int[] a) {
        //临时变量
        int temp = 0;
//        外层循环，判断要走多少次
        for (int i = 0; i < a.length - 1; i++) {//10个数进行9次比较，长度为a.length则进行a.length-1次比较
//            内层循环，比较判断两个数，如果第一个数比第二个数大，则交换位置
            for (int j = 0; j < a.length - 1 - i; j++) {//每次循环都要减少i次
                if (a[j + 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        return a;
    }


    //      可以自己 编写打印同样格式的方法
    public static void printArrays(int[] b) {
        for (int i = 0; i < b.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == b.length - 1) {
                System.out.print(b[i] + "]");
            } else {
                System.out.print(b[i] + ", ");
            }
        }
        System.out.println();
    }
}
//优化此冒泡排序  定义一个布尔类型的变量  可以改为


    /*冒泡排序方法
    public static int[] sort(int[] ) {
        //临时变量
        int temp = 0;
       外层循环，判断要走多少次
       boolean flag=false;//通过flag标识减少没有意义的比较，比如顺序本来就是对的，就不用进行冒泡了
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j + 1] > a[j]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag=ture;
                }
                if(flag==false){
                    break;//如果是顺序对的，即当flag=false的时候，就跳出本次for 循环，没有必要比较了
            }
        }
        return a;
    }
}
*/
