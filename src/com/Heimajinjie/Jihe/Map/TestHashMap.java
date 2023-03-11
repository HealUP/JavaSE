package com.Heimajinjie.Jihe.Map;

import java.util.*;

/*
* Collection接口
*
* Map接口：
*        HashMap:主要实现类 实现了Map接口
*        LinkedHashMap：链表维护
*          1、Hashmap 的key 使用set来存放的，不能重复 value 可以重复 用Collection来存放的
*        一个key-value对，是一个Entry,所有的Entry是用Set存放的，也是不可重复的
*         2、向HashMap中添加元素时，会调用key所在类的equals方法，判断两个key是否相同，若相同只能添加后添加进去的那个元素(截图见map02)。
*
方法：1、put(Object a,Object b) 添加元素
* 2、remove(Object a)删除 根据key删除 entry
* 3、get(Object a) 根据key获取指定value值 */
public class TestHashMap {
    public static void main(String[] args) {
        new TestHashMap().test02();

    }
    public void test01(){
        Map map = new HashMap();//多态 父类引用指向子类对象
        map.put("ss",33);
        map.put("s",33);
        map.put("s",33);//Hashmap key 使用set来存放的，不能重复 ，value是Collection存放的，可重复
        map.put(34,33);
        map.put("ssa","dd");
        map.put(null,null);
        map.put(new Person("zhangsan","20"),2000);
        map.put(new Person("zhangsan","20"),2009);//存入自定义类的对象，要重写所在类的equal和 hashcode 方法 map02
        System.out.println(map.size());
        System.out.println("原来的："+map);
        //先Object类型，存到value,直接 System.out.println(map.get(34));也行
        System.out.println("remove(Object a)删除,根据key删除整个entry：");
        map.remove("s");
        System.out.println("删除后："+map);//看看
        // System.out.println("根据key，获得指定的value值:");
        System.out.println("根据key，获得指定的value值：");
        Object value = map.get(34);//根据key，获得指定的value值
        System.out.println(map.get(34));
        System.out.println("是否包含此value：");
        boolean a = map.containsValue(2009);//是否包含 此value ture OR False
        System.out.println(a);
        System.out.println("是否包含此key：");
        boolean b = map.containsKey(new Person("zhangsan","20"));//是否包含 此key ture OR False
        System.out.println(b);
    }
    //如何遍历map
    /*1遍历所有的key  key集
    * 2遍历所有的*/
    public void test02(){
        //添加map的元素
        Map map = new HashMap();//多态 父类引用指向子类对象
        map.put("ss",33);
        map.put("s",33);
        map.put("s",33);//Hashmap key 使用set来存放的，不能重复 ，value是Collection存放的，可重复
        map.put(34,33);
        map.put("ssa","dd");
        map.put(null,null);
        map.put(new Person("zhangsan","20"),2000);
        //1、遍历所有的key  key集，key是Set类型的，Set接收 打印出来的key的值也是无序的
        Set set = map.keySet();
        //增强for循环遍历（也叫for each循环）；Iterator遍历也行
        System.out.println("1、遍历所有的key集：");
        for (Object obj:set) {
            System.out.println(obj);
        }
        //2、遍历所有的value集，value是collection类型的
        Collection collection = map.values();
        System.out.println("2、遍历所有的value集：");
        //Iterator遍历
        Iterator iterator = collection.iterator();//获取iterator对象
        while (iterator.hasNext()){
            Object o = iterator.next();//读取，接收
            System.out.println(o);
        }

        //2、遍历所有的Entry，key-value对 方法1：通过keySet()找到key,通过get(key)找到value
        System.out.println("<3、遍历所有的Entry，key-value对 >方法1：通过keySet()找到key,通过get(key)找到value");
        Set set1 = map.keySet();//找到key
        for (Object obj2:set1) {
            System.out.println(obj2+"----->"+map.get(obj2));
        }
        System.out.println("<3、遍历所有的Entry，key-value对 >方法2：通过entrySet()方法");
        //entry是存放在Set当中的，Set接收
        Set set3 = map.entrySet();
        for (Object ob:set3
             ) {
            Map.Entry entry = (Map.Entry)ob;//强转
            System.out.println(entry.getKey()+"---->"+entry.getValue());
//            System.out.println(entry);直接打印也行

        }
    }
}
