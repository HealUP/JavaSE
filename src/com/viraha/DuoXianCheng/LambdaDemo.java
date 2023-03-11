package com.viraha.DuoXianCheng;
//Lambda���ʽ  �����ǡ������������ӿڵ�ʵ�����ʵ��
//1�� ����һ������ʽ�ӿڣ�����һ���ӿ�����ֻ��һ�����󷽷�
interface ILove{
    void lambdademo();
}
//2��ʵ����
class Like implements ILove {
    @Override
    public void lambdademo() {
        System.out.println("i like lambda!");
    }
}

//main()
public class LambdaDemo{
    //3�������鷳����������棬����̬�ڲ��� ��һ������ڲ�
    static class Like2 implements ILove{
        @Override
        public void lambdademo() {
            System.out.println("��̬�ڲ��࣡i like lambda!");
        }
    }

    public static void main(String[] args) {

        ILove like = new Like();//�Զ�ת ����ת�� �������Ҫ  �����5�����like�Ķ�����������ģ���������ת��
       /* like.lambdademo();

        Like2 like2 = new Like2();
        like2.lambdademo();
        //4�����鷳���ŵ������У����ֲ�(����)�ڲ��ࣺ ��һ�������ڲ�
        class Like3 implements ILove{
            @Override
            public void lambdademo() {
                System.out.println("�ֲ��ڲ��� i like lambda!");
            }
        }
        Like3 like3 = new Like3();
        like3.lambdademo();*/
//5��Ϊ�˸���㣬��д�����������ڲ���  û��������֣�������� �ӿڣ����߸��࣡
        like = new ILove() {
            @Override
            public void lambdademo() {
                System.out.println("�����ڲ���  i like lambda!");
            }
        };
        like.lambdademo();

//        6.���ռ򻯰棬����ֻ��Ҫһ���ӿڣ�����lambda��

        like = ()->{
            System.out.println("lambda ���ʽ i like lambda��");
        };
        like.lambdademo();

    }

}

