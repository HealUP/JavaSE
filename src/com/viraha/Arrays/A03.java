package com.viraha.Arrays;

public class A03 {
    public static void main(String[] args) {
        int []a={1,3,4,5,6,7,7};
//        计算所有元素的和
        int sum=0;
        for (int i = 0; i < a.length; i++) {
              //  sum+=a[i];
                     sum =sum +a[i];
        }
        System.out.println("sum="+sum);
//        查找最大元素
        int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                    max=a[i];
            }
        }
        System.out.println("最大值max="+max);
    }
}
