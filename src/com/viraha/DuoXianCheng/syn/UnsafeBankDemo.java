package com.viraha.DuoXianCheng.syn;
//案例二 不安全的取钱
public class UnsafeBankDemo {
    public static void main(String[] args) {
        Account account = new Account(1000,"存款卡");//利用构造方法，初始化
        Drawing me = new Drawing(account,50,"我");
        Drawing she = new Drawing(account,100,"她");
        //启动线程
        me.start();
        she.start();
    }

}

//账户 父类
class Account{
    int money ;//余额
    String name;//名字
    // 构造方法
    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//银行:模拟取款

class Drawing extends Thread{
    Account account;//首先，需要一个账户
    //取了多少钱
    int drawingMoney;
    //手里还有多少钱
    int nowMoney;

    //构造方法
    public Drawing(Account account,int drawingMoney,String name){
        //调用父类的有参构造
        super(name);//如果子类重写了父类的方法，还要调用父类的属性或者方法，就要用到super
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //重写run方法 取钱
    @Override
    public void run() {

        //线程同步块 sychrnoized
        synchronized (account){
            //取钱之前，要判断有没有钱  刚开始进来，都还有100
            if (account.money-drawingMoney <0){
                //提示该 子线程取不了钱
                System.out.println(Thread.currentThread().getName()+"的余额不足，无法取钱！");
                return;
            }

            //模拟延时 捕获一下  进来先等待
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //卡余额 = 余额 - 取的钱
            account.money = account.money - drawingMoney;
            //手里的钱
            nowMoney = nowMoney + drawingMoney;
            //打印一下
            System.out.println(account.name+"存款卡余额为："+account.money);
            System.out.println(this.getName()+"手里的钱："+nowMoney);
        }

    }
}