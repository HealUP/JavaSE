package com.Heimajinjie.Jihe.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //Iterator����Ԫ��
        Iterator it = list.iterator();
        while (it.hasNext()){//�жϸü����Ƿ�����һ��Ԫ��
            Object obj = it.next();//��ȡ�ü��ϵ�Ԫ��
            if ("d".equals(obj)){
                it.remove();

                //list.remove(obj);//���ʹ�õ�����Ԥ�ڵĵ������������ı䣬�׳��쳣��
                // 1.ʹ�õ����������ɾ������ it.remove() 2.ʹ��break����ѭ��
            }
        }
        System.out.println(list);
    }
}
