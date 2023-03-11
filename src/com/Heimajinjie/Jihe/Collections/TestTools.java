package com.Heimajinjie.Jihe.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collection操作集合的工具类：collections，里面的方法是静态的，可以通过类.来调用
/*常用方法：
---操作List集合的
* 1、reverse(List) 反转
* 2、shuffle(List)
*3、sort(list):自然顺序
*4、sort(List,comparator)：指定的comparator排序
*5、swap(List,int,int):int:指定位置
----------
*/
public class TestTools {
    public void test07(){
        //ArrayList()
        List list = new ArrayList();
        list.add(34);
        list.add(54);
        list.add(36);
        list.add(74);
        list.add(32);
        list.add(32);//可重复的
        System.out.println(list);
        //反转
        Collections.reverse(list);
        System.out.println("反转后的list：");
        System.out.println(list);
        //随机排列
        System.out.println("随机排列的list：");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("自然顺序排列的list：");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("指定顺序排列的list(参数是指定的Comparator)：");
//        Collections.sort(list);//
        System.out.println("交换list：");
        Collections.swap(list,2,0);//第三个位置和第一个交换
        System.out.println(list);
    }

    public void test08(){

    }

    public static void main(String[] args) {
//        new TestTools().test07();
        new TestTools().test08();
        //ArrayList()
        List list = new ArrayList();
        list.add(34);
        list.add(54);
        list.add(36);
        list.add(74);
        list.add(32);
        list.add(32);//可重复的

        //找出最大元素
        Object object = Collections.max(list);
        System.out.println(object);
        //找出最小的元素
        Object obj = Collections.min(list);
        System.out.println(obj);
        //计算某个元素出现多少次
        int count = Collections.frequency(list,32);
        System.out.println(count);
        //实现list的复制
        //错误的方法：List list1 = new ArrayList();
        //正确的方法：
        List list1 = Arrays.asList(new Object[list.size()]);//开辟一个和list一样大的空间

        System.out.println("原始："+list);
        System.out.println("复制前，都为null");
        System.out.println(list1);
        System.out.println("复制后");
        Collections.copy(list1,list);//(接收复制，复制源)
        System.out.println(list1);

        System.out.println("全部需要替换的指定值都替代掉：" );
        Collections.replaceAll(list1,34,39);
        System.out.println(list1);
    }
}

