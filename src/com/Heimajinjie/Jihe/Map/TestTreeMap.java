package com.Heimajinjie.Jihe.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*排序：1、自然排序：按照添加进Map中的元素的key的指定属性进行排序，要求：key必须是同一个类的对象！
实现Comarable接口的实现类，该类的对象，要重写compareTo方法 当向TreeMap添加Customer类的对象时，依据此方法，确定按照哪个属性排列。
2、定制排序：实现Comparator接口并重写compare方法案例 */
public class TestTreeMap {
    //1、自然排序
    public void test04() {
        Map map = new TreeMap();
        map.put(new Person("aa", "24"), 1998);
        map.put(new Person("cc", "23"), 1999);
        map.put(new Person("DD", "22"), 2000);
        map.put(new Person("dd", "29"), 2000);
        map.put(new Person("kk", "20"), 2002);
        //遍历
        System.out.println("1、自然排序：");
        Set set = map.entrySet();
        for (Object obj : set
        ) {
            //将obj强转为Map.Entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry);
        }
    }


    //2、定制排序：
    public void test05() {

        //实现Comparator接口并重写compare方法,定制排序
      /*  Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Customer && o2 instanceof Customer) {
                    Customer c1 = (Customer) o1;
                    Customer c2 = (Customer) o2;
                    int i = c1.getId().compareTo(c2.getId());
                    if (i == 0) {
                        return c1.getName().compareTo(c2.getName());//返回0，说明id一致，id一样的情况下，那就按照名字的ASCII码来排序
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
                        return c1.getName().compareTo(c2.getName());//返回0，说明id一致，id一样的情况下，那就按照名字的ASCII码来排序
                    }return i;
                }
                return 0;
            }
        });
        treeMap.put(new Customer("AA",45),23);
        treeMap.put(new Customer("BB",46),28);
        treeMap.put(new Customer("QQ",46),29);
        treeMap.put(new Customer("ZZ",49),30);


        //遍历采用entrySet()
        System.out.println("2、定制排序：");
        Set set4 = treeMap.entrySet();
        for (Object obj : set4
        ) {
            //将obj强转为Map.Entry
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry);
        }
    }


        public static void main (String[]args){
//        new TestTreeMap().test04();
            new TestTreeMap().test05();
        }

}
