package com.Heimajinjie.object;
/*java.lang.Object
 * 类Object 是类层次结构的根类（父类）
 * 每个类都使用 Object 作为超类（父类）
 * 所有对象都实现这个类的方法*/



public class ToString01 {

    public static void main(String[] args) {
        /*person 类默认继承了object 类  所以可以使用  object类中的toString  方法
         * 该方法返回该对象的字符串表示*/
        Person01 p = new Person01("丢丢", 19);
        String s = p.toString();
        System.out.println(s);//打印的是该对象的地址值
        System.out.println(p);//直接打印对象的名字，其实就是调用对象的toStrin方法
//   调用get  set 方法
        p.setName("set方法设置名字");
        p.getName();
        p.setAge(22);
        System.out.println(p.getName());
        System.out.println("年龄是："+p.getAge());

    }


//    看一个类是否重写了tostring 方法没有重写的哈是直接打印这个类的地址值
}
