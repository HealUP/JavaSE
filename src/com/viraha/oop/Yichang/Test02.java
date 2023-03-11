package com.viraha.oop.Yichang;

public class Test02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            new Test02().test2(1, 0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("使用了try-catch 捕获异常，程序还可以往下运行。而" +
                "throw主动抛出异常，一般在方法中使用");
     
    }


//在方法主动向外该方法有可能发生的异常
    public void test2(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException();//主动抛出异常,一般在方法中使用
        }

    }

}