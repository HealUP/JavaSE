package com.viraha.Annottation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//�Զ���ע��
public class Testannottation {//ע�������ʾ���ƣ����û�У��ͱ�������Ĭ��ֵ
    @MyAnnotation()//��������Ĭ��ֵ,�Ϳ��Բ�����д�����ֵ  ���� ��Ҫ���

    public void test(){

    }
    @MyAnnotation2("")
    public void test1(){

    }
//Ԫע��������ע��
    @Target({ElementType.TYPE,ElementType.METHOD})
    @Retention(RetentionPolicy.RUNTIME)
    @interface MyAnnotation{
       // String name();//ע��Ĳ��� : �������� + ������()
        String name() default "";

    }

    @interface MyAnnotation2{
        String value();//Ĭ��ֵ��value()
    }
}
