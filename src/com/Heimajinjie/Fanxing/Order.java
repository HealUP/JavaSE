package com.Heimajinjie.Fanxing;

import java.util.ArrayList;
import java.util.List;

//1���Զ��巺����
//2�������Զ���ķ��ͷ���
public class Order<T> {
    //����
    private String orderName;
    private int orderId;
    private T t;//һ����ȷ������ T
    List<T> list = new ArrayList<>();
    //���Ԫ�صķ���
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
    //�Զ��巺�ͷ���
    public <C> C getC(C c){  //����ͨ��������һ��<����>,����������������
        return c;
    }

    //ʵ�����鵽���ϵĸ���
//    public <V> List<V> formArrayToList(V[] e,)
    //toString()
    public <V> List<V> fromArrayToList (V[] v,List<V> list) {//���飺����V �β�v   ���ϣ�����V �β�list
        for (V v1 :v//���� �µ��β� �β�
             ) {
            list.add(v1);
        }
        return list;
    }
//�������ͷ���
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
//�̳з������ӿ�ʱ�����Կ���List<E> extends Collection<E>
    class LastOrder extends Order<Integer>{//ָ��Inerger���͵ģ�����class LastOrder<A> extends Order<A>{ }
            public void add(){
                list.add(6);
            }
}