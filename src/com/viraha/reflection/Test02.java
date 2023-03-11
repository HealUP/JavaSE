package com.viraha.reflection;



//����Class�Ĵ�����ʽ����Щ
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p1 = new Student();//��̬����������ķ���
        Person p2 = new Teacher();//��̬����������ķ���
        System.out.println(p1.name);
        System.out.println(p2.name);


        /*��ȡClass����
        * 1��ͨ��������
        * 2��ͨ��forName���
        * 3��ͨ������.class���
        * 4�������������͵İ�װ�඼��һ��Type���ͣ�ͨ��Type��ȡ*/
        //1��ͨ�������� getClass()
        Class c1 = p1.getClass();
        System.out.println(c1.hashCode());//�Ȼ�ȡClass�����ڻ�ȡhashCode
        //2��ͨ��forName��� ��֪��·��
        Class c2 = Class.forName("com.viraha.reflection.Student");
        System.out.println(c2.hashCode());
        System.out.println(c2);
        //3.ͨ������.class���  ��֪��
        Class c3 = Student.class;
        System.out.println(c3);
        System.out.println(c3.hashCode());
        //4�������������͵İ�װ�඼��һ��Type���ͣ�ͨ��Type��ȡ
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        System.out.println(c4.hashCode());
        //��ø������� ͨ�������ø�������
        Class c5 = c1.getSuperclass();
        System.out.println("--------------");
        System.out.println(c5);//Person��

        Class<Person> personClass = Person.class;
        System.out.println("==========");
        System.out.println(personClass);

    }


}

class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

//����
    class Student extends Person{
    public Student(){//�޲ι���
        this.name = "����ѧ����";
    }
}
    class Teacher extends Person{
        public Teacher(){//�޲ι���
            this.name = "������ʦ��";
        }
    }
