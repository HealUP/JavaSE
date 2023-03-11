package com.viraha.Meathors;

public class M01 {
    public static void main(String[] args) {
int max=max(10,10);
        System.out.println(max);
    }

//比大小
     public static int max(int a1,int a2){
        int a=0;
       if (a1==a2){
           System.out.println("a1==a2");
           return 0;//终止方法
       }

        if(a1>a2){
           a=a1;
        }
        else {
           a=a2;
        }
        return a;

     }
}
