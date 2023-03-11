package com.viraha.struct;


public class SwitchCase {
    public static void main(String[] args) {

        char grade='C';

       //case 穿透  switch 匹配一个值
        switch (grade){
            case 'A':
                System.out.println("优秀！");break;
            case'B':
                System.out.println("良好！");break;

            case'C':
                System.out.println("及格！");break;
            default:
                System.out.println("未知等级！");
        }
    }
}
//看源码  class 文件