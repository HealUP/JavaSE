package com.Heimajinjie.Jihe.Collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//������  �Ѿ����ð��ն��Ƶ�����������������
public class TestDemo {
    public static void main(String[] args) {
        //��Ȼ����employeeʵ��Comparable�ӿ�
            //��������
            Employee employee1 = new Employee("DENG",24,new MyDate(9,24,1999));
            Employee employee2 = new Employee("DENG",23,new MyDate(8,24,1996));
            Employee employee3 = new Employee("xuan",22,new MyDate(7,26,1998));
            Employee employee4 = new Employee("hao",21,new MyDate(6,23,2000));

            //���뼯��  EmployeeҪʵ��Comparable�ӿ�
            TreeSet treeSet = new TreeSet();
            treeSet.add(employee1);
            treeSet.add(employee2);
            treeSet.add(employee3);
            treeSet.add(employee4);
            //����
            Iterator iterator = treeSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
    }
    }
}
