package com.Heimajinjie.Jihe.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set:���� ���洢��λ�����򣬲��������ģ�����������ظ� ��list�෴ set�ӿ�Ҳ�̳�Colletion�ӿڣ��������䳣�õķ���
//HashSet����Ҫʵ���ࣩ,LinkedHashSet,TreeSet
public class SetDemo {
    public static void main(String[] args) {
        //��̬ add()
        Set set = new HashSet();
        set.add(1234);
        set.add(56);
        set.add(78);
        set.add("aaa");
        set.add(null);//��������ֵ
        System.out.println(set.size());//����
        System.out.println(set);//Ԫ��
        Iterator iterator = set.iterator();//��ȡSet��iterator����
        while (iterator.hasNext()){
            Object obj = iterator.next();//�����Ԫ�ش洢��obj
            System.out.println(obj);//��ȡ
        }
    }
}
