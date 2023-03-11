package com.viraha.Meathors;

public class M03 {
    public static void main(String[] args) {
        //调用可变参数的方法
        printMax(12,23,454,6,7,7,5);
        printMax(new double[]{1,34,5,6});
    }


    //方法
    public static void printMax(double... numbers){
        if (numbers.length==0){
            System.out.println("no argument");
            return;
        }
        double result=numbers[0];

        //排序
        for (int  i = 0;  i < numbers.length;  i++) {
            if (numbers[i]>result){
                result=numbers[i];

            }
        }
        System.out.println("Max is :"+result);
    }
}
