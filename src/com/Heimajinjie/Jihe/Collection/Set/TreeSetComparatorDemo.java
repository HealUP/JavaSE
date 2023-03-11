package com.Heimajinjie.Jihe.Collection.Set;
//实现Comparator接口，并重写compare方法案例

import java.util.Comparator;
import java.util.TreeSet;
//定制排序：通过匿名内部类实现Comparator接口并重写compare方法案例
public class TreeSetComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Stu>  treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {//定义比较方法
                if (o1 instanceof Stu && o2 instanceof Stu){
                    Stu c1 = (Stu) o1;//如果o1和o2都是Stu类的对象，那么，强制转换
                    Stu c2 = (Stu) o2;
                    return c1.getId().compareTo(c2.getId());//包装类，String类都实现了Comparable接口,也重写了compareTo()，直接使用

                }
                return -1;//倒序
            }
        });
        treeSet.add(new Stu("s","44"));
        treeSet.add(new Stu("s3","45"));
        treeSet.add(new Stu("s1","44"));
        System.out.println(treeSet);
    }

}

class Stu{
    private String name;
    private String id;

    //get set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Stu(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return name+":"+id;
    }
}