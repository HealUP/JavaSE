package com.viraha.DuoXianCheng;

/* 2022.7.4����lambda�������գ�lambda����  ˼·�����գ��ȶ���һ���ӿڣ�Ȼ��дһ��ʵ���࣬�任����λ��
�γ� 1��̬�ڲ��� 2�ֲ��ڲ��� 3�����ڲ��� 4lambda���ʽ����һ��⣡ ���ü��Σ�*/
public class LambdaDemo02 {

        public static void main(String[] args) {
          class Love implements I {
                @Override
                public void love(int a) {
                    System.out.println("i love you " + a);
                }
            }
            I love = new Love();
            // ����ת��  �����ǽӿ�I
            /* I love = new I() {
                @Override
                public void love(int a) {
                    System.out.println("i love you " + a);
                }
            };
            love.love(2);*/
            //6.�򻯰棬����ֻ��Ҫһ���ӿڣ�����lambda��
            /*I love = (int a)->{
                System.out.println("i love you " + a);
            };*/
            //�������ڵĲ�����lambda���ʽ
            /*love = (a)->{
                System.out.println("i love you " + a);
            };
            love.love(5201314);
            * */
            //���������ţ�lambda���ʽ
           /* love = a->{
                System.out.println("i love you " + a);
            };
            love.love(5201314);*/
            //��Ϊֻ��һ����䣬���Կ��Լ����򻯻����ţ�lambda���ʽ
            love = a->
                System.out.println("i love you " + a);
                love.love(5201314);

                /*�ܽ᣺
                * 1��һ����䣬����ʡ�Ե������ţ�������Ҫ�ô�������
                * 2��ʹ��lambda���ʽ��ǰ���ǣ��ӿ�Ϊ����ʽ�ӿ� (һ���ӿڣ�ֻ��һ������������ת�ͣ�ʵ��������������lambda���ʽ)
                * 3�����������Ҳ����ȥ����������*/
        }
    }

interface I{
    void love (int a);

};

