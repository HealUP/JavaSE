package com.Heimajinjie.Jihe.Map;

import java.util.Comparator;
import java.util.Objects;

//����һ����
public class Customer implements Comparable {
    private String name;
    private Integer id;
    //������
    public Customer(String name,  int id) {
        this.name = name;
        this.id = id;
    }
//getter setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    //tostring��д

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //��дcompareTo()
    @Override
    public int compareTo(Object o) {
        if (o instanceof  Customer){
            Customer c = (Customer) o;//ǿ��ת��
            int i = this.id.compareTo(c.id);
            if (i == 0){//�������id��ȣ��Ͱ���name��ASCII��������
                return this.name.compareTo(c.name);
            }else {//��������������������һ��id���ڻ���С�ڵڶ���id,������valueֵ��С����������
                return 1;
            }
        }
        return 0;
    }
}
