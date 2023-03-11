package com.Heimajinjie.Fanxing;

import java.util.ArrayList;
import java.util.List;

//1、自定义泛型类
//2、包含自定义的泛型方法
public class Order<T> {
    //属性
    private String orderName;
    private int orderId;
    private T t;//一个不确定的类 T
    List<T> list = new ArrayList<>();
    //添加元素的方法
    public void add(){
        list.add(t);
    }

    //getter,setter

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
    //自定义泛型方法
    public <C> C getC(C c){  //比普通方法多了一个<类型>,传入的类型是任意的
        return c;
    }

    //实现数组到集合的复制
//    public <V> List<V> formArrayToList(V[] e,)
    //toString()
    public <V> List<V> fromArrayToList (V[] v,List<V> list) {//数组：类型V 形参v   集合：类型V 形参list
        for (V v1 :v//类型 新的形参 形参
             ) {
            list.add(v1);
        }
        return list;
    }
//声明泛型方法
    public <E> E getE(E e){
        return e;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", t=" + t +
                '}';
    }



}
//继承泛型类或接口时，可以看看List<E> extends Collection<E>
    class LastOrder extends Order<Integer>{//指明Inerger类型的，或者class LastOrder<A> extends Order<A>{ }
            public void add(){
                list.add(6);
            }
}