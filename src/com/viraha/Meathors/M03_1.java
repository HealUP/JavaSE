package com.viraha.Meathors;

public class M03_1 {
    public static void main(String[] args) {
        //每个类都有有一个对象，进而使用对象调用里面的方法
         M03_1 m03_1 = new M03_1();  //创建一个对象
        m03_1.test(3,4);//调用方法


    }


    //方法
    public void test (int...i){//本质就是数组i[]
        System.out.println(i[1]);
    }
}
