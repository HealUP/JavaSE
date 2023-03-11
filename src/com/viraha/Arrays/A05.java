package com.viraha.Arrays;

public class A05 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}};//初始化多维数组
        System.out.println(array[1][0]);
        System.out.println(array[1][1]);
        System.out.println("============================");
        for (int i = 0; i < array.length; i++) {//这个是行
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }

        }
    }
}