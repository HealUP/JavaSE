package com.Heimajinjie.Fanxing;
//DAO:database access object   数据库访问对象
//通过编写DAO层，来操作数据库中具体的表，就可以通过泛型来解决，传入一个不确定的类型。
public class DAO<T> {
    //方法
     public void add(T t){
         System.out.println(t);//重写了toString()
     }
     public T get(int index){
         return null;//例子
     }
     //......
}
