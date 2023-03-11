package com.Heimajinjie.Jihe.Collection.List;

import java.util.ArrayList;

public class ForeachDemo {
    public static void main(String[] args) {
        //局限性：只能访问集合中的元素，不能进行修改
        //也称为增强for循环
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("v");
        list.add("h");
        for (Object obj:list) { //元素类型  临时变量  容器变量
            System.out.println(obj);
        }
    }
}
