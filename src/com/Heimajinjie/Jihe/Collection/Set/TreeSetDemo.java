package com.Heimajinjie.Jihe.Collection.Set;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.TreeSet;

/*//
*TreeSet���ѵ㣩:ֻ�����ͬһ�����Ԫ��
* TreeSet���������� ������
* 1��ʵ��Comparable�ӿڣ�����дcompareTo() ��Ȼ����
* 2��ʵ��Comparator�ӿڣ���дcompare()������equals()���� ������Ĭ�ϼ̳� Object�࣬Object������equals����������ֻ��Ҫ��дcompare()���� ��������
*
* ==================TreeSet֮���Կ��Զ���ӵ�Ԫ�ؽ�����������Ϊ��ʵ��Comparable�ӿڣ���д��compareTo()========================
* 1������ӽ����ϵ�Ԫ��ָ����˳���������String����װ���Ĭ�ϰ��մ�С�����˳�����
* 2�������Ͱ�װ�࣬String�඼ʵ����Comparable�ӿڣ�����ǿ�ж�ʵ������ÿ����Ķ�������������򣬳�Ϊ�����Ȼ���򣬸ýӿڵ�compareTo������Ϊ��Ȼ�ȽϷ���
* 3�����Զ�����Ķ������TreeSet���佫�������ӵ�Ԫ�ؽ������򣬸������Ҫʵ��Comparable�ӿڣ�����дcompareTo()
* 4*/
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();
        treeSet.add(new Person("2","A"));
        treeSet.add(new Person("22","C"));
        treeSet.add(new Person("23","B"));
        System.out.println(treeSet);

    }
}
//�Զ�����Person,ʵ��Comparable�ӿڣ�����дcompareTo()
class Person implements Comparable{
    private String id;
    private String name;

    //������
    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    //��дtostring()

    @Override
    public String toString() {
        return id + ":" + name;
    }

    //��дcompareTo()
    @Override
    public int compareTo(Object o) {
        //return -1;//����洢
        //return 0;//ֻ����һ��
        return 1;//�����洢
    }
}
