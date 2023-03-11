package com.viraha.struct;

public class For_2  {
    //for循环输出，1-1000之间能被5整除的数，并且每行输出3个
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");
                if (i%15==0){
                    System.out.println();
                }
            }
        }
    }
}
