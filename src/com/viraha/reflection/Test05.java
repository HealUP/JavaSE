package com.viraha.reflection;
//��ʲôʱ�򱻳�ʼ��

/*
* 1.��������  ����һ������
* 2.����Ҳ�������������
* 3.����һ����̬�����������������ᱻ��ʼ��
* =======����������õķ���=====
* 1.���ø��ྲ̬���Ի򷽷�������Sonδ������
* 2.ͨ�����鶨�������ã����ᷢ������ĳ�ʼ��
* 3.���ó�����*/
public class Test05 {
    static {
        System.out.println("main�౻����");
    }

    public static void main(String[] args) throws ClassNotFoundException {
       // Son son = new Son();//��������  ����һ������

        //����Ҳ�������������
        // Class.forName("com.viraha.reflection.Son");

        //����������õķ���
        //���ø��ྲ̬���Ի򷽷�������Sonδ������
//        System.out.println(Father.b);

        //����
//        Son [] array = new Son[6];//ֻ����main��
       //���ó�����
//       System.out.println(Son.M);
        System.out.println(Son.b);
    }


}

class Father {
    static int b = 2;
    static  {
        System.out.println("���౻����");
    }
}

class Son extends Father{
    static {
        System.out.println("���౻����");
        m = 300;
    }
    static int m = 100;
    static final int M = 1;
}