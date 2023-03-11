package com.Heimajinjie.Jihe.Map;

import java.util.Objects;

//����һ����
public class Person implements Comparable {
    private String name;
    private String age;
    private int id;

    //������

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

//��Ȼ����ʵ��Comarable�ӿڵ�ʵ���࣬����Ķ���Ҫ��дcompareTo���� ����TreeMap���Person��Ķ���ʱ�����ݴ˷�����ȷ�������ĸ��������С�
    @Override
    public int compareTo(Object o) {
        if (o instanceof  Person){
            Person p = (Person)o;//ǿ��ת��
            int i = this.age.compareTo(p.age);
            if (i == 0){//�������age��ȣ��Ͱ���name��ASCII��������
                return this.name.compareTo(p.name);
            }else {//��������������������һ��age���ڻ���С�ڵڶ���age,������valueֵ��С����������
                return 1;
            }
        }
        return 0;
    }
}
