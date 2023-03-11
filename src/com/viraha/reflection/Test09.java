package com.viraha.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//���ܷ���
public class Test09 {
    public static void test01(){
        //��ͨ��ʽ����
        User user1 = new User();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user1.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("��ͨ��ʽִ��10�ڴ������ĵ�ʱ��:"+(endTime-startTime)+"ms");
    }

    //���䷽ʽ����
    public static void test02() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //��ͨ��ʽ����
        //��ȡClass����
        Class c1 = Class.forName("com.viraha.reflection.User");
        //ͨ�����䴴������   ֱ����ͨ��������ķ���Ҳ��
        User user = (User) c1.newInstance();
        Method getName = c1.getDeclaredMethod("getName",null);
        //����
        //���رհ�ȫ���
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("���䷽ʽ�����رհ�ȫ��⣩ִ��10�ڴ������ĵ�ʱ��:"+(endTime-startTime)+"ms");
    }

    //���䷽ʽ���� �رհ�ȫ���
    public static void test03() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //��ͨ��ʽ����
        //��ȡClass����
        Class c1 = Class.forName("com.viraha.reflection.User");
        //ͨ�����䴴������   ֱ����ͨ��������ķ���Ҳ��
        User user = (User) c1.newInstance();
        Method getName = c1.getDeclaredMethod("getName",null);
        getName.setAccessible(true);//�رհ�ȫ���
        // ����
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("���䷽ʽ�����رհ�ȫ��⣩ִ��10�ڴ������ĵ�ʱ��:"+(endTime-startTime)+"ms");
    }
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
