package com.viraha.DuoXianCheng;

//�߳�ֹͣ ����stop
public class StopDemo implements Runnable {
//1������һ����ʶλ
    private boolean flag = true;
//��д��run()����ֻ������i,��Ҫֹͣ�Ļ�����дһ��stop��������main()����������ֹͣ
    @Override
    public void run() {
        int i = 0;
        while (flag){
            System.out.println("running...Thread"+i++);
        }
    }
//2������һ�������ķ�����ת����ʶλ

    public void stop(){
        this.flag = false;
    }
//main���߳�
    public static void main(String[] args) {
        StopDemo stopDemo = new StopDemo();
        new Thread(stopDemo).start();//����ֻҪflagΪtrue�ͻ�һֱѭ������������i
        //�趨iΪ500ʱ���̵߳���stop()�������ñ��ʶλ  �߳�ֹͣ
        //��Ϊʱ�̣߳�for����new Thread(stopDemo).start()��ͬʱ����
        for (int i = 0; i < 1000; i++) {
            System.out.println("mian��i="+i);
            if (i==500){
                stopDemo.stop();
                System.out.println("���߳�ֹͣ�ˣ�");
            }
        }

    }
}
