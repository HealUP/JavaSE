package com.viraha.DuoXianCheng;

import java.text.SimpleDateFormat;
import java.util.Date;

//������ʾ ����һ��ģ�⵹��ʱ
public class SleepDemo02{
    public static void tenDown() throws InterruptedException {//sleep�����׳��쳣
      /*  //ʱ���� 10
        int num = 10;
        while (true){
            Thread.sleep(1000);
            System.out.println(num--);
            if (num<=0) break;
        }
*/
    }

    //main()���߳�
    public static void main(String[] args) {
        //��tenDown��Ϊ��̬static,����ֱ�ӵ��÷�����������Ҫͨ����������������
        //����һ���׳����쳣
       /* ����1��
       try {
            tenDown();//���÷���
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        Date startTime = new Date(System.currentTimeMillis());//��ȡ��ǰϵͳʱ��
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));//��ӡʱ�䣬ʱ���ʽ������:SimpleDateFormat("HH:mm:ss")
                startTime = new Date(System.currentTimeMillis());//�ٴλ�ȡ��ǰϵͳʱ�䣬������ʱ�� ��ǰϵͳʱ���ǻ᲻�ϸı�ģ����������һ�䣬��ÿ��һ���ӡһ�ε�һ�λ�ȡ��ϵͳʱ����
                } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
