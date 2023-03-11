package com.viraha.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//通过反射获得类的信息
/*1、获取类的名和包名
* 2、获取类的属性
* 3、获得指定属性的值
* 4、获得类的方法
* 5、获得类的指定的方法
* 6、获取类的构造器getConstructors()获得的是本类的    getDeclaredConstructors() 获得所有 包括父类的构造器
* 7、获取指定的构造器 ，传入参数*/
public class Test07 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        //1、获取类的名和包名
        Class c1 = Class.forName("com.viraha.reflection.User");//先获取到Class对象
        User u = new User();
//        System.out.println(u.getClass().getSimpleName());//也可以通过对象来获得Class对象，进而获取类名
        System.out.println(c1.getName());//包名
        System.out.println(c1.getSimpleName());//类名
        System.out.println("-================-");
        //2 获取类的属性
//        Field[] fields = c1.getFields();//得到是个数组  获取的是所有的public属性
        /*for (Field f:fields
             ) {
            System.out.println(f);
            
        }*/
        Field[] fields = c1.getDeclaredFields();//获取的是所有的属性  包括私有
        for (Field field:fields) {
            System.out.println(field);
        }
        System.out.println("==================");
        //3 获得指定属性的值
        Field name = c1.getDeclaredField("name");//所有类型的属性都能获取
        System.out.println(name);
        System.out.println("==================");
        //4 获得类的方法
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method me:declaredMethods
             ) {
            System.out.println("获得本类的所有方法，包括私有和公开的："+me);
        }

        System.out.println("==================");
        Method[] methods = c1.getMethods();
        for (Method method:methods){
            System.out.println("获得本类及其父类的全部方法："+method);
        }
        System.out.println("==================");
        //5、获得类的指定的方法
        Method method = c1.getMethod("getName",null);//传入方法名   该方法的参数
        Method method1 = c1.getMethod("setName", String.class);//传入方法名   该方法的参数
        System.out.println(method);
        System.out.println(method1);
//传入参数，为了避免该方法是重载的，传入参数就可以区分！
        System.out.println("==================");
        //6、获取类的构造器getConstructors()获得的是本类的    getDeclaredConstructors() 获得所有 包括父类的构造器
        Constructor[] constructor = c1.getConstructors();//返回值也是一个数组  当获得指定的构造器就用不带s的那个方法getConstructor
        for (Constructor constructor1 : constructor) {
            System.out.println(constructor1);
        }
        System.out.println("==================");
        Constructor[] declaredConstructors = c1.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            System.out.println("**"+declaredConstructor);
        }

        System.out.println("==================");
        //获取指定的构造器 ，传入参数
        Constructor declaredConstructor = c1.getDeclaredConstructor(String.class, int.class, int.class);
        System.out.println(declaredConstructor);
    }

}
