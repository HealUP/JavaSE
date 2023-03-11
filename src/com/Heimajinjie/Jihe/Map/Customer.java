package com.Heimajinjie.Jihe.Map;

import java.util.Comparator;
import java.util.Objects;

//定义一个类
public class Customer implements Comparable {
    private String name;
    private Integer id;
    //构造器
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


    //tostring重写

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    //重写compareTo()
    @Override
    public int compareTo(Object o) {
        if (o instanceof  Customer){
            Customer c = (Customer) o;//强制转换
            int i = this.id.compareTo(c.id);
            if (i == 0){//如果两个id相等，就按照name的ASCII码来排序
                return this.name.compareTo(c.name);
            }else {//如果是其他情况（包括第一个id大于或者小于第二个id,都按照value值由小到大来排序）
                return 1;
            }
        }
        return 0;
    }
}
