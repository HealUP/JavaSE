package com.Heimajinjie.Fanxing;
//3、泛型与继承的关系
//定义了类，继承了DAO，指明要操作Student类型的对象
public class ExamStudent extends DAO<Student> {//继承了DAO并指明了传入的类型是Student的，那么ExamStudent类的对象就可以使用DAO中所有的方法

    public static void main(String[] args) {
        ExamStudent examStudent = new ExamStudent();
        examStudent.add(new Student("SAF", 45));//自定义调用了add()，就会通过重写的toString()打印

    }


}
