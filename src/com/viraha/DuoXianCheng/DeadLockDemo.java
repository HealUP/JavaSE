package com.viraha.DuoXianCheng;

import com.viraha.oop.TeXing.B;

//����������̻߳��౧�ŶԷ���Ҫ����Դ���γɽ���
public class DeadLockDemo {
    public static void main(String[] args) {
        Eating eating = new Eating(0,"����");
        Eating eating2 = new Eating(1,"����");
        eating.start();
        eating2.start();
    }
}


//����
class Chopsticks{

}

//��
class Bowl{

}

//�Է�
class Eating extends Thread {
    //��Ҫ����Դֻ��һ�ݣ�static��ֻ֤��һ��
    static Chopsticks chopsticks = new Chopsticks();
    static Bowl bowl = new Bowl();

    int choice;//ѡ��
    String peopleName;//�Է�����

    //���췽��
    Eating(int choice, String peopleName) {
        this.choice = choice;
        this.peopleName = peopleName;
    }
    //��дrun��������

//��дrun()������Է��ķ��� toEat()
    @Override
    public void run() {
        try {//�����쳣
            toEat();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        //�Է��ķ��� �׳��쳣
    public void toEat() throws InterruptedException {
        //�Է���������жԷ�����
        if (choice == 0) {
            synchronized (chopsticks) {//��ÿ��ӵ���
                System.out.println(this.peopleName + "��ÿ��ӵ����ˣ�");
                //1������������
                Thread.sleep(1000);
            /*    synchronized (bowl) {//��������
                    System.out.println(this.peopleName + "���������ˣ�");
                }  ȡ��������*/
            }
            synchronized (bowl) {//��������
                System.out.println(this.peopleName + "���������ˣ�");
            }

        } else{
            synchronized (bowl){
                System.out.println(this.peopleName + "���������ˣ�");
                //2������������
                Thread.sleep(2000);
                /*synchronized (chopsticks) {//��������
                    System.out.println(this.peopleName + "��ÿ��ӵ����ˣ�");
                }*/
            }
            synchronized (chopsticks) {//��������
                System.out.println(this.peopleName + "��ÿ��ӵ����ˣ�");
            }
        }
    }
    }

    //������������ԭ�� ������ÿ��ӵ���֮���ͷſ��ӣ��ٵȴ����ݰ����ͷţ������ٻ���룬���ݾͻ�ÿ�����