package com.Heimajinjie.Jihe.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
//����ֻ�ܴ洢���󣬶�������Ͳ�һ�¡�����洢ͬһ���͵�Ԫ�أ����Դ洢�����������͡�
//������϶�ʱ��ʹ�ü��ϴ洢���������У�
//���õ���������Collection�е�����Ԫ��
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");

        Iterator iterator = list.iterator();//��ȡ����������
        while(iterator.hasNext()){//�ж�ArrayList�Ƿ������һ��Ԫ��
            Object obj = iterator.next();//ȡ��
            System.out.println(obj);
        }

    }
}
