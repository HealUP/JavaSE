package com.Heimajinjie.Fanxing;
//3��������̳еĹ�ϵ
//�������࣬�̳���DAO��ָ��Ҫ����Student���͵Ķ���
public class ExamStudent extends DAO<Student> {//�̳���DAO��ָ���˴����������Student�ģ���ôExamStudent��Ķ���Ϳ���ʹ��DAO�����еķ���

    public static void main(String[] args) {
        ExamStudent examStudent = new ExamStudent();
        examStudent.add(new Student("SAF", 45));//�Զ��������add()���ͻ�ͨ����д��toString()��ӡ

    }


}
