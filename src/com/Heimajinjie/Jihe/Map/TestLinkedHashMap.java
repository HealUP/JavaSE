package com.Heimajinjie.Jihe.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//存取顺序一致，使用链表维护添加进Map中的顺序，故遍历Map时，是按照添加顺序遍历的。
public class TestLinkedHashMap {
    public void test03(){
        Map map = new LinkedHashMap();//多态 父类引用指向子类对象
        map.put("ss",33);
        map.put("s",33);
        map.put("s",33);//Hashmap key 使用set来存放的，不能重复 ，value是Collection存放的，可重复
        map.put(34,33);
        map.put("ssa","dd");
        map.put(null,null);
        map.put(new Person("zhangsan","20"),2000);
        //打印键值对
        Set set = map.keySet();
        System.out.println("打印键值对:=========");
        for (Object j :set) {
            System.out.println(j+"--->"+map.get(j));
        }
    }

    public static void main(String[] args) {

        new  TestLinkedHashMap().test03();
    }


}
