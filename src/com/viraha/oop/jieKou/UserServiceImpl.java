package com.viraha.oop.jieKou;
//抽象类：extends~只能单继承，但是接口可以实现多继承
//写一个类   类  可以实现接口  implements接口
//只要实现了方法 就不会报错  即重写方法； 实现了接口的类 ,必须重写接口的方法
//使用implements关键字，重写里面的方法就可以了
public class UserServiceImpl implements UserService,Timer{

    @Override
    public void add(String name) {
        System.out.println(name);
    }

    @Override
    public void delete(String name) {
        System.out.println(name);
    }

    @Override
    public void update(String name) {
        System.out.println(name);
    }

    @Override
    public void query(String name) {
        System.out.println(name);
    }

    @Override
    public void timer() {
        System.out.println("这是重写了接口的方法！");
    }
}

