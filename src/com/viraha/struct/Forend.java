package com.viraha.struct;

public class Forend {
    public static void main(String[] args) {
        int a[]={10,20,30};
        for (int x:a){//加强型for循环
            System.out.println(x);
        }
        System.out.println("=====================");
        for (int i = 0; i < 3; i++) {
            System.out.println(a[i]);
        }
    }
}
