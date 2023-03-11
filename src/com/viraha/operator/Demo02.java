package com.viraha.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a=23435434L;
        int b=234;
        short d=8;
        System.out.println(a+b);//long
        System.out.println(a+b+d);//long
        System.out.println(a+d);//long
        System.out.println(b+d);//int   有long就是long型，无long 有int就是int
    }
}
