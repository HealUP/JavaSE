package com.viraha.Meathors;

public class M04DiGui {
    public static void main(String[] args) {
        System.out.println(f(2));
    }
    public static int f(int n){
        if (n==1){
            return  1;
        }
        else {
            return n *f(n-1);
        }
    }

}
//边界条件：边界
//前阶段：
//返回阶段n*(n-1）

//栈机制  递归  内存崩溃 溢出