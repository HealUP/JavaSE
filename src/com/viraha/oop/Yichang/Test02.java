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
        System.out.println("ʹ����try-catch �����쳣�����򻹿����������С���" +
                "throw�����׳��쳣��һ���ڷ�����ʹ��");
     
    }


//�ڷ�����������÷����п��ܷ������쳣
    public void test2(int a, int b) throws ArithmeticException{
        if (b == 0) {
            throw new ArithmeticException();//�����׳��쳣,һ���ڷ�����ʹ��
        }

    }

}