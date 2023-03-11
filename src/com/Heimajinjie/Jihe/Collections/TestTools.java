package com.Heimajinjie.Jihe.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Collection�������ϵĹ����ࣺcollections������ķ����Ǿ�̬�ģ�����ͨ����.������
/*���÷�����
---����List���ϵ�
* 1��reverse(List) ��ת
* 2��shuffle(List)
*3��sort(list):��Ȼ˳��
*4��sort(List,comparator)��ָ����comparator����
*5��swap(List,int,int):int:ָ��λ��
----------
*/
public class TestTools {
    public void test07(){
        //ArrayList()
        List list = new ArrayList();
        list.add(34);
        list.add(54);
        list.add(36);
        list.add(74);
        list.add(32);
        list.add(32);//���ظ���
        System.out.println(list);
        //��ת
        Collections.reverse(list);
        System.out.println("��ת���list��");
        System.out.println(list);
        //�������
        System.out.println("������е�list��");
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("��Ȼ˳�����е�list��");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("ָ��˳�����е�list(������ָ����Comparator)��");
//        Collections.sort(list);//
        System.out.println("����list��");
        Collections.swap(list,2,0);//������λ�ú͵�һ������
        System.out.println(list);
    }

    public void test08(){

    }

    public static void main(String[] args) {
//        new TestTools().test07();
        new TestTools().test08();
        //ArrayList()
        List list = new ArrayList();
        list.add(34);
        list.add(54);
        list.add(36);
        list.add(74);
        list.add(32);
        list.add(32);//���ظ���

        //�ҳ����Ԫ��
        Object object = Collections.max(list);
        System.out.println(object);
        //�ҳ���С��Ԫ��
        Object obj = Collections.min(list);
        System.out.println(obj);
        //����ĳ��Ԫ�س��ֶ��ٴ�
        int count = Collections.frequency(list,32);
        System.out.println(count);
        //ʵ��list�ĸ���
        //����ķ�����List list1 = new ArrayList();
        //��ȷ�ķ�����
        List list1 = Arrays.asList(new Object[list.size()]);//����һ����listһ����Ŀռ�

        System.out.println("ԭʼ��"+list);
        System.out.println("����ǰ����Ϊnull");
        System.out.println(list1);
        System.out.println("���ƺ�");
        Collections.copy(list1,list);//(���ո��ƣ�����Դ)
        System.out.println(list1);

        System.out.println("ȫ����Ҫ�滻��ָ��ֵ���������" );
        Collections.replaceAll(list1,34,39);
        System.out.println(list1);
    }
}

