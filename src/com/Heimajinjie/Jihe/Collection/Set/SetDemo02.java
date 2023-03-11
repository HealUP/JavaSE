package com.Heimajinjie.Jihe.Collection.Set;
/*���HashSet�Ĵ洢���ݣ��������õĴ洢�Ͳ�ѯ���ܣ������̣�����1����ͨ��add()����������Ԫ�أ�
*2�������ö����hashCode������ö���Ĺ�ϣֵ��
*3���ݶ���Ĺ�ϣֵ��������洢λ��
*4�жϸ�λ���Ƿ��ж��󣬷��򽫶�����뼯�ϣ��������equals()�����ж϶����Ƿ����
*5�����������������뼯��
* */

import java.util.HashSet;
import java.util.Objects;
//Set�е�Ԫ�ش洢��ʹ���˹�ϣ�㷨
//String���Ѿ���д��HashCode��ȷ��������equals���������Լ����������뵽HashSet�У�ҲҪ�����ж�����д��hashcode()��equals()����
public class SetDemo02 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        Student student1 = new Student("����","32");
        Student student2 = new Student("����","31");
        Student student3 = new Student("����","33");
        Student student4 = new Student("����","33");

        hs.add(student2);
        hs.add(student3);
        hs.add(student4);
        hs.add(student1);
        System.out.println(hs);//����toString()����
    }
}

//����һ��ѧ����
class Student{
    private String name;
    private String  id;
    //������
    public Student(String name,String id){

        this.name = name;
        this.id = id;
    }
    //��дtoString����
    @Override
    public String toString() {
        return id +":"+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true; //�ж��Ƿ���ͬһ������ ���򷵻�true
        if (!(o instanceof Student)){
            return  false;
        }//�ж϶����Ƿ�ΪStudent����
        Student student = (Student) o;//������ǿ��ת��ΪStudent����
        boolean b = this.id.equals(student.id);//�жϵ�ǰ����idֵ�Ƿ��뱾�����idֵ��ͬ
        return b;
    }

    @Override
    public int hashCode() {
        return id.hashCode();  //����id������ɢ��ֵ
    }
}
