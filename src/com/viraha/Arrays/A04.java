package com.viraha.Arrays;

public class A04 {
    public static void main(String[] args) {
//        增强型for循环
        int[] a = {1, 23, 4, 5, 4, 3, 2, 4, 4, 2};
//        for (int b:a) {
//            System.out.println(b);
        printArray(a);//调用打印数组

        System.out.println("===================================");
        int []reverse=reverse(a);//调用反转数组的得到的新的数组赋给 数组  reserve

        System.out.println("得到反转数组：");
        printArray(reverse);//打印数组reverse
    }





//    反转数组
    public static int [] reverse(int []a){
        int []result =new int [a.length];//新建数组的长度就是被反转数组的长度
        for (int i = 0,j=a.length-1; i < a.length; i++,j--) {//a.length 的长度就是数组元素的个数，假如是10个，a.lehgth就是10,由于是从0开始的，
                                                    // 所以遍历时  i< a.length-1,   这里j=9 一直自减到等于0  数组下标从0开始的
            result[ j]=a[i];
        }
        return result;//返回值是数组
    }

    //}
    //打印数组
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}