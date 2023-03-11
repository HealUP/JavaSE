package com.Heimajinjie.Jihe.Collection.Set;
/*理解HashSet的存储数据（具有良好的存储和查询性能）的流程，即：1首先通过add()方法，存入元素；
*2进而调用对象的hashCode防范获得对象的哈希值；
*3根据对象的哈希值，计算其存储位置
*4判断该位置是否有对象，否则将对象存入集合，是则调用equals()方法判断对象是否相等
*5相等则舍弃，否则存入集合
* */

import java.util.HashSet;
import java.util.Objects;
//Set中的元素存储：使用了哈希算法
//String类已经重写了HashCode（确保无序）与equals方法；将自己定义的类存入到HashSet中，也要在类中定义重写的hashcode()和equals()方法
public class SetDemo02 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student student1 = new Student("张三","32");
        Student student2 = new Student("李三","31");
        Student student3 = new Student("赵三","33");
        Student student4 = new Student("赵三","33");

        hs.add(student2);
        hs.add(student3);
        hs.add(student4);
        hs.add(student1);
        System.out.println(hs);//调用toString()方法
    }
}

//定义一个学生类
class Student{
    private String name;
    private String  id;
    //构造器
    public Student(String name,String id){

        this.name = name;
        this.id = id;
    }
    //重写toString方法
    @Override
    public String toString() {
        return id +":"+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; //判断是否是同一个对象 是则返回true
        if (!(o instanceof Student)){
            return  false;
        }//判断对象是否为Student类型
        Student student = (Student) o;//将对象强制转化为Student类型
        boolean b = this.id.equals(student.id);//判断当前对象id值是否与本类对像id值相同
        return b;
    }

    @Override
    public int hashCode() {
        return id.hashCode();  //返回id的属性散列值
    }
}
