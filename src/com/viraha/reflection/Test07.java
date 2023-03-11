package com.viraha.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//ͨ�������������Ϣ
/*1����ȡ������Ͱ���
* 2����ȡ�������
* 3�����ָ�����Ե�ֵ
* 4�������ķ���
* 5��������ָ���ķ���
* 6����ȡ��Ĺ�����getConstructors()��õ��Ǳ����    getDeclaredConstructors() ������� ��������Ĺ�����
* 7����ȡָ���Ĺ����� ���������*/
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //1����ȡ������Ͱ���
        Class c1 = Class.forName("com.viraha.reflection.User");//�Ȼ�ȡ��Class����
        User u = new User();
//        System.out.println(u.getClass().getSimpleName());//Ҳ����ͨ�����������Class���󣬽�����ȡ����
        System.out.println(c1.getName());//����
        System.out.println(c1.getSimpleName());//����
        System.out.println("-================-");
        //2 ��ȡ�������
//        Field[] fields = c1.getFields();//�õ��Ǹ�����  ��ȡ�������е�public����
        /*for (Field f:fields
             ) {
            System.out.println(f);
            
        }*/
        Field[] fields = c1.getDeclaredFields();//��ȡ�������е�����  ����˽��
        for (Field field:fields) {
            System.out.println(field);
        }
        System.out.println("==================");
        //3 ���ָ�����Ե�ֵ
        Field name = c1.getDeclaredField("name");//�������͵����Զ��ܻ�ȡ
        System.out.println(name);
        System.out.println("==================");
        //4 �����ķ���
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method me:declaredMethods
             ) {
            System.out.println("��ñ�������з���������˽�к͹����ģ�"+me);
        }

        System.out.println("==================");
        Method[] methods = c1.getMethods();
        for (Method method:methods){
            System.out.println("��ñ��༰�丸���ȫ��������"+method);
        }
        System.out.println("==================");
        //5��������ָ���ķ���
        Method method = c1.getMethod("getName",null);//���뷽����   �÷����Ĳ���
        Method method1 = c1.getMethod("setName", String.class);//���뷽����   �÷����Ĳ���
        System.out.println(method);
        System.out.println(method1);
//���������Ϊ�˱���÷��������صģ���������Ϳ������֣�
        System.out.println("==================");
        //6����ȡ��Ĺ�����getConstructors()��õ��Ǳ����    getDeclaredConstructors() ������� ��������Ĺ�����
        Constructor[] constructor = c1.getConstructors();//����ֵҲ��һ������  �����ָ���Ĺ��������ò���s���Ǹ�����getConstructor
        for (Constructor constructor1 : constructor) {
            System.out.println(constructor1);
        }
        System.out.println("==================");
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("**"+declaredConstructor);
        }

        System.out.println("==================");
        //��ȡָ���Ĺ����� ���������
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }

}
