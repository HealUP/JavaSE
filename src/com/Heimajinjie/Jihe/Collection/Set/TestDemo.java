package com.Heimajinjie.Jihe.Collection.Set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//测试类  已经设置按照定制的名字属性来排序了
public class TestDemo {
    public static void main(String[] args) {
        //自然排序，employee实现Comparable接口
            //创建对象
            Employee employee1 = new Employee("DENG",24,new MyDate(9,24,1999));
            Employee employee2 = new Employee("DENG",23,new MyDate(8,24,1996));
            Employee employee3 = new Employee("xuan",22,new MyDate(7,26,1998));
            Employee employee4 = new Employee("hao",21,new MyDate(6,23,2000));

            //放入集合  Employee要实现Comparable接口
            TreeSet treeSet = new TreeSet();
            treeSet.add(employee1);
            treeSet.add(employee2);
            treeSet.add(employee3);
            treeSet.add(employee4);
            //遍历
            Iterator iterator = treeSet.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
    }
    }
}
