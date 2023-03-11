package com.Heimajinjie.Fanxing;
/*���ͣ�1���ڼ�����ʹ�÷��� ����
       2���Զ��巺���ࡢ���ͽӿڡ����ͷ���
       3��������̳еĹ�ϵ
       4��ͨ���*/
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;


public class TestGeneric {
    /*1��������û��ʹ�÷��͵������:�κ�Object��������Ķ��󶼿�����ӽ���
     *2�����;��ǣ�����ӵ������еĶ���������͵�����

    * */
  /*  public void test01(){
        List list = new ArrayList();
        list.add(1);
        list.add(5);
        list.add(13);
        list.add(12);
        //��ͼ���String���͵�
        list.add(new String("aaaa"));

        for (int i = 0; i < list.size(); i++) {
            int score = (Integer)list.get(i);//��ȡָ��λ�õ�Ԫ�� ����
            System.out.println(score);//����  calssCastExeption ����ת���쳣
        }
    }
*/
    public void test02(){
        //1.1��ʹ�÷��͵�����£��������ƴ���ü��ϵ�Ԫ������ʱInteger
        List<Integer> list = new ArrayList<Integer>();
        list.add(96);
        list.add(94);
        list.add(96);
        //ʹ��Iterator����������
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }

    public void test03(){
        //1.2��Map����Ϊ����,�����ࣺHashMap��ʹ�÷���
        Map<String,Integer> map = new HashMap<String,Integer>();//String,Integer���Բ�д
        map.put("aa",452);
        map.put("bb",453);
        map.put("cc",454);

        //������ͨ��entrySet()����
        Set<Map.Entry<String,Integer>> set = map.entrySet();//Set������
        for (Map.Entry<String,Integer> me:set) {//��ǿforѭ��
            System.out.println(me.getKey()+"--->"+me.getValue());//�Զ����ӡ
        }
    }

    //        2���Զ��巺�����ʹ��
    //ע�⣺1����ʵ����������Ķ���ʱ��Ҫָ�����͵�����
    //     2����������˷����࣬������ʵ������ʱ��û��ʹ�÷��ͣ���ô����Ĭ�����ͣ���Object��ģ��ͼ����е�ʹ����һ���ġ�
    public void test04(){//����һ��Boolean���͵�Ԫ��
        Order<Boolean> order = new Order<>();//Orderû�ж���ʵ�ֵĽӿڣ�new Order<>()����.
        order.setT(true);
        System.out.println(order.getT());
        order.add();//��boolean��ֵ��ӵ�list�У����Զ���ķ���
        List<Boolean> list1 = order.list;//���� true
        System.out.println(list1);


    }
    private void test05() {
        //2.1�̳з������ӿ�ʱ�����Կ���List<E> extends Collection<E>
        //�Ѿ�ָ������Integer���͵���
        Order order = new Order();
        order.add();//���������6���Ԫ��
        List<Integer> list2 = order.list;//����List<T> list = new ArrayList<T>()������һ������
        System.out.println(list2);
        //���ͷ�����ʹ��
        //��ͨ��������÷��ͷ���ʱ��ָ�����ͷ���������
//       Integer i = order.getC(34);
//        Double d = order.getC(2.3);




    }
    private void test06(){
        //ʵ�����鵽���ϵĸ���
        Integer[] in = new Integer[]{1,2,4,66};
        List<Integer> list1 = new ArrayList<>();
        Order order = new Order();
       List<Integer> list3 = order.fromArrayToList(in,list1);
        System.out.println(list3);
    }
//3��������̳еĹ�ϵ(ͨ���������) 4��ͨ����� �����������ŵ����� дΪ? List<?> :List<A>,List<B>��List<C>......����List<?> ������
/*
* */
    private void test07(){
      List<String> list1 = new ArrayList<>();
      List<?> list = null;
      list = list1;//��Ϊ�������࣬���п�������


    }
    private void test08(){//���Զ�ȡ����Ϊͨ����ļ�����Ķ��󣺵���Object��������
       List<String> list = new ArrayList<>();
       list.add("aaa");
       list.add("gbb");
       list.add("ddd");
       List<?> list2 = list;//list����list2
       //����������
        Iterator<?> it = list2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
    public static void main(String[] args) {
//        new TestGeneric().test01();
//        new TestGeneric().test02();
//        new TestGeneric().test03();
//        new TestGeneric().test04();
//        new TestGeneric().test05();
//        new TestGeneric().test07();
          new TestGeneric().test08();
    }


}
