package com.viraha.DuoXianCheng;

//�����̷߳�ʽ2 ʵ��runnable�ӿ�
public class RunnableDemo implements Runnable{
//    ��дrun����
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            System.out.println("����������"+i);
        }
    }
//main���߳�
    public static void main(String[] args) {
//˼·��ִ���߳��ȴ���runnableʵ����Ķ��󣬼�������һ��Thread���󣬷���runnable�ӿ�ʵ���࣬�ٵ���start����
        RunnableDemo runnableDemo = new RunnableDemo();//�ȴ���runnableʵ����Ķ���
        Thread thread = new Thread(runnableDemo);//��������һ��Thread���󣬷���runnable�ӿ�ʵ����
        thread.start();//�ٵ���start����
        /*�������д�����Լ�дΪ��
        new Thread(runnableDemo).start();
         */

        for (int i = 0; i < 100; i++) {
            System.out.println("���߳�"+i);
        }

    }
}
