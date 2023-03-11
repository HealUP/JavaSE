package com.Heimajinjie.Jihe.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*����1����Ȼ���򣺰�����ӽ�Map�е�Ԫ�ص�key��ָ�����Խ�������Ҫ��key������ͬһ����Ķ���
ʵ��Comarable�ӿڵ�ʵ���࣬����Ķ���Ҫ��дcompareTo���� ����TreeMap���Customer��Ķ���ʱ�����ݴ˷�����ȷ�������ĸ��������С�
2����������ʵ��Comparator�ӿڲ���дcompare�������� */
public class TestTreeMap {
    //1����Ȼ����
    public void test04() {
        Map map = new TreeMap();
        map.put(new Person("aa", "24"), 1998);
        map.put(new Person("cc", "23"), 1999);
        map.put(new Person("DD", "22"), 2000);
        map.put(new Person("dd", "29"), 2000);
        map.put(new Person("kk", "20"), 2002);
        //����
        System.out.println("1����Ȼ����");
        Set set = map.entrySet();
        for (Object obj : set
        ) {
            //��objǿתΪMap.Entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry);
        }
    }


    //2����������
    public void test05() {

        //ʵ��Comparator�ӿڲ���дcompare����,��������
      /*  Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer) {
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0) {
                        return c1.getName().compareTo(c2.getName());//����0��˵��idһ�£�idһ��������£��ǾͰ������ֵ�ASCII��������
                    }return i;
                }
                return 0;
            }
        };*/
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer) {
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0) {
                        return c1.getName().compareTo(c2.getName());//����0��˵��idһ�£�idһ��������£��ǾͰ������ֵ�ASCII��������
                    }return i;
                }
                return 0;
            }
        });
        treeMap.put(new Customer("AA",45),23);
        treeMap.put(new Customer("BB",46),28);
        treeMap.put(new Customer("QQ",46),29);
        treeMap.put(new Customer("ZZ",49),30);


        //��������entrySet()
        System.out.println("2����������");
        Set set4 = treeMap.entrySet();
        for (Object obj : set4
        ) {
            //��objǿתΪMap.Entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry);
        }
    }


        public static void main (String[]args){
//        new TestTreeMap().test04();
            new TestTreeMap().test05();
        }

}
