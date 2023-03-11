package com.viraha.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//通过反射操作注解  可以跟数据库联动起来 获取注解的值后，通过sql进行增删改查
/*练习ORM：对象关系映射  类映射成数据库的表
* */
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {


        //获取Class对象
        Class c1 = Class.forName("com.viraha.reflection.Student2");
        //通过反射获得类注解
        Annotation[] declaredAnnotations = c1.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);//找到了外面的注解  获得注解的Value的值
            DengTable annotation = (DengTable) c1.getAnnotation(DengTable.class);//注解强转为DengTable
            String value = annotation.value();
            System.out.println(value);// 获得注解的Value的值 （获得了注解的值// ）

        }

        //获得指定的注解(返回的不是数组了  不用数组接收了)  类指定的注解
//        Field[] declaredFields = c1.getDeclaredFields(); 错误
        Field name = c1.getDeclaredField("id");//获取指定字段的注解
        FieldDeng annotation = name.getAnnotation(FieldDeng.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());



    }

}
@DengTable("db_student")//类名的注解 传入参数表名
class Student2{

    @FieldDeng(columnName = "db_id",type = "int",length = 10)//传入参数
    private int id;
    @FieldDeng(columnName = "db_age",type = "int",length = 10)
    private int age;
    @FieldDeng(columnName = "db_name",type = "varchar",length = 3   )
    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


//类名的注解
@Target(ElementType.TYPE)//作用域
//运行时生效
@Retention(RetentionPolicy.RUNTIME)
@interface DengTable {
    String value();
}

//属性的注解
@Target(ElementType.FIELD)//作用域
//运行时生效
@Retention(RetentionPolicy.RUNTIME)
@interface FieldDeng{
    String columnName();//列名
    String type();//属性
    int length();
}
