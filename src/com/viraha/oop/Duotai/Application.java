package com.viraha.oop.Duotai;

public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        //���������ָ������Ķ��� student���Ǽ̳�person��ģ�ѧ����ѧ��û����һ���������ˣ�
        Person s2 = new Student();
        //������ִ����Щ��������Ҫ�����Ƕ�����ߵ����ͣ����ұ߹�ϵ����
        s1.eat();
        s1.run();//������д�˸���ķ�����ִ�е�������ķ���
        s2.run();
       // s2.eat() ����;//�����ͣ�����ָ�����࣬���ǲ��ܵ���������еķ�����
        ((Student)s2).eat();
    }
}
