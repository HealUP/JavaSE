package com.viraha.DuoXianCheng.XianchengXiezuo;
//���ԣ�������������ģ��
//���1�����������̷ܳ�
public class PCDemo {
    public static void main(String[] args) {//д����̫��
        SynContainer synContainer = new SynContainer();
        new Producer(synContainer).start();
        new Consumer(synContainer).start();
    }

}

//������
class  Producer extends Thread{
    SynContainer container;//��Ҫһ������
    //������
    public Producer(SynContainer container){
        this.container = container;
    }
    //��������

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("������"+i+"ֻ����");
            container.push(new Chicken(i));//�����������빹���������Ϊid
        }
    }
}

//������
class Consumer extends  Thread{
    SynContainer container;//��Ҫһ������
    //������
    public Consumer(SynContainer container){
        this.container = container;
    }
    //����
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("������"+container.pop().id+"ֻ��");
        }
    }
}

//��Ʒ
class Chicken {
        int id;//��Ʒ�ı��
        //���췽��
        public Chicken(int id){
            this.id = id;
        }

}

//��������
class  SynContainer{
    //��������С
    Chicken[] chickens = new Chicken[10];
    //����
    int count = 0;//�����Ʒ��ʱ���������㼦����Ŀ

    //�����߷����Ʒ��ͬ������ synchronized
    public synchronized void push(Chicken chicken){
        //����ǰ�ж�������û����  ����Ҫ�ȴ�����������
        while (count == chickens.length){////�������жϣ�����if ��while
            //֪ͨ���������ѣ������ȴ�
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            //���û��������Ҫ�����Ʒ������
            chickens[count] = chicken;
            count++;

            //һ�м�������֪ͨ����������
            this.notifyAll();

    }
    //���������Ѳ�Ʒ
    public synchronized Chicken pop(){
        //�ж��ܷ����ѣ���Ҫ�ж������Ƿ�û�������Ƿ�Ϊ��
        while (count == 0){//�������жϣ�����if
            //�ȴ������������������ߵȴ�
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //����������ѣ�
        count--;
        Chicken chicken = chickens[count];
        //�������ˣ�֪ͨ����������
        this.notifyAll();
        return chicken;//���ص���һ�����Ķ��󣬰���һ������id
        //

    }

}


