package com.viraha.DuoXianCheng.syn;
/*并发：多个线程访问同一个对象   修改->线程同步->等待池形成 ->队列
队列+锁=>安全性  安全和性能
每个对象都有一个锁，锁的弊端：性能倒置问题*/
//同步块和同步方法，要确定锁的是那个对象（要找变化的量）：synchronized同步方法默认锁的是类本身，同步块可以锁任何对象
public class SynDemo {

}
