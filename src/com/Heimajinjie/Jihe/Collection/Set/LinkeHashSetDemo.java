package com.Heimajinjie.Jihe.Collection.Set;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//��������� ʹ������ά��Ԫ�صĲ���˳��ȷ������ʱ���ǰ�����ӵ�˳������ģ� ���Ǵ洢��������ģ��ײ�洢�������ԣ�
public class LinkeHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Student student1 = new Student("����","32");
        Student student2 = new Student("����","31");
        Student student3 = new Student("����","33");
        Student student4 = new Student("����","33");

        linkedHashSet.add(student2);
        linkedHashSet .add(student3);
        linkedHashSet.add(student4);
        linkedHashSet.add(student1);
       //����
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
