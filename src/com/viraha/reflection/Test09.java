package com.viraha.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//性能分析
public class Test09 {
    public static void test01(){
        //普通方式调用
        User user1 = new User();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            user1.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方式执行10亿次所消耗的时间:"+(endTime-startTime)+"ms");
    }

    //反射方式调用
    public static void test02() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //普通方式调用
        //获取Class对象
        Class c1 = Class.forName("com.viraha.reflection.User");
        //通过反射创建对象   直接普通创建对象的方法也行
        User user = (User) c1.newInstance();
        Method getName = c1.getDeclaredMethod("getName",null);
        //激活
        //不关闭安全检查
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式（不关闭安全检测）执行10亿次所消耗的时间:"+(endTime-startTime)+"ms");
    }

    //反射方式调用 关闭安全检测
    public static void test03() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        //普通方式调用
        //获取Class对象
        Class c1 = Class.forName("com.viraha.reflection.User");
        //通过反射创建对象   直接普通创建对象的方法也行
        User user = (User) c1.newInstance();
        Method getName = c1.getDeclaredMethod("getName",null);
        getName.setAccessible(true);//关闭安全检查
        // 激活
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000000; i++) {
            getName.invoke(user);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射方式（不关闭安全检测）执行10亿次所消耗的时间:"+(endTime-startTime)+"ms");
    }
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        test01();
        test02();
        test03();
    }
}
