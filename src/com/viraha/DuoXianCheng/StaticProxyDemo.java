package com.viraha.DuoXianCheng;
//静态代理模式总结 总思路就是，你要结婚，找人帮你去让你结婚，只需要传入代理类就行
/*1、真实对象和代理对象都要实现同一个接口
* 2、代理对象代理真实角色
* 3、代理对象可以做很多真实对象做不了的事情，真实对象专注于做自己的事
* */
public class StaticProxyDemo {
    public static void main(String[] args) {

        //实现多线程，实现Runnable接口   外面的代理给里面的真实对象做事，代理和真实对象都实现了同一个接口 如： Thread 和new Runnable()都实现了Runnable接口
    /*    new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("i love you!");
            }*/
        //lambda表达式 jdk8 新特性
           new Thread(()->System.out.println("i love you")).start();
       //会运行重写的run()方法
       // You you = new You();
        WeddingCommpany weddingCommpany = new WeddingCommpany(new You());//匿名对象 传入到代理中
        weddingCommpany.GetMarry();//调用的是婚庆公司，但是结婚的是you
        /* 将上面两行代码简化成一行代码：new WeddingCommpany(new You()).GetMarry()*/
    }

}
//定义一个结婚的接口
interface Marry{
    void GetMarry();
}

//真实角色 实现接口
class You implements Marry{
    //真实角色专注于做自己的事情
    @Override
    public void GetMarry() {
        System.out.println("you结婚了！很开心！");
    }
}
//代理角色 婚庆公司 实现接口
class WeddingCommpany implements Marry{
    private Marry target;//对象类型的target,（new You() 匿名对象的传入）
    //构造方法
    public WeddingCommpany(Marry target) {
        this.target = target;
    }

    //重写方法  该方法封装了真实对象的request方法
    @Override
    public void GetMarry() {
        before();//添加了真实代理没有的方法
        target.GetMarry();//调用的是 代理类
        after();//添加了真实代理没有的方法
    }
    private void before() {
        System.out.println("结婚之前,筹备婚礼！");
    }
    private void after() {
        System.out.println("结婚之后，交付尾款！");
    }


}
