package com.viraha.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

//ͨ�������ȡ����
/*
* 1����ȡ�����ķ�����Ϣ �Ȼ�ȡClass������ͨ�����䣬getMethod()�����������ȡָ���ķ�����Method���գ���ͨ���÷�����getGenericParameterTypes()��ȡ���ͣ�
* ���ж��Ƿ���һ���ṹ���������ͣ�ParameterizedType����ǿתΪParameterizedType�����ͨ��getActualTypeArguments()��ȡʵ�ʵķ���
* 2��test02��ʾ���ǣ���ȡ�����ķ�����Ϣ �Ȼ�ȡClass������ͨ�����䣬getMethod()�����������ȡָ���ķ�����Method���գ����ڸ÷����ķ���ֵ���з���
* ������ͨ���÷�����getGenericReturnType()��ȡ���ͣ����ж��Ƿ���һ���ṹ���������ͣ�ParameterizedType����ǿתΪParameterizedType�����ͨ��getActualTypeArguments()��ȡʵ�ʵķ���
* */
public class Test10 {
    //test01
    public void test01(Map<String,User> map,List<User> list){
        System.out.println("test01");

    }
    //test02 Map<String ,User>
    public Map<String ,User> test02(){
        System.out.println("test02");
        return null;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        //��ȡ��Ķ����ٻ�ȡ��ķ��������緽��test01
        Method me = Test10.class.getMethod("test01", Map.class, List.class);
        Type[] genericParameterTypes = me.getGenericParameterTypes();//��ȡ���� ��Map,��List
        for (Type genericParameterType : genericParameterTypes) {
            System.out.println("=="+genericParameterType
            );
            if(genericParameterType instanceof ParameterizedType){//�ж��Ƿ���һ���ṹ�����������أ��ǵĻ�����ǿת�������ټ��������ʵ�Ĳ�������  �������
                //ǿת
                Type[] actualTypeArguments = ((ParameterizedType) genericParameterType).getActualTypeArguments();
                for (Type actualTypeArgument : actualTypeArguments) {
                    System.out.println(actualTypeArgument
                    );
                }
            }
        }

        System.out.println("======================");
        //ͨ�������ȡ���� ��ȡ����test02��
        me  = Test10.class.getMethod("test02",null);
        Type genericReturnType = me.getGenericReturnType();//����ֵ�Ƿ��� ��ֻ��һ��������ֻ�����ͽ��գ���������
        if (genericReturnType instanceof ParameterizedType){
            Type[] actualTypeArguments = ((ParameterizedType) genericReturnType).getActualTypeArguments();//List����ķ������������� �����������
            for (Type actualTypeArgument : actualTypeArguments) {
                System.out.println(actualTypeArgument);
            }
        }


    }
}
