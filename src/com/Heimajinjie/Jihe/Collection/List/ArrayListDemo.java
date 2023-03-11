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
        //Iterator遍历元素
        Iterator it = list.iterator();
        while (it.hasNext()){//判断该集合是否有下一个元素
            Object obj = it.next();//获取该集合的元素
            if ("d".equals(obj)){
                it.remove();

                //list.remove(obj);//这会使得迭代器预期的迭代次数发生改变，抛出异常。
                // 1.使用迭代器本身的删除方法 it.remove() 2.使用break跳出循环
            }
        }
        System.out.println(list);
    }
}
