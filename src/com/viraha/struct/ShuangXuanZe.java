package com.viraha.struct;

import java.util.Scanner;

public class ShuangXuanZe {
    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        if (score>60){
            System.out.println("分数及格！！");
        }
        else {
            System.out.println("分数不及格！！");
        }
        scanner.close();
    }
}
