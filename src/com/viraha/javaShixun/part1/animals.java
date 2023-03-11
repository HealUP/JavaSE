package com.viraha.javaShixun.part1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class animal{
    public void sleep(){
        System.out.println("睡觉！");
    }

    public void eat(){
        System.out.println("我会吃饭!");
    }
    public  void move(){
        System.out.println("我能运动！");
    }
}

class dark extends animal{
    public void fly(){
        System.out.println("flying！");
    }
}

class lion extends animal{
    public void eatMeat(){
        System.out.println("只有我会吃肉！");
    }

}

public class animals  {
    public static void main(String[] args) {
        dark dark1 = new dark();
        System.out.println("动物：鸭子");
        dark1.fly();dark1.eat();dark1.move();dark1.sleep();
        System.out.println("动物：狮子");
        lion lion1 = new lion();
        lion1.eatMeat();
        lion1.eat();
        lion1.move();
        lion1.sleep();
        dog dog1 = new dog();
        System.out.println("动物：狗");
        dog1.eat();
        dog1.move();
        dog1.sleep();
        dog1.shout();
    }
}
