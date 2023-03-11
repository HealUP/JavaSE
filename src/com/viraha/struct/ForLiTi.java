package com.viraha.struct;

public class ForLiTi {
    public static void main(String[] args) {
        int oddsum = 0;//奇数
        int evensum = 0;//偶数
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddsum += i;

            } else {
                 evensum+=i;
            }
        }
        System.out.println("奇数的和:"+oddsum);
        System.out.println("偶数的和:"+evensum);
    }
}