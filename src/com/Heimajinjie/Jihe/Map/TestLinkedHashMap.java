package com.Heimajinjie.Jihe.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//��ȡ˳��һ�£�ʹ������ά����ӽ�Map�е�˳�򣬹ʱ���Mapʱ���ǰ������˳������ġ�
public class TestLinkedHashMap {
    public void test03(){
        Map map = new LinkedHashMap();//��̬ ��������ָ���������
        map.put("ss",33);
        map.put("s",33);
        map.put("s",33);//Hashmap key ʹ��set����ŵģ������ظ� ��value��Collection��ŵģ����ظ�
        map.put(34,33);
        map.put("ssa","dd");
        map.put(null,null);
        map.put(new Person("zhangsan","20"),2000);
        //��ӡ��ֵ��
        Set set = map.keySet();
        System.out.println("��ӡ��ֵ��:=========");
        for (Object j :set) {
            System.out.println(j+"--->"+map.get(j));
        }
    }

    public static void main(String[] args) {

        new  TestLinkedHashMap().test03();
    }


}
