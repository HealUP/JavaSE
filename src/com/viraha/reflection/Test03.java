package com.viraha.reflection;

import java.lang.annotation.ElementType;

//�������͵�Class
public class Test03 {
    public static void main(String[] args) {
        Class c1 = Object.class;//��
        Class c2 = String[].class;//һά����
        Class c3 = Class.class;//��
        Class c4 = int[][].class;//��ά����
        Class c5 = ElementType.class;//ö��
        Class c6 = Override.class;//ע��
        Class c7 = void.class;//��
        Class c8 = Comparable.class;//�ӿ�
        Class c9 = Integer.class;//������������

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c8);
        System.out.println(c9);

        //����������ͬ�����飬ֻҪԪ��������һ���ģ�����ͬһ��Class
        int a [] = new  int [100];
        int b [] = new  int [10];
        System.out.println(a.getClass().hashCode());
        System.out.println(b.getClass().hashCode());

    }
}
