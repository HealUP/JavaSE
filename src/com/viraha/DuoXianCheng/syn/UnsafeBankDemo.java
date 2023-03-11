package com.viraha.DuoXianCheng.syn;
//������ ����ȫ��ȡǮ
public class UnsafeBankDemo {
    public static void main(String[] args) {
        Account account = new Account(1000,"��");//���ù��췽������ʼ��
        Drawing me = new Drawing(account,50,"��");
        Drawing she = new Drawing(account,100,"��");
        //�����߳�
        me.start();
        she.start();
    }

}

//�˻� ����
class Account{
    int money ;//���
    String name;//����
    // ���췽��
    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//����:ģ��ȡ��

class Drawing extends Thread{
    Account account;//���ȣ���Ҫһ���˻�
    //ȡ�˶���Ǯ
    int drawingMoney;
    //���ﻹ�ж���Ǯ
    int nowMoney;

    //���췽��
    public Drawing(Account account,int drawingMoney,String name){
        //���ø�����вι���
        super(name);//���������д�˸���ķ�������Ҫ���ø�������Ի��߷�������Ҫ�õ�super
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    //��дrun���� ȡǮ
    @Override
    public void run() {

        //�߳�ͬ���� sychrnoized
        synchronized (account){
            //ȡǮ֮ǰ��Ҫ�ж���û��Ǯ  �տ�ʼ������������100
            if (account.money-drawingMoney <0){
                //��ʾ�� ���߳�ȡ����Ǯ
                System.out.println(Thread.currentThread().getName()+"�����㣬�޷�ȡǮ��");
                return;
            }

            //ģ����ʱ ����һ��  �����ȵȴ�
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //����� = ��� - ȡ��Ǯ
            account.money = account.money - drawingMoney;
            //�����Ǯ
            nowMoney = nowMoney + drawingMoney;
            //��ӡһ��
            System.out.println(account.name+"�����Ϊ��"+account.money);
            System.out.println(this.getName()+"�����Ǯ��"+nowMoney);
        }

    }
}