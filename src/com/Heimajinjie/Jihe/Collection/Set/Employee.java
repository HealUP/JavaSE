package com.Heimajinjie.Jihe.Collection.Set;

import java.util.Objects;

//TreeSet��ϰ
public class Employee implements Comparable {
    private String name;
    private int age;
    private MyDate birthday;
//getter setter����
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
//toString()
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    //���췽��
    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }
//��дcompareTo() ��������name����
    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee employee = (Employee) o;//ǿ��ת��ΪEmployee����
            return this.name.compareTo(employee.name);
        }
        return 0;
    }
    //��дequals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result+age;
        result = prime*result + ((birthday == null)?0:name.hashCode());
        return result;
    }
}
