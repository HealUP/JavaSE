package com.viraha.struct;

public class JiuJiuChengFa {
    public static void main(String[] args) {

        for (int j=1; j <= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j+ "*" + i+ "=" + (j* i)+"\t");
            }
            System.out.println();
        }
    }
}

//1、首先打印第一列2、再用外循环包起来，打印就次，9列 3、去掉重复的i<=j;4、调整样式      一行一行的输出，空格隔开，换行
