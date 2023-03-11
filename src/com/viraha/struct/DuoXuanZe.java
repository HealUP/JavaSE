package com.viraha.struct;

import java.util.Scanner;

public class DuoXuanZe {
    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        if (score==100){
            System.out.println("恭喜满分！！");
        }else if (score<100&&score>=90){
            System.out.println("A");}
            else if (score<90&&score>=80){
            System.out.println("B");}
            else if (score<80&&score>=70){
            System.out.println("C");
            }
            else if (score<70&&score>=60){
            System.out.println("D");
        }
            else {
            System.out.println("不及格！！");
        }
            }
        }


