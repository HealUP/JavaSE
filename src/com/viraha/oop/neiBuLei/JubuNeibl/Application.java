package com.viraha.oop.neiBuLei.JubuNeibl;
/*�ֲ��ڲ��ࣨҲ�Ʒ����ڲ��ࣩ��ʾ*/
//���ȶ���һ���ⲿ��
class Outer{
    int m = 2;//�ⲿ��ĳ�Ա����
    void test01(){
        System.out.println("�ⲿ��ĳ�Ա������");
    }
    void test02(){
        //����ֲ��ڲ���
        class Inner{
            int n = 1;
            void show(){
                //�ھֲ��ڲ���� ������ �����ⲿ��ĳ�Ա��������Ա����
                System.out.println("�ⲿ��ĳ�Ա����m="+m);
                test01();
            }
        }
        //��ô����η��ʾֲ��ڲ����еķ����ͳ�Ա�����أ�Ҫ������test02���������������з���
        Inner inner = new Inner();
        System.out.println("�ֲ��ڲ���ĳ�Ա������"+inner.n);
        inner.show();
    }
}

public class Application {
    public static void main(String[] args) {
        //ͨ�������ⲿ����������ʾֲ��ڲ��෽�������� �Լ������ⲿ��ķ����ͱ���
        Outer outer = new Outer();
        outer.test02();
    }
}
