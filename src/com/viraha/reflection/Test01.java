package com.viraha.reflection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//��̬���� ��̬����
//ʲô�Ƿ���
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //ͨ�������ȡ���Class����
        Class c1 = Class.forName("com.viraha.reflection.User");//�����׳��쳣
        System.out.println(c1);
        Class c2 = Class.forName("com.viraha.reflection.User");
        Class c3 = Class.forName("com.viraha.reflection.User");
        Class c4 = Class.forName("com.viraha.reflection.User");

        //һ�������ڴ���ֻ��һ��Class���󣬿��ԱȽ����ǵ�hashCode()
        //һ���౻���أ�������Ľṹ����װ��Class������
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }



}



//����һ��ʵ����
class User{
    private String name;
    private int id;
    private int age;
//�޲ι���
    public User() {
    }
//�вι���
    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //˽�з���
    private void show(){
        System.out.println("hhh ����˽�з�����");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}