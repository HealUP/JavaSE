package com.viraha.oop.Neibul;
/*��Ա�ڲ�����ʾ*/

//���ȶ���һ���ⲿ��
class Outer{
    private int id = 24;
    void test01(){
        System.out.println("�ⲿ���Ա������");
    }

//����һ���ڲ��࣬����������
class Inner{
        int n = 2;
        void show01(){
            //�ڲ���ķ�����,�����ⲿ��ĳ�Ա����
            System.out.println(id);
        }
        void show02(){

        }
}
//�ڲ������ⲿ����ʹ�ã����ʳ�Ա�ڲ���ĳ�Ա����
    void test02(){
        Inner inner = new Inner();//���� Outer outer = new Outer(); Outer.Inner inner = outer.new Inner();
        System.out.println("�ڲ���Ա����"+inner.n);
    }
}

public class Application {
    public static void main(String[] args) {
        //�ⲿ������ڲ��࣬Ҫͨ���ⲿ�ഴ���ڲ������
        Outer.Inner inner = new Outer().new Inner();
        //�ֱ�����ڲ���ĳ�Ա�Լ�����
        System.out.println(inner.n);
        inner.show01();
    }
}
