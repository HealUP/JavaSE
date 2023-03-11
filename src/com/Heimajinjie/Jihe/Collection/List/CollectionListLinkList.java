package com.Heimajinjie.Jihe.Collection.List;

import java.util.LinkedList;
//增加、删除的速度很快，内部维护了一个双向循环链表
public class CollectionListLinkList {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("a");
        link.add("b");
        link.add("c");
        link.add("d");
        System.out.println(link.toString());//打印集合中的元素
        link.add(2,"bf");
        link.addFirst("first");//第一个位置插入
        System.out.println(link);
        System.out.println(link.getFirst());//取出第一个
        System.out.println(link);
        link.remove(2);//删除第3个
        link.removeFirst();//删除首个
        System.out.println(link);


    }
}
