package com.viraha.reflection;



//测试Class的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person p1 = new Student();//多态，调用子类的方法
        Person p2 = new Teacher();//多态，调用子类的方法
        System.out.println(p1.name);
        System.out.println(p2.name);


        /*获取Class对象
        * 1、通过对象获得
        * 2、通过forName获得
        * 3、通过类名.class获得
        * 4、基本内置类型的包装类都有一个Type类型，通过Type获取*/
        //1、通过对象获得 getClass()
        Class c1 = p1.getClass();
        System.out.println(c1.hashCode());//先获取Class对象在获取hashCode
        //2、通过forName获得 已知类路径
        Class c2 = Class.forName("com.viraha.reflection.Student");
        System.out.println(c2.hashCode());
        System.out.println(c2);
        //3.通过类名.class获得  已知类
        Class c3 = Student.class;
        System.out.println(c3);
        System.out.println(c3.hashCode());
        //4、基本内置类型的包装类都有一个Type类型，通过Type获取
        Class c4 = Integer.TYPE;
        System.out.println(c4);
        System.out.println(c4.hashCode());
        //获得父类类型 通过子类获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println("--------------");
        System.out.println(c5);//Person类

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

//子类
    class Student extends Person{
    public Student(){//无参构造
        this.name = "我是学生！";
    }
}
    class Teacher extends Person{
        public Teacher(){//无参构造
            this.name = "我是老师！";
        }
    }
