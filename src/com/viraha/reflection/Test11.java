package com.viraha.reflection;

import java.lang.annotation.*;
import java.lang.reflect.Field;

//ͨ���������ע��  ���Ը����ݿ��������� ��ȡע���ֵ��ͨ��sql������ɾ�Ĳ�
/*��ϰORM�������ϵӳ��  ��ӳ������ݿ�ı�
* */
public class Test11 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {


        //��ȡClass����
        Class c1 = Class.forName("com.viraha.reflection.Student2");
        //ͨ����������ע��
        Annotation[] declaredAnnotations = c1.getDeclaredAnnotations();
        for (Annotation declaredAnnotation : declaredAnnotations) {
            System.out.println(declaredAnnotation);//�ҵ��������ע��  ���ע���Value��ֵ
            DengTable annotation = (DengTable) c1.getAnnotation(DengTable.class);//ע��ǿתΪDengTable
            String value = annotation.value();
            System.out.println(value);// ���ע���Value��ֵ �������ע���ֵ// ��

        }

        //���ָ����ע��(���صĲ���������  �������������)  ��ָ����ע��
//        Field[] declaredFields = c1.getDeclaredFields(); ����
        Field name = c1.getDeclaredField("id");//��ȡָ���ֶε�ע��
        FieldDeng annotation = name.getAnnotation(FieldDeng.class);
        System.out.println(annotation.columnName());
        System.out.println(annotation.type());
        System.out.println(annotation.length());



    }

}
@DengTable("db_student")//������ע�� �����������
class Student2{

    @FieldDeng(columnName = "db_id",type = "int",length = 10)//�������
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


//������ע��
@Target(ElementType.TYPE)//������
//����ʱ��Ч
@Retention(RetentionPolicy.RUNTIME)
@interface DengTable {
    String value();
}

//���Ե�ע��
@Target(ElementType.FIELD)//������
//����ʱ��Ч
@Retention(RetentionPolicy.RUNTIME)
@interface FieldDeng{
    String columnName();//����
    String type();//����
    int length();
}
