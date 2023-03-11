package com.Heimajinjie.Jihe.Map;

import java.util.*;

/*
* Collection�ӿ�
*
* Map�ӿڣ�
*        HashMap:��Ҫʵ���� ʵ����Map�ӿ�
*        LinkedHashMap������ά��
*          1��Hashmap ��key ʹ��set����ŵģ������ظ� value �����ظ� ��Collection����ŵ�
*        һ��key-value�ԣ���һ��Entry,���е�Entry����Set��ŵģ�Ҳ�ǲ����ظ���
*         2����HashMap�����Ԫ��ʱ�������key�������equals�������ж�����key�Ƿ���ͬ������ֻͬ����Ӻ���ӽ�ȥ���Ǹ�Ԫ��(��ͼ��map02)��
*
������1��put(Object a,Object b) ���Ԫ��
* 2��remove(Object a)ɾ�� ����keyɾ�� entry
* 3��get(Object a) ����key��ȡָ��valueֵ */
public class TestHashMap {
    public static void main(String[] args) {
        new TestHashMap().test02();

    }
    public void test01(){
        Map map = new HashMap();//��̬ ��������ָ���������
        map.put("ss",33);
        map.put("s",33);
        map.put("s",33);//Hashmap key ʹ��set����ŵģ������ظ� ��value��Collection��ŵģ����ظ�
        map.put(34,33);
        map.put("ssa","dd");
        map.put(null,null);
        map.put(new Person("zhangsan","20"),2000);
        map.put(new Person("zhangsan","20"),2009);//�����Զ�����Ķ���Ҫ��д�������equal�� hashcode ���� map02
        System.out.println(map.size());
        System.out.println("ԭ���ģ�"+map);
        //��Object���ͣ��浽value,ֱ�� System.out.println(map.get(34));Ҳ��
        System.out.println("remove(Object a)ɾ��,����keyɾ������entry��");
        map.remove("s");
        System.out.println("ɾ����"+map);//����
        // System.out.println("����key�����ָ����valueֵ:");
        System.out.println("����key�����ָ����valueֵ��");
        Object value = map.get(34);//����key�����ָ����valueֵ
        System.out.println(map.get(34));
        System.out.println("�Ƿ������value��");
        boolean a = map.containsValue(2009);//�Ƿ���� ��value ture OR False
        System.out.println(a);
        System.out.println("�Ƿ������key��");
        boolean b = map.containsKey(new Person("zhangsan","20"));//�Ƿ���� ��key ture OR False
        System.out.println(b);
    }
    //��α���map
    /*1�������е�key  key��
    * 2�������е�*/
    public void test02(){
        //���map��Ԫ��
        Map map = new HashMap();//��̬ ��������ָ���������
        map.put("ss",33);
        map.put("s",33);
        map.put("s",33);//Hashmap key ʹ��set����ŵģ������ظ� ��value��Collection��ŵģ����ظ�
        map.put(34,33);
        map.put("ssa","dd");
        map.put(null,null);
        map.put(new Person("zhangsan","20"),2000);
        //1���������е�key  key����key��Set���͵ģ�Set���� ��ӡ������key��ֵҲ�������
        Set set = map.keySet();
        //��ǿforѭ��������Ҳ��for eachѭ������Iterator����Ҳ��
        System.out.println("1���������е�key����");
        for (Object obj:set) {
            System.out.println(obj);
        }
        //2���������е�value����value��collection���͵�
        Collection collection = map.values();
        System.out.println("2���������е�value����");
        //Iterator����
        Iterator iterator = collection.iterator();//��ȡiterator����
        while (iterator.hasNext()){
            Object o = iterator.next();//��ȡ������
            System.out.println(o);
        }

        //2���������е�Entry��key-value�� ����1��ͨ��keySet()�ҵ�key,ͨ��get(key)�ҵ�value
        System.out.println("<3���������е�Entry��key-value�� >����1��ͨ��keySet()�ҵ�key,ͨ��get(key)�ҵ�value");
        Set set1 = map.keySet();//�ҵ�key
        for (Object obj2:set1) {
            System.out.println(obj2+"----->"+map.get(obj2));
        }
        System.out.println("<3���������е�Entry��key-value�� >����2��ͨ��entrySet()����");
        //entry�Ǵ����Set���еģ�Set����
        Set set3 = map.entrySet();
        for (Object ob:set3
             ) {
            Map.Entry entry = (Map.Entry)ob;//ǿת
            System.out.println(entry.getKey()+"---->"+entry.getValue());
//            System.out.println(entry);ֱ�Ӵ�ӡҲ��

        }
    }
}
