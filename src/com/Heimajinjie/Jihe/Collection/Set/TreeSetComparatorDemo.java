package com.Heimajinjie.Jihe.Collection.Set;
//ʵ��Comparator�ӿڣ�����дcompare��������

import java.util.Comparator;
import java.util.TreeSet;
//��������ͨ�������ڲ���ʵ��Comparator�ӿڲ���дcompare��������
public class TreeSetComparatorDemo {
    public static void main(String[] args) {
        TreeSet<Stu>  treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {//����ȽϷ���
                if (o1 instanceof Stu && o2 instanceof Stu){
                    Stu c1 = (Stu) o1;//���o1��o2����Stu��Ķ�����ô��ǿ��ת��
                    Stu c2 = (Stu) o2;
                    return c1.getId().compareTo(c2.getId());//��װ�࣬String�඼ʵ����Comparable�ӿ�,Ҳ��д��compareTo()��ֱ��ʹ��

                }
                return -1;//����
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

    //get set����
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