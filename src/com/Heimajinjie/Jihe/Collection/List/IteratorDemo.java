package com.Heimajinjie.Jihe.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
//集合只能存储对象，对象的类型不一致。数组存储同一类型的元素，可以存储基本数据类型。
//当对象较多时，使用集合存储（开发当中）
//采用迭代器遍历Collection中的所有元素
public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("Hello");
        list.add("world");

        Iterator iterator = list.iterator();//获取迭代器对象
        while(iterator.hasNext()){//判断ArrayList是否存在下一个元素
            Object obj = iterator.next();//取出
            System.out.println(obj);
        }

    }
}
