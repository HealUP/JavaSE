package com.viraha.DuoXianCheng.syn;

//������1 ����ȫ����Ʊ
public class UnsafeBuyTickerDemo {
    public static void main(String[] args) {
        BuyTicket buyTicket = new BuyTicket();
        //����̷߳���ͬһ������
        new Thread(buyTicket,"��ţ1").start();
        new Thread(buyTicket,"��ţ2").start();
        new Thread(buyTicket,"��ţ3").start();
    }
}

//��Ʊ�ӿ�ʵ����
class BuyTicket implements Runnable{
    //����Ʊ������
    private int numbers = 10;
    boolean flag = true;//ֹͣ��ʶ
    @Override
    public void run() {
        //��дrun������������Ʊ����
        while (flag){
            try {//��������������׳��쳣�ķ��� buy()������Ҫ����  ʹ��try...catch
                buy();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //������Ʊ����
    private synchronized void buy() throws InterruptedException {
        //���ж� numbers���Ƿ���Ʊ
        if (numbers<=0){
            flag = false;
            return;
        }
        //ģ����ʱ
        Thread.sleep(10000);
        //��Ʊ
        System.out.println(Thread.currentThread().getName()+"������"+numbers--+"��Ʊ��");

    }
}
