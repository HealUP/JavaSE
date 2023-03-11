package com.viraha.operator;

public class Demo5WYS {
    public static void main(String[] args) {
        /*
        A=0011 1100
        B=0000 1101
        ----------------
        A&B=0000 1100  一假则假，全真则真
        A|B=0011 1101  一真则真  全假则假
        A^B=0011 0001 相同是0，不相同时是1
         ~B=1111 0010  取反操作

         <<  *2
         >> /2
        */
        System.out.println(2<<3);//00000100
    }
}
