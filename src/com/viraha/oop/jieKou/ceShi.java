package com.viraha.oop.jieKou;
//测试类
public class ceShi {
    public static void main(String[] args) {
        UserServiceImpl userService1 = new UserServiceImpl();
        userService1.delete("这是重写了接口的方法！");
        userService1.add("这是重写了接口的方法！");
        userService1.query("这是重写了接口的方法！");
        userService1.update("这是重写了接口的方法！");
        userService1.timer();
    }
}
