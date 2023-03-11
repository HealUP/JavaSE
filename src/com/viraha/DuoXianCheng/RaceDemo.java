package com.viraha.DuoXianCheng;
//ģ���������
public class RaceDemo implements Runnable {
    //ʤ����ֻ��һ������static
    private static String winner;
    //��дrun()
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            //��ǰ�߳������ӵ�ʱ��ÿ10��������Ϣ�ᣬ���ڹ��߳�����
            if (Thread.currentThread().getName().equals("����")&&i%10==0){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //�жϱ����Ƿ����
            Boolean flag = gameOver(i);
            if (flag){//Ϊtrue�����������,�˳�����
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->>����"+i+"��");
        }
    }
    //�ж��Ƿ���ɱ���
    private boolean gameOver(int steps) {
        //�ж�ʤ�����Ƿ����

        if (winner != null) {//˵������ʤ������
            return true;
        }
        {
            if (steps >= 100) {
                winner = Thread.currentThread().getName();//��ȡ��ǰ�̵߳�����
                System.out.println("winner is " + winner);
                return true;
            }
        }
        return false;
    }


    //main()���߳�
    public static void main(String[] args) {
        RaceDemo raceDemo = new RaceDemo();
        new Thread(raceDemo,"����").start();
        new Thread(raceDemo,"�ڹ�").start();
    }
}
