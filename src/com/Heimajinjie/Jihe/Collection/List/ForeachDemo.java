package com.Heimajinjie.Jihe.Collection.List;

import java.util.ArrayList;

public class ForeachDemo {
    public static void main(String[] args) {
        //�����ԣ�ֻ�ܷ��ʼ����е�Ԫ�أ����ܽ����޸�
        //Ҳ��Ϊ��ǿforѭ��
        ArrayList<Object> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("v");
        list.add("h");
        for (Object obj:list) { //Ԫ������  ��ʱ����  ��������
            System.out.println(obj);
        }
    }
}
