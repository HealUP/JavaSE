package com.viraha.oop.ChouXianglei;
//继承抽象类 ，要重写方法 否则报错  抽象类的所有方法，继承了它的子类，都需要实现它的方法 （重写方法）
// @Override
//    public void doSomething() {
//
//    }
public abstract class  A extends Action {
//   如果不重写，把子类本身定义成抽象子类 即可
    public abstract void doSomething();//抽象子类
}
//1、不能new这个抽象类
//2、抽象类里面可以写普通方法，抽象方法必须在抽象类中
//思考：抽象类存在构造器吗 （可以去查它的.class文件）  存在的意义  比如游戏的角色  先定义一个抽象类 然后玩家自己去实现里面的具体的功能类
//提高开发效率