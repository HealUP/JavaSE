package com.Heimajinjie.JavaApi.Date;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

//Random��
/*���÷���
* 1�����췽��
* 2��ָ����Χ��nextInt(int n)
* 3����ָ����Χ��nextInt()
* 4����ָ����Χ��nextFloat()
* 5����ָ����Χ��nextDouble()*/
public class TestRandom {
    //�޲ι��췽��
    public static void main(String[] args) {
        Random rt = new Random();//����������
        //�������2��[0,59��������������59
        for (int i = 0; i < 2; i++) {
//            System.out.println("�������"+rt.nextInt(59));//[0,59��

            //�вι���
            Random r = new Random(2);
            for (int i1 = 0; i1 < 2; i1++) {
                System.out.println("�������"+r.nextInt(59));//����һ���������  ��Ϊ����������
            }
        }

    }
}
