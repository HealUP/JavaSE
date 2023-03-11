package com.Heimajinjie.object;

import java.util.Objects;

public class Person01 {
    private String name;
    private int age;
    // 构造方法 ，无参和有参
    public Person01() {
    }
    public Person01(String name, int age) {
        this.name = name;
        this.age = age;
    }
//直接打印对象的地址没有意义，重写一tostring下
//toString  方法不重写时是默认是打印对象的地址的
   /*
   01
   @Override
    public String toString() {
        return "Person01{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/


//02
    /*object  类的equals方法 默认比较两个对象的地址值，比较地址值无意义，就需要重写一下，
    换成比较两个对象的属性（name,age）
    但是有一个问题：
    Object obj=new Person01("python", 10);
    看这行代码obj是Object类的子类
    这行代码中，隐含着一个多态，（多态是方法的多态），父类引用指向了子类的对象
    父类是不能直接用子类的内容的（属性和方法）
    解决：强制转型，即向下转型（向上转型是自动转，向下转型是强制转）
    转型再使用子类的内容即可。

    * */
//重写equals方法

    //只有名字和年龄相等才返回true
   /* @Override
    public boolean equals(Object obj) {

//传递本身
        if (obj==this){
            return  true;
        }
//传递空
        if (obj==null) {
        return  false;
        }
//判断obj是否为Person01类
//      传递是否为person类
        if (obj instanceof Person01) {
//       向下转型  转型了再比较
            Object obj=new Person01("python", 10); 先向上转型，再向下转型
            Person01 p = (Person01) obj;//obj转化为子类 Person01
            boolean c = this.name.equals(p.name) && this.age == p.age;
            return c;
        }
        return false;

    }*/
//hashCode 和 equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person01 person01 = (Person01) o;
        return age == person01.age && Objects.equals(name, person01.name);//Objects  防止抛出空指针异常
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }



    //    get  set  方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
