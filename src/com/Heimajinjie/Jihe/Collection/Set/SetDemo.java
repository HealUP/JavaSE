package com.Heimajinjie.Jihe.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//set:无序 （存储的位置无序，不是连续的）不允许出现重复 与list相反 set接口也继承Colletion接口，可以用其常用的方法
//HashSet（主要实现类）,LinkedHashSet,TreeSet
public class SetDemo {
    public static void main(String[] args) {
        //多态 add()
        Set set = new HashSet();
        set.add(1234);
        set.add(56);
        set.add(78);
        set.add("aaa");
        set.add(null);//允许加入空值
        System.out.println(set.size());//个数
        System.out.println(set);//元素
        Iterator iterator = set.iterator();//获取Set的iterator对象
        while (iterator.hasNext()){
            Object obj = iterator.next();//如果有元素存储到obj
            System.out.println(obj);//读取
        }
    }
}
