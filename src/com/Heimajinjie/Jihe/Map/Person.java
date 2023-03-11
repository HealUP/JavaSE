package com.Heimajinjie.Jihe.Map;

import java.util.Objects;

//定义一个类
public class Person implements Comparable {
    private String name;
    private String age;
    private int id;

    //构造器

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    //equals  hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name) && age.equals(person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //getter setter "

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person={" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

//自然排序：实现Comarable接口的实现类，该类的对象，要重写compareTo方法 当向TreeMap添加Person类的对象时，依据此方法，确定按照哪个属性排列。
    @Override
    public int compareTo(Object o) {
        if (o instanceof  Person){
            Person p = (Person)o;//强制转换
            int i = this.age.compareTo(p.age);
            if (i == 0){//如果两个age相等，就按照name的ASCII码来排序
                return this.name.compareTo(p.name);
            }else {//如果是其他情况（包括第一个age大于或者小于第二个age,都按照value值由小到大来排序）
                return 1;
            }
        }
        return 0;
    }
}
