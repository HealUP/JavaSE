package com.viraha.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//��̬��������ִ�з���
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //��ȡClass����
        Class c1 = Class.forName("com.viraha.reflection.User");
        //��1��ͨ�����䴴��һ������  �����ǵ������޲ι���
//        User user = (User) c1.newInstance();
//        System.out.println(user);
        //1.1 Ҳ����ͨ���вι���������һ������
        //��ͨ��Class�����ȡ�вι��������вι���������newInstance�������������
       /* System.out.println("==============");
        Constructor Constructor = c1.getDeclaredConstructor(String.class, int.class,int.class);
        User user3 = (User)Constructor.newInstance("hao",20,22);
        System.out.println(user3);*/

//        System.out.println("==============");


        //2��ͨ��������÷���
        User user = (User) c1.newInstance();
        //��ͨ�������ȡһ���������Ȼ�ȡClass����c1 ��һ�����ˣ������ͨ��c1.getDeclaredMethod(����)��ȡ����
         Method setNameMethod = c1.getDeclaredMethod("setName", String.class);//����ΪsetName() Method����
         setNameMethod.invoke(user,"deng") ;//��user��������setName��������һ��String���͵Ĳ���
        //��ӡ����user3�����֣�ͨ��getName
        System.out.println(user.getName());

        //3��ͨ�������������
        System.out.println("=====================");
        Field field = c1.getDeclaredField("name");//�Ȼ�ȡһ���ض������ԣ���������������˽�е� ����Ҫ��getDeclaredField��������ȡ����Ȼ����.NoSuchFieldException: nameû���ҵ�������

        field.setAccessible(true);//����ֱ�Ӳ���˽�����ԣ���Ҫ�رհ�ȫ��� ��˽������Ҳ���Է���
        field.set(user,"zhi");//�����user��������Ը�ֵ

        System.out.println(user.getName());
    }


    //����ֱ�Ӳ���˽�����ԣ���Ҫ�رհ�ȫ��� ��˽������Ҳ���Է���
    /*���У�Method Field Constructor ���� setAccessible()����  setAccessible()���������ǣ������ͽ�ֹ���ʰ�ȫ��� Ĭ���Ǵ򿪵� Ϊ false �ر�Ҫ����Ϊtrue*/
}
