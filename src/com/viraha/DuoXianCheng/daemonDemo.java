package com.viraha.DuoXianCheng;
//�ػ��߳�  �û��̺߳��ػ��̣߳�main,gc���������̣߳�
//������̫����Զ�����ŵ���
//������������
public class daemonDemo {
    public static void main(String[] args) {
        //�����ӿڵ�ʵ����Ķ���
        Sun sun = new Sun();
        Earth earth = new Earth();
        //����ӿڵ�ʵ����Ķ���
        Thread t1 = new Thread(sun);
        t1.setDaemon(true);//ͨ��setDaemon(true)�������ػ��߳�  Ĭ����false��Ϊ�û��߳�
        t1.start();//̫���ػ��߳�����


        /*Thread t2 = new Thread(earth);
        t2.start();*/
        //��дΪ
        new Thread(earth).start();//�����û��߳�����
    }

}


    //̫��
 class Sun implements Runnable {
    @Override
    public void run() {
        while (true)
            System.out.println("̫��ɢ���Ź�â����");
    }
}


    //����
    class Earth implements Runnable {
        @Override
        public void run() {
            //����ʼ��Ҳ���������һ��ʱ��
            for (int i = 0; i < 10; i++) {
                System.out.println("����ת��" + i + "������");
            }
            System.out.println("==========�������===========");
        }
    }
//�ػ����̣���������õȴ��ػ�����ִ����ϣ��û�����ִ����ϣ�������ͻ�ر��ˡ�
// ����ػ����̻�ִ����һ�ᣬ����Ϊ������ر�Ҳ��Ҫһ����ʱ�䣡

