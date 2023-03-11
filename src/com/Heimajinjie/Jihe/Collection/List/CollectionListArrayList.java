package com.Heimajinjie.Jihe.Collection.List;
import java.util.ArrayList;
//ArrayList 查询速度很快
public class CollectionListArrayList {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();//创建Arraylist集合
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println("集合的长度："+list.size());
        System.out.println("第三个元素："+list.get(2));

    }
}
