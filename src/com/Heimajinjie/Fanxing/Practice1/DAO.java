package com.Heimajinjie.Fanxing.Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//创建一个泛型类 ， 定义一个map 成员变量，键为String类型，值为T类型
public class DAO <T>{
    Map<String,T> map ;
    //创建save方法 即：添加元素到Map中
    public void save(String id,T entity){
        map.put(id,entity);
    }
    //创建get方法，获取id对应的对象 T类型的
    public T get(String id){
        return map.get(id);
    }
    //创建Update方法
    public void update(String id,T entity){
        map.put(id,entity);//直接覆盖
    }
    // 创建list方法，返回map中存放的所有T对象，通过获键来获取对应的值，存放到List
    public List<T> list(){
        //创建集合
        List<T> list = new ArrayList<>();
        //for循环添加进list
        for (String s:map.keySet()
             ) {
             list.add(map.get(s));
        }
        return list;
    }
    //创建detele方法
    public void delete(String id){
        map.remove(id);

    }
}
