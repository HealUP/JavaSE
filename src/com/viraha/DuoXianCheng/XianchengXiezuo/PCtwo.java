package com.viraha.DuoXianCheng.XianchengXiezuo;
//�������������������� ͨ����־λ��� �źŵƷ�������������һ��flag  ��־λ��
public class PCtwo {
    public static void main(String[] args) {
        Tv tv = new Tv();
        new Player(tv).start();
        new Watcher(tv).start();

    }

}
//�������߳�
//������ ��Ա
class Player extends  Thread{
    Tv tv ;//�����ߺ������߶���Ҫ����һ��TV�Ķ���������Tv�ķ���������
    //���췽��
    public Player(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                this.tv.play("�����������ڲ�����.....");
            }else {
                this.tv.play("��沥���У�������ڲ�����ѽ����������ϰ׽�");
            }
        }
    }
}


//������ ����
class Watcher extends Thread{
    Tv tv ;
    //���췽��
    public Watcher(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            tv.watch();//����ֻ�ܿ�
        }
    }
}

//��Ʒ ��Ŀ
class Tv {
    //��Ա���ݣ����ڵȴ�
    //���ڹۿ�����Ա�ȴ�
    String voice;//���ݵĽ�Ŀ
    boolean flag = true;//��־λ ��ʼ��Ϊtrue

    //����
    public synchronized void play(String voice){
        if (!flag){//��Ϊ�٣���ʱ�������ڹۿ�����ԱҪ�ȴ�
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("��Ա:"+voice);
        //��Ա�����֪꣬ͨ���ڹۿ�
        this.notifyAll();//֪ͨ����
        this.voice = voice;//����
        this.flag = !this.flag;//ȡ��

    }

    //�ۿ�
    public synchronized void watch(){
        if (flag){//��Ϊ�棬��ʱ��Ա���ڱ��ݣ�����Ҫ�ȴ�
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            System.out.println("���ڹۿ�:"+voice);
            //�ۿ��֪꣬ͨ��Ա����
            this.notifyAll();
            this.flag = !this.flag;//ȡ�� ���±�־λ



    }

}