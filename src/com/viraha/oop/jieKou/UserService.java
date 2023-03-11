package com.viraha.oop.jieKou;
//定义一个UserService接口,需要写实现类
public interface UserService  {
//    接口中的所有定义其实都是抽象的，  public abstract
//    接口只管定义，方法，没有具体的实现 接口相当于约束
//   在接口中定义方法    public abstract 隐藏的，直接写void
//    public final abstract


//   接口中也可以定义属性 而且是   final  的public 的static 静态的
    public  static final  int  age=99;
    //   定义  增删改查方法
    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
//锻炼抽象的思维，定义接口 ，实现里面的方法就行了

/*
1、接口是一种约束
2、只有方法的定义，不写实现
3、方法都是public abstract
4、变量都是  public  static final
5、不能被实例化，没有构造方法
6、implements 实现多个接口 即：伪多继承
7、接口的实现类，要重写接口中定义的所有方法
* */