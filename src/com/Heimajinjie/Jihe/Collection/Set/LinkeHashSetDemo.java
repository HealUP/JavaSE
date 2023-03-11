package com.Heimajinjie.Jihe.Collection.Set;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//仍是无序的 使用链表，维护元素的插入顺序，确保遍历时，是按照添加的顺序遍历的！ 但是存储还是无序的，底层存储的无序性，
public class LinkeHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Student student1 = new Student("张三","32");
        Student student2 = new Student("李三","31");
        Student student3 = new Student("赵三","33");
        Student student4 = new Student("赵三","33");

        linkedHashSet.add(student2);
        linkedHashSet .add(student3);
        linkedHashSet.add(student4);
        linkedHashSet.add(student1);
       //遍历
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
}
