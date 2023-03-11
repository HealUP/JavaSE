package com.viraha.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//动态创建对象，执行方法
public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //获取Class对象
        Class c1 = Class.forName("com.viraha.reflection.User");
        //·1、通过反射创建一个对象  本质是调用了无参构造
//        User user = (User) c1.newInstance();
//        System.out.println(user);
        //1.1 也可以通过有参构造来创建一个对象
        //先通过Class对象获取有参构造器，有参构造器调用newInstance，传入参数即可
       /* System.out.println("==============");
        Constructor Constructor = c1.getDeclaredConstructor(String.class, int.class,int.class);
        User user3 = (User)Constructor.newInstance("hao",20,22);
        System.out.println(user3);*/

//        System.out.println("==============");


        //2、通过反射调用方法
        User user = (User) c1.newInstance();
        //先通过反射获取一个方法：先获取Class对象c1 第一行有了，其次是通过c1.getDeclaredMethod(参数)获取方法
         Method setNameMethod = c1.getDeclaredMethod("setName", String.class);//方法为setName() Method接收
         setNameMethod.invoke(user,"deng") ;//给user这个对象的setName方法传入一个String类型的参数
        //打印对象user3的名字，通过getName
        System.out.println(user.getName());

        //3、通过反射操作属性
        System.out.println("=====================");
        Field field = c1.getDeclaredField("name");//先获取一个特定的属性，不过，该属性是私有的 所有要用getDeclaredField方法来获取，不然报错.NoSuchFieldException: name没有找到该属性

        field.setAccessible(true);//不能直接操作私有属性，需要关闭安全检测 让私有属性也可以访问
        field.set(user,"zhi");//给这个user对象的属性赋值

        System.out.println(user.getName());
    }


    //不能直接操作私有属性，需要关闭安全检测 让私有属性也可以访问
    /*其中，Method Field Constructor 都有 setAccessible()方法  setAccessible()方法作用是：启动和禁止访问安全检查 默认是打开的 为 false 关闭要设置为true*/
}
