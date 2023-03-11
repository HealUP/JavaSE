package com.viraha.reflection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

//静态语言 动态语言
//什么是反射
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射获取类的Class对象
        Class c1 = Class.forName("com.viraha.reflection.User");//主动抛出异常
        System.out.println(c1);
        Class c2 = Class.forName("com.viraha.reflection.User");
        Class c3 = Class.forName("com.viraha.reflection.User");
        Class c4 = Class.forName("com.viraha.reflection.User");

        //一个类在内存中只有一个Class对象，可以比较他们的hashCode()
        //一个类被加载，整个类的结构被封装到Class对象中
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c4.hashCode());
    }



}



//定义一个实体类
class User{
    private String name;
    private int id;
    private int age;
//无参构造
    public User() {
    }
//有参构造
    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //私有方法
    private void show(){
        System.out.println("hhh 我是私有方法！");
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