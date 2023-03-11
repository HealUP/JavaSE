package com.Heimajinjie.Jihe.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//线程同步方面的工具方法，只要加上Synchronizedxxx，当多个线程同时操作一个集合时，加上Synchronizedxxx能保证线程安全
//Collections.synchronizedMap(map)、Collections.synchronizedList(list)

public class TestSynchronizedxxx {

    public static void main(String[] args) {
        List list = new ArrayList();
        Collections.synchronizedList(list);//变成安全的list了

}


}