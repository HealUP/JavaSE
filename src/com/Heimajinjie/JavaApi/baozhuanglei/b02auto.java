package com.Heimajinjie.JavaApi.baozhuanglei;

import java.util.ArrayList;

//自动装箱与自动拆箱
public class b02auto {
    public static void main(String[] args) {
//        自动装箱：直接把int类型的数值直接复制包装类
        Integer in = 1;
        in = in +2;//    int+2相当于：是自动拆箱，in.intvalue()+2=3
                   //    in=in.intvalue()+2=3赋值给in相当于自动装箱
        System.out.println(in);

//      对于AraayList集合无法直接存储整数，可以存储Interger包装类
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱 list.add(new Integer(1))
        int a = list.get(0);//自动拆箱：list.get(0).intvalue();

    }
}
