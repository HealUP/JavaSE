package com.Heimajinjie.Jihe.Collection.Set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.TreeSet;

/*//
*TreeSet（难点）:只能添加同一个类的元素
* TreeSet有两种排序 方法：
* 1、实现Comparable接口，并重写compareTo() 自然排序法
* 2、实现Comparator接口，重写compare()方法和equals()方法 所有类默认继承 Object类，Object类中有equals方法，所以只需要重写compare()方法 定制排序
*
* ==================TreeSet之所以可以对添加的元素进行排序，是因为：实现Comparable接口，重写了compareTo()========================
* 1按照添加进集合的元素指定的顺序遍历：像String，包装类等默认按照从小到大的顺序遍历
* 2基本类型包装类，String类都实现了Comparable接口，该类强行对实现他的每个类的对象进行整体排序，称为类的自然排序，该接口的compareTo方法称为自然比较方法
* 3若将自定的类的对象存入TreeSet，其将不会对添加的元素进行排序，该类必须要实现Comparable接口，并重写compareTo()
* 4*/
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("2","A"));
        treeSet.add(new Person("22","C"));
        treeSet.add(new Person("23","B"));
        System.out.println(treeSet);

    }
}
//自定义类Person,实现Comparable接口，并重写compareTo()
class Person implements Comparable{
    private String id;
    private String name;

    //构造器
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //重写tostring()

    @Override
    public String toString() {
        return id + ":" + name;
    }

    //重写compareTo()
    @Override
    public int compareTo(Object o) {
        //return -1;//倒序存储
        //return 0;//只存入一个
        return 1;//正常存储
    }
}
