package com.viraha.oop.TeXing;
//父类
public class person {
/*public(权限最高)
protected
default
praviate

子类可以继承父类的方法 一般用【public
如果用private 要提供get set方法 接口

* */

    private int money=1000_0000;//私有

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void say(){
    System.out.println("继承！");

}

}
